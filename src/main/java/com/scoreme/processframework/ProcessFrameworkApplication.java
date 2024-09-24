package com.scoreme.processframework;

import com.scoreme.processframework.core.Context;
import com.scoreme.processframework.onboard.UserOnboardingProcess;
import com.scoreme.processframework.step.CredentialVerificationStep;
import com.scoreme.processframework.step.EmailOnboardingStep;
import com.scoreme.processframework.step.MobileOnboardingStep;

/**
 * The type Process framework application.
 */
public class ProcessFrameworkApplication {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Context context = new Context();

        // Create process dynamically using builder
        UserOnboardingProcess process = new UserOnboardingProcess.Builder()
                .addStep(new MobileOnboardingStep())
                .addStep(new CredentialVerificationStep("Aadhaar"))
                .addStep(new EmailOnboardingStep())
                .build();

        // Execute process
        process.execute(context);
    }
}