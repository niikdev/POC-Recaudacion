package steps;

import io.cucumber.java.en.And;
import pages.LoginPage;

public class LoginPageSteps {

    LoginPage loginpage = new LoginPage();
    @And("Ingreso el nombre de usuario valido y la contraseña valida")
    public void SendRutandPass(){
        loginpage.sendTextRut();
        loginpage.sendTextPass();
    }

    @And("Presiono el botón Ingresar")
    public void Clickbtnloginpage(){
        loginpage.validateBtn();
        loginpage.clickbtnlogin();

    }

}
