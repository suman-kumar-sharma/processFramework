package com.scoreme.processframework.onboard;

import com.scoreme.processframework.core.Context;
import com.scoreme.processframework.core.Process;
import com.scoreme.processframework.core.ProcessStep;
import com.scoreme.processframework.exception.StepExecutionException;

import java.util.ArrayList;
import java.util.List;

/**
 * The type User onboarding process.
 */
public class UserOnboardingProcess implements Process<Context, Boolean> {
    private List<ProcessStep<Context, Boolean>> steps;

    private UserOnboardingProcess(List<ProcessStep<Context, Boolean>> steps) {
        this.steps = steps;
    }

    @Override
    public Boolean execute(Context context) {
        for (ProcessStep<Context, Boolean> step : steps) {
            try {
                System.out.println("Executing step: " + step.getName());
                step.execute(context);
            } catch (StepExecutionException e) {
                System.err.println("Error in step: " + step.getName() + " - " + e.getMessage());
                return false;
            }
        }
        return true;
    }

    @Override
    public String getName() {
        return "User Onboarding Process";
    }

    /**
     * The type Builder.
     */
    public static class Builder {
        private List<ProcessStep<Context, Boolean>> steps = new ArrayList<>();

        /**
         * Add step builder.
         *
         * @param step the step
         * @return the builder
         */
        public Builder addStep(ProcessStep<Context, Boolean> step) {
            steps.add(step);
            return this;
        }

        /**
         * Build user onboarding process.
         *
         * @return the user onboarding process
         */
        public UserOnboardingProcess build() {
            return new UserOnboardingProcess(steps);
        }
    }
}
