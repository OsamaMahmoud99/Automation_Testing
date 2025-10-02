import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {

    private HomePage homePage;

    private RegisterPage registerPage;

    @Test
    public void ValidRegisterTC() {
        homePage = new HomePage(driver);
        homePage.ClickOnRegisterButton();
    }
}
