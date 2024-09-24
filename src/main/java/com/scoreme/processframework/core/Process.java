package com.scoreme.processframework.core;

public interface Process<C extends Context, R> {
    R execute(C context);

    String getName();
}
