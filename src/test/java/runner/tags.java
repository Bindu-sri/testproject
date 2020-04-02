package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\bindu\\workspace\\cucumber\\features\\tags.feature",
glue={"login"},tags= {"@login and  @regression"},
plugin= {"pretty","html:target/cucumber-html-report"},monochrome = true)

public class tags {

}
