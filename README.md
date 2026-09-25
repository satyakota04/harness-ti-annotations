# harness-ti-annotations

Customer-facing annotation for Harness Test Intelligence. Put this jar on the test compile classpath and mark test methods that must run on every build, including when Test Intelligence would otherwise skip them.

The Java agent does not depend on this jar. It matches the annotation type name `io.harness.agent.sdk.HarnessAlwaysRun`.

```xml
<dependency>
  <groupId>io.harness</groupId>
  <artifactId>harness-ti-annotations</artifactId>
  <version>1.0.0</version>
  <scope>test</scope>
</dependency>
```

```java
import io.harness.agent.sdk.HarnessAlwaysRun;
import org.junit.jupiter.api.Test;

class PaymentTest {
  @Test
  @HarnessAlwaysRun
  void criticalPath() {}
}
```

`@HarnessAlwaysRun` is valid on methods only and is retained at runtime.

```bash
mvn test
mvn package
```
