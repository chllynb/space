package com.levizheng.common.exception;

/**
 * SpaceException
 *
 * @author levi
 */
public class SpaceException extends RuntimeException {


    private static final long serialVersionUID = -3876782400712500480L;

    public SpaceException(Throwable cause) {
        super(cause);
    }

    public SpaceException(String message) {
        super(message);
    }

    public SpaceException(String message, Throwable cause) {
        super(message, cause);
    }
}
