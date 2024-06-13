package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AdministradordeEmpresasPage;

public class AdministradordeEmpresasSteps {

    AdministradordeEmpresasPage modifydata = new AdministradordeEmpresasPage();
    @Given("Estoy en el menú de actualización de datos")
    public void ValidatePage(){
        modifydata.ValidateH2();
    }
    @When("Selecciono Modificación datos Empresa")
    public void Clickmodifydataempresa(){
        modifydata.ClickModifybtn();
    }
}
