# harness-ti-annotations

Customer-facing annotation for Harness Test Intelligence. Put this jar on the test compile classpath and mark test classes or methods that must run on every build, including when Test Intelligence would otherwise skip them.

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

@HarnessAlwaysRun
class PaymentTest {
  @Test
  void criticalPath() {}
}
```

`@HarnessAlwaysRun` is valid on a class or a method and is retained at runtime.

```bash
mvn test
mvn package
```
