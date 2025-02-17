package com.w.t.common.core.exception;

import lombok.Data;

@Data
public class BaseException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String module;

    private String code;

    private Object[] args;

    private String defaultMessage;

    public BaseException(String module, String code, Object[] args, String defaultMessage) {
        this.module = module;
        this.code = code;
        this.args = args;
        this.defaultMessage = defaultMessage;
    }

    public BaseException(String module, String code, Object[] args) {

        this(module, code, args, null);

    }

    public BaseException(String module, String defaultMessage) {

        this(module, null, null, defaultMessage);

    }

    public BaseException(String code, Object[] args) {
        this(null, code, args, null);
    }

    public BaseException(String defaultMessage) {
        this(null, null, null, defaultMessage);
    }

}
