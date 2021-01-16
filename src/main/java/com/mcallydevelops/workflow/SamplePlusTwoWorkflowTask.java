package com.mcallydevelops.workflow;

public class SamplePlusTwoWorkflowTask extends WorkflowTask<Integer, Integer> {
    @Override
    public Result<Exception, Integer> run(Integer integer) {
        return new Result<>(null, integer + 2);
    }

    @Override
    public void rollback(Integer integer) {

    }
}
