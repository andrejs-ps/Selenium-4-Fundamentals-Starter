package uitest.m4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestDrive {

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver","path/to/driver");
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }
}
