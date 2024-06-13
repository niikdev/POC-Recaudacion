package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AdministradordeEmpresasPage;
import pages.ConfirmacionModificacionEmpresaPage;
import pages.ModificaciondeEmpresaPage;

public class ModificaciondeEmpresaSteps {
    ModificaciondeEmpresaPage modificacion = new ModificaciondeEmpresaPage();
    ConfirmacionModificacionEmpresaPage confirmacionEmpresa = new ConfirmacionModificacionEmpresaPage();
    @And("Actualizo la direccion {} de la empresa")
    public void updateData(String calle) throws InterruptedException{
        modificacion.changedata(calle);

    }



    @And("Presiono Siguiente paso")
    public void ClickbtnSiguientePaso(){
        modificacion.validateBtn();
        modificacion.clickSiguientePaso();
    }

    @Then("Valido si cambió la direccion")
    public void validateChange(){
        Assert.assertEquals(modificacion.getValorEnviado(), confirmacionEmpresa.obtenerTextoConfirmCalle());
    }
}
