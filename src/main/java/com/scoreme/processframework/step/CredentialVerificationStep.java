package com.scoreme.processframework.step;

import com.scoreme.processframework.core.Context;
import com.scoreme.processframework.exception.StepExecutionException;

/**
 * The type Credential verification step.
 */
public class CredentialVerificationStep extends AbstractProcessStep<Context,Boolean> {

    private String credentialType;
    public CredentialVerificationStep(String credentialType){
       this.credentialType=credentialType;
    }
    @Override
    public Boolean execute(Context context) throws StepExecutionException {
        System.out.println("verifying credential: "+credentialType);
        context.set("credentialVerified",true);
        return true;
    }
}
