package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"StepDefinations"},
monochrome = true,
//plugin={"pretty","html:target/HtmlReports/report.html"}
//plugin={"pretty","json:target/JSONReports/report.json"}
plugin={"pretty","junit:target/JUnitReports/report.xml"},
tags="@SmokeTest"
)
public class TestRunner {

}
