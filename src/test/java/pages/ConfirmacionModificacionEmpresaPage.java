package pages;

public class ConfirmacionModificacionEmpresaPage extends BasePage{

    private String ConfirmCalle = "//div[@id='conf_dir_calle']";
    private String btnConfirmar = "//span[@id='span_boton_aceptar']";


    public ConfirmacionModificacionEmpresaPage(){
        super(driver);
    }

    public void validateBtn(){
        elementIsDisplayed(btnConfirmar);
    }
    public void clickbtnconfirmar(){
        clickElement(btnConfirmar);

    }

    public String obtenerTextoConfirmCalle() {
        return textFromElement(ConfirmCalle);
    }
}
