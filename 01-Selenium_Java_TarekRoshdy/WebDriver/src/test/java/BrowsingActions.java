import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class BrowsingActions {

    WebDriver driver;

    @Test
    public void firstTest() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        navigation("https://www.nezamacademy.com");
        getCurrentURL();
        getTitle();
        maximize();
        getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        getWindowHandle();
        close();

        //iPadDimension();
        //driver.quit();
    }

    public void navigation(String url) {
        driver.navigate().to(url);
    }

    public void navigateBack() {
        driver.navigate().back();
    }

    public void navigateForward() {
        driver.navigate().forward();
    }

    public void navigateRefresh() {
        driver.navigate().refresh();
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void minimize() {
        driver.manage().window().minimize();
    }

    public void setPosition() {
        Point point = new Point(100, 100);
        driver.manage().window().setPosition(point);
    }

    public void iPhoneDimension() {
        Dimension dimension = new Dimension(390, 884);
        driver.manage().window().setSize(dimension);
    }

    public void iPadDimension() {
        Dimension dimension = new Dimension(1366, 1024);
        driver.manage().window().setSize(dimension);
    }

    public void fullScreen() {
        driver.manage().window().fullscreen();
    }

    public void getCurrentURL() {
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
    }

    public void getTitle() {
        String title = driver.getTitle();
        System.out.println("Current Page Title is: " + title);
    }

    public void getPageSource() {
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
    }

    public void getWindowHandle() {
        String windowHandle = driver.getWindowHandle();
        System.out.println("Window Handle is: " + windowHandle);
    }

    public void close() {
        driver.close();
    }

}
