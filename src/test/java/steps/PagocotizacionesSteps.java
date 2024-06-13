package steps;

import io.cucumber.java.en.Then;
import pages.BasePage;
import pages.PagocotizacionesPage;

public class PagocotizacionesSteps {

    PagocotizacionesPage pagocotizacionespage = new PagocotizacionesPage();

    @Then("Selecciono el ROL TE")
    public void ClickOnROLTE(){
        pagocotizacionespage.JoinToROLTE();
    }
}
