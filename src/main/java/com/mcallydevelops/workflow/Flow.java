package com.mcallydevelops.workflow;

public class Flow<R> {

    protected R result;

    public Flow(R result) {
        this.result = result;
    }

    public R getResult() {
        return result;
    }

}
