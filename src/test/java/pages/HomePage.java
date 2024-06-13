package pages;

public class HomePage extends BasePage{


    private String loginBtn = "//a[normalize-space()='Ingresar Aquí']";

    public HomePage(){
        super(driver);
    }

    public void navigateToPrevired(){
        navigateTo("https://qa1.previred.com/");

    }


    public void clickOnIngresarAqui(){
        clickElement(loginBtn);
    }

}
