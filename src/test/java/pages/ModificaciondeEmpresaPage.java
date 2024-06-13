package pages;

public class ModificaciondeEmpresaPage extends BasePage{

    private String labelCalle = "//p[normalize-space()='Calle']";
    private String inputCalle = "//input[@id='web_dir_calle']";

    private String btnSiguientePaso = "//button[@id='boton_aceptar']";

    public String valorEnviado;
    public String valorprueba = "hola";

    public ModificaciondeEmpresaPage(){
        super(driver);
    }

    public void changedata (String calle) throws InterruptedException{
        SendKeys(inputCalle,calle );
        valorEnviado = calle;
        Thread.sleep(3000);

    }

    public String getValorEnviado(){
        return valorEnviado;
    }
    public String getValorprueba(){
        return valorprueba;
    }

    public void validateBtn(){
        elementIsDisplayed(btnSiguientePaso);
    }
    public void clickSiguientePaso(){
        clickElement(btnSiguientePaso);
    }


}
