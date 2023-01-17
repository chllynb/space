package com.levizheng.common.result;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author levi
 */


public class BaseResult<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = -2792556188993845048L;

    private Integer code;

    private String message;

    private T data;


}
