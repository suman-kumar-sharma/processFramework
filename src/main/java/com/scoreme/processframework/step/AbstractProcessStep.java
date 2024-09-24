package com.scoreme.processframework.step;

import com.scoreme.processframework.core.Context;
import com.scoreme.processframework.core.ProcessStep;

/**
 * The type Abstract process step.
 *
 * @param <C> the type parameter
 * @param <R> the type parameter
 */
public abstract class AbstractProcessStep<C extends Context, R> implements ProcessStep<C, R> {
    @Override
    public String getName() {
        //System.out.println(this.getClass().getSimpleName());
        return this.getClass().getSimpleName();
    }
}
