package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.BasePage;

public class Hooks extends BasePage {

    public Hooks(){
        super(driver);
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            scenario.log("El escenario falló, por favor revisa la imagen adjuntada al reporte");
        final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "Screenshot del error");

        }


    }
}
