package pages;

import org.junit.Assert;

public class AdministradordeEmpresasPage  extends BasePage{

    private String btnmodifyData = "//button[@id='modifica@76486253@00']";
    private String titleh2 = "//h2[normalize-space()='Administrador de Empresas']";


    public AdministradordeEmpresasPage(){
        super(driver);
    }

    public void ClickModifybtn(){
        clickElement(btnmodifyData);
    }

    public void ValidateH2(){

        Assert.assertEquals("Administrador de Empresas", textFromElement(titleh2));
    }
}
