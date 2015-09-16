package stepdefs

import java.util.concurrent.TimeUnit

import cucumber.api.scala.{EN, ScalaDsl}
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.support.ui.{ExpectedConditions, FluentWait, Wait}
import org.openqa.selenium.{By, WebDriver}
import org.scalatest.Matchers

class MyFirstCucumberTest extends ScalaDsl with EN with Matchers {

  val driver = new FirefoxDriver()

  val fluentWait: Wait[WebDriver] = new FluentWait[WebDriver](driver)
    .withTimeout(6, TimeUnit.SECONDS)
    .pollingEvery(1, TimeUnit.SECONDS)

  Given( """^I have navigated to google$""") { () =>
    driver.navigate().to("http://www.google.com")
  }

  When( """^I search for "(.*?)"$""") { (searchTerm: String) =>
    driver.findElement(By.id("lst-ib")).sendKeys(searchTerm)
    driver.findElement(By.id("sblsbb")).click()
  }

  Then( """^the page title should be "(.*?)"$""") { (title: String) =>
    fluentWait.until(ExpectedConditions.titleIs(title))
  }

}
