package com.scoreme.processframework.core;

import com.scoreme.processframework.exception.StepExecutionException;

public interface ProcessStep<C extends Context, R> {

    R execute(C context) throws StepExecutionException;

    String getName();
}
