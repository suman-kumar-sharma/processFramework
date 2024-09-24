package com.scoreme.processframework.step;

import com.scoreme.processframework.core.Context;
import com.scoreme.processframework.exception.StepExecutionException;

/**
 * The type Email onboarding step.
 */
public class EmailOnboardingStep extends AbstractProcessStep<Context,Boolean> {
    @Override
    public Boolean execute(Context context) throws StepExecutionException {
        System.out.println("Email Onboarding...........");
        context.set("emailOnboarded",true);
        return true;
    }
}
