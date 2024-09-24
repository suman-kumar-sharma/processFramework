package com.scoreme.processframework.step;

import com.scoreme.processframework.core.Context;
import com.scoreme.processframework.exception.StepExecutionException;

public class AccountExistenceVerificationStep extends AbstractProcessStep<Context, Boolean> {
    @Override
    public Boolean execute(Context context) throws StepExecutionException {
        System.out.println("Account checking initiated................");
        // there will be logic to check weather account exist or not
        context.set("accountExist", true);// if account exist in the db or else set false and return false as response
        return true;
    }
}
