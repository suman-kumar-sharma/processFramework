package com.scoreme.processframework.step;

import com.scoreme.processframework.core.Context;
import com.scoreme.processframework.exception.StepExecutionException;

/**
 * The type Mobile onboarding step.
 */
public class MobileOnboardingStep extends AbstractProcessStep<Context, Boolean> {
    @Override
    public Boolean execute(Context context) throws StepExecutionException {

        System.out.println("Mobile Onboarding......");
        context.set("mobileOnboarded", true);
        return true;
    }
}
