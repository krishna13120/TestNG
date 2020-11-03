package xml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

public class Count {
    WebDriver driver;

    @BeforeClass
    void setupChrome() {
        System.setProperty("webdriver.chrome.driver", "C://Users//Krishna//Desktop//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @Test
    void countImg(){
        List<WebElement> images= driver.findElements(By.tagName("img"));
        Integer count=0;
        for(WebElement i:images)
        {
            if(i.isDisplayed()){
                count++;
            }
        }
        System.out.println("Number of displayed images are: " + count);
    }
    @Test
    void countButton(){
        List<WebElement> buttons=driver.findElements(By.className("button"));
        Integer btn=0;
        for(WebElement i:buttons){
            if(i.isDisplayed()){
                btn++;
            }
        }
        System.out.println("Number of displayed buttons are: " + btn);
    }
    @AfterClass
    void teardown() {
        driver.quit();
    }
}
