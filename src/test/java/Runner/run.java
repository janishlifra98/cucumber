package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/resources/eg1.feature"},glue="stepdefinition",plugin="html:target/htmlreport")
//@CucumberOptions(features={"src/main/resources/eg4.feature"},glue="stepdefinition",plugin="json:target/cucumber.json")
//@CucumberOptions(features={"src/main/resources/eg4.feature"},glue="stepdefinition",plugin="junit:target/xmlreport.xml")
//tags={"@regression"})
//tags={"@smoke","@regression"})


public class run {

}
