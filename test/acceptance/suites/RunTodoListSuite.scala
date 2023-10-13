package acceptance.suites

import io.cucumber.junit.{Cucumber, CucumberOptions}
import org.junit.runner.RunWith


@RunWith(classOf[Cucumber])
@CucumberOptions(
  dryRun = false,
  monochrome = false,
  features = Array("test/acceptance/features/"),
  glue = Array("acceptance.pageStepDef"),
  plugin = Array("pretty", "html:target/cucumber", "json:target/cucumber.json"),
  tags = "@todo and not @ignore"
)
class RunTodoListSuite


