package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.PagocotizacionesPage;

public class Steps {

    HomePage inicio = new HomePage();
    @Given("Abro el navegador y navego a la página de inicio")
    public void iNavigateToPrevired(){
        inicio.navigateToPrevired();
    }

    @When("Hago clic en Ingresar aquí")
    public void clickbtnlogin(){
        inicio.clickOnIngresarAqui();
    }


}
