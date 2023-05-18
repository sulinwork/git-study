package com.sulin.gitstudy.vo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ApiVO<T> {
    private Integer code;
    private String message;
    private T data;

    public static <T> ApiVO<T> ok(T data) {
        return new ApiVO<T>().setCode(0).setMessage("success").setData(data);
    }

    public static <T> ApiVO<T> ok() {
        return new ApiVO<T>().setCode(0).setMessage("success");
    }

    public static <T> ApiVO<T> error(String message) {
        return new ApiVO<T>().setCode(4000).setMessage(message);
    }
}
