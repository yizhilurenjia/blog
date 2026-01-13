package org.example.blogbehind.utils;


import org.example.blogbehind.enity.ResponseMessage;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice //表明 全局异常处理
public class GlobalExceptionHandler {



    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseMessage exception(Exception e) {
        e.printStackTrace();
        System.err.println("GlobalExceptionHandler------------------------------");
        return ResponseMessage.error(StringUtils.hasLength(e.getMessage())?e.getMessage():"操作失败");
    }
}
