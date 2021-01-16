package com.mcallydevelops.workflow;

public abstract class  WorkflowTask<I, R> {

    public Result<Exception, R> execute(Flow<I> r) {
        try {
            return run(r.getResult());
        } catch (Exception e) {
            return new Result<>(e, null);
        }
    }
    public Result<Exception, R> execute(Result<Exception, I> r) {
        try {
            return run(r.getResult());
        } catch (Exception e) {
            return new Result<>(e, null);
        }
    }
    public abstract Result<Exception, R> run(I i);

    public abstract void rollback(I i);

}
