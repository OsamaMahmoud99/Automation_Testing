

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

    ChromeDriver driver;

    @BeforeTest
    public void setUp() {
        System.out.println("This is before test");
    
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
    }

    @Test // Annotation that identifies a method as a test method.
    public void openURL() {
        System.out.println("This is a TestNG Demo");
    }

    @Test
    public void userLogin() {
        System.out.println("This is user login test");
    }

    @Test
    public void closeWebsite() {
        System.out.println("This is close website test");
    }

    @Test
    public void userCanBuyFromWebsite() {
        System.out.println("This is user can buy from website test");
    }   

    @AfterTest
    public void tearDown() {
        System.out.println("This is after test");
        driver.quit();
    }
}
