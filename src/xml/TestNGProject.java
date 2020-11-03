package xml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGProject {
    WebDriver driver;

    @BeforeClass
    void setupChrome() {
        System.setProperty("webdriver.chrome.driver", "C://Users//Krishna//Desktop//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @Test
    void titleTest() {
        System.out.println("The title of the website is: " + driver.getTitle().toString());
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM");
    }

    @Test
    void logoTest() {
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        System.out.println("The logo of OrangeHRM website is displayed");
        Assert.assertTrue(logo.isDisplayed());
    }
    @AfterClass
    void teardown() {
        driver.quit();
    }
}

