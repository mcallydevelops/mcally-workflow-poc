package com.mcallydevelops;

import com.mcallydevelops.workflow.Flow;
import com.mcallydevelops.workflow.SamplePlusOneWorkflowTask;
import com.mcallydevelops.workflow.SamplePlusTwoWorkflowTask;
import com.mcallydevelops.workflow.WorkflowTask;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class WorkflowRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        WorkflowTask task = new SamplePlusOneWorkflowTask();
        WorkflowTask tas1 = new SamplePlusTwoWorkflowTask();
        var result = task.execute(new Flow(1));
        var result2 = tas1.execute(result);
        System.out.println();
    }
}
