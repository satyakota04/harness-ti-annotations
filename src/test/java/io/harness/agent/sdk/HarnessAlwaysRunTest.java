package io.harness.agent.sdk;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HarnessAlwaysRunTest {

    @Test
    public void retentionIsRuntimeAndTargetIsMethod() {
        Retention retention = HarnessAlwaysRun.class.getAnnotation(Retention.class);
        Target target = HarnessAlwaysRun.class.getAnnotation(Target.class);

        assertEquals(RetentionPolicy.RUNTIME, retention.value());
        assertArrayEquals(new ElementType[] {ElementType.METHOD}, target.value());
    }
}
