package pages;

public class LoginPage extends BasePage{


    private String labelRut = "//input[@id='web_rut2']";
    private String labelPass = "//input[@id='web_password']";

    private String loginbtn = "//button[@id='login']";

    public LoginPage(){
        super(driver);
    }

    public void sendTextRut(){
        SendKeys(labelRut, "59874721");
    }
    public void sendTextPass(){
        SendKeys(labelPass, "Prueba2022");
    }

    public void validateBtn(){
        elementIsDisplayed(loginbtn);
    }

    public void clickbtnlogin(){


        clickElement(loginbtn);
    }
}
