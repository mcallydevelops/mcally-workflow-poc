package com.mcallydevelops.workflow;

public class Result<Exception, R> extends Flow<R> {

    private Exception exception;

    public Result(Exception e, R result) {
        super(result);
        this.exception = e;
    }

    public Exception getException() {
        return exception;
    }
}
