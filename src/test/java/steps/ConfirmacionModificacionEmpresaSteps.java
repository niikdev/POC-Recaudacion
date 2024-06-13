package steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ConfirmacionModificacionEmpresaPage;
import pages.ModificaciondeEmpresaPage;

public class ConfirmacionModificacionEmpresaSteps {

    ConfirmacionModificacionEmpresaPage confirmacionEmpresa = new ConfirmacionModificacionEmpresaPage();
    ModificaciondeEmpresaPage modificacion = new ModificaciondeEmpresaPage();

    /*@Then("Then Valido si cambió la direccion")
    public void validarCambioDireccion(){
        System.out.println(modificacion.getValorEnviado());
    }*/
    @Then("Presiono Confirmar")
    public void clickbtnConfirmar(){
        //Assert.assertEquals(modificaciondeEmpresaPage.getValorEnviado(), confirmacionEmpresa.obtenerTextoConfirmCalle());
        //System.out.println(modificacion.getValorEnviado());
        confirmacionEmpresa.validateBtn();
        confirmacionEmpresa.clickbtnconfirmar();




    }


}
