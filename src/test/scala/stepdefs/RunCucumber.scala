package stepdefs

import cucumber.api.junit.Cucumber
import cucumber.api.junit.Cucumber.Options
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@Options(
  features = Array("src/test/resources/features"),
  glue = Array("stepdefs"),
  format = Array("pretty", "html:target/cucumber-report"),
  tags = Array("@wip")
)
class RunCucumber {
}
