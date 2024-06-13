package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
        glue = "steps",
        plugin = {"pretty", "html:target/cucumber-reports"})




public class TestRunner {
    //Limpiar la instancia del browser después de ejecutar los test
    @AfterClass
    public static void cleanDriver(){
    BasePage.CloseBrowser();
}

}
