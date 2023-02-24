package com.levizheng.space.common.exception;

import java.io.Serial;

/**
 * SpaceException
 *
 * @author levi
 */
public class SpaceException extends RuntimeException {


    @Serial
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
