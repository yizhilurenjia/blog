package org.example.blogbehind.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.blogbehind.utils.JwtUtil;
import org.example.blogbehind.utils.ThreadLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.Map;

@Component
public class LoginInterceptor implements HandlerInterceptor {
//拦截器, 除登录 注册行为都进行拦截(在WebConfig中配置)

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("Authorization");
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        try {
            //如果不经过登录前端传递无token 那么request.getHeader("Authorization")获取也为null
            Map<String, Object> map = JwtUtil.parseToken(token);//解析当前token, 如果null会报错直接401
            String username = map.get("username").toString();
            //由于修改密码后删除redis里的密码, 所以此时ops获取为null, so ops.get() 放后面
            if (!token.equals(ops.get(username))) {//如果不相等说明 当前token已经失效
                throw new RuntimeException("token已经失效"); // 抛出异常 401
            }
            ThreadLocalUtil.set(map);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            response.setStatus(401);
            return false;
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        ThreadLocalUtil.remove();
    }
}
