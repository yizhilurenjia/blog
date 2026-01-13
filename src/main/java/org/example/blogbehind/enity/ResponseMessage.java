package org.example.blogbehind.enity;

public class ResponseMessage<T>
{
    private int code;//状态码 0响应成功  1响应失败
    private String message; // 响应信息
    private T data;// 响应数据

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code=code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message=message;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data=data;
    }

    public ResponseMessage(int code, String message, T data)
    {
        this.code=code;
        this.message=message;
        this.data=data;
    }

    //成功并返回数据
    public static <T>ResponseMessage<T> success(T data) {
        return new ResponseMessage<>(0,"success",data);
    }

    //成功 无返回数据
    public static ResponseMessage success() {
        return new ResponseMessage<>(0,"success",null);
    }

    //错误 响应1 信息 无返回数据
    public static ResponseMessage error(String message) {
        return new ResponseMessage<>(1,message,null);
    }
}
