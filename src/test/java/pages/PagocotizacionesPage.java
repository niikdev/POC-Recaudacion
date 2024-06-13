package pages;

public class PagocotizacionesPage extends BasePage{

    private String btningresarROLTE = "//li[@id='empresa']";

    public PagocotizacionesPage(){
        super(driver);
    }

    public void JoinToROLTE(){
        clickElement(btningresarROLTE);
    }
}
