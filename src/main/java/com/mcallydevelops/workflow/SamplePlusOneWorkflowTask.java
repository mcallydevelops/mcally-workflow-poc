package com.mcallydevelops.workflow;

public class SamplePlusOneWorkflowTask extends WorkflowTask<Integer, Integer> {
    @Override
    public Result<Exception, Integer> run(Integer integer) {
        return new Result<>(null, integer + 1);
    }

    @Override
    public void rollback(Integer integer) {
    }
}
