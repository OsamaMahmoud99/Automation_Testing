import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends PageBase {

    private By FirstName = By.id("FirstName");

    private By LastName = By.id("LastName");

    private By Email = By.id("Email");

    private By ConfirmEmail = By.id("ConfirmEmail");

    private By UserName = By.id("Username");

    private By Password = By.id("Password");

    private By ConfirmPassword = By.id("ConfirmPassword");

    private By CompanyPrimarily = By.xpath("//select[@id='Details_CompanyIndustryId']");

    private By CompanyRole = By.xpath("//select[@id='Details_CompanyRoleId']");

    private By CompanySize = By.xpath("//select[@id='Details_CompanySizeId']");

    private WebElement firstNameElement;
    private WebElement lastNameElement;
    private WebElement EmailElement;
    private WebElement ConfirmEmailElement;
    private WebElement UserNameElement;
    private WebElement PasswordElement;
    private WebElement ConfirmPasswordElement;
    private WebElement CompanyPrimElement;
    private WebElement CompanyRoleElement;
    private WebElement CompanySizeElement;

    private Select select;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void EnterFirstName(String fName) {

        firstNameElement = driver.findElement(FirstName);
        sendText(firstNameElement, fName);
    }

    public void EnterLastName(String lName) {

        lastNameElement = driver.findElement(LastName);
        sendText(lastNameElement, lName);
    }

    public void EnterEmail(String email) {
        EmailElement = driver.findElement(Email);
        sendText(EmailElement, email);
    }

    public void EnterConfirmEmail(String ConfirmedEmail) {
        ConfirmEmailElement = driver.findElement(ConfirmEmail);
        sendText(ConfirmEmailElement, ConfirmedEmail);
    }

    public void EnterUserName(String username) {
        UserNameElement = driver.findElement(UserName);
        sendText(UserNameElement, username);
    }

    public void Enterpassword(String password) {
        PasswordElement = driver.findElement(Password);
        sendText(PasswordElement, password);
    }

    public void EnterConfirmpassword(String confirmedpassword) {
        ConfirmPasswordElement = driver.findElement(ConfirmPassword);
        sendText(ConfirmPasswordElement, confirmedpassword);
    }

    public void SelectCompanyprim(int index) {
        CompanyPrimElement = driver.findElement(CompanyPrimarily);
        select = new Select(CompanyPrimElement);
        select.selectByIndex(index);
    }

    public void SelectCompanyRole(int index) {
        CompanyRoleElement = driver.findElement(CompanyRole);
        select = new Select(CompanyRoleElement);
        select.selectByIndex(index);
    }

    public void SelectCompanySize(int index) {
        CompanySizeElement = driver.findElement(CompanySize);
        select = new Select(CompanySizeElement);
        select.selectByIndex(index);
    }

}
