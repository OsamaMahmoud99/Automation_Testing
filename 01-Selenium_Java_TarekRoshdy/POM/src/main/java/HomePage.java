import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {

    By registerButton = By.xpath("//span[normalize-space()='Register']");
    By loginButton = By.xpath(" //span[normalize-space()='Log in']");
    WebElement registerButtonElement;
    WebElement loginButtonElement;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void ClickOnRegisterButton() {
        registerButtonElement = driver.findElement(registerButton);
        Clicking(registerButtonElement);
    }

    public void ClickOnLoginButton() {
        loginButtonElement = driver.findElement(loginButton);
        Clicking(loginButtonElement);
    }


}
