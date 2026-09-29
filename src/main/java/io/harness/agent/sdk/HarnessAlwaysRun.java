package io.harness.agent.sdk;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a test class or method that Test Intelligence must run on every build.
 * The Java agent matches the binary name {@code io.harness.agent.sdk.HarnessAlwaysRun}.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface HarnessAlwaysRun {}
