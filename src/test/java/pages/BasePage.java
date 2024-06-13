package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    static {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }
    //Constructor para levantar el driver
    public BasePage(WebDriver driver){
        BasePage.driver = driver;
    }
    public static void navigateTo(String url){
        driver.get(url);
    }
    //Cerrar la instancia de automatización
    public static void CloseBrowser(){

        driver.quit();
    }

    //Espera Global para todos los elementos
    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }
    //Método para realizar click a un elemento
    public void clickElement (String locator){
        Find(locator).click();
    }

    //Método para escribir dentro de un input
    public void SendKeys (String locator, String keysToSend){
        Find(locator).clear();
        Find(locator).sendKeys(keysToSend);
    }
    //Obtengo un texto
    public String textFromElement (String locator){
        return Find(locator).getText();
    }

    public boolean elementIsDisplayed(String locator){
        return Find(locator).isDisplayed();
    }

}
