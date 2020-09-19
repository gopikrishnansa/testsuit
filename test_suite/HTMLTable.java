package test_suite;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.text.AttributedCharacterIterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HTMLTable {
    @Test
    public void tableTest() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://testautomationpractice.blogspot.com");

        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        for (int i=0;i<5;i++) {
            List<WebElement> index = driver.findElements(By.xpath("//div[@class='widget-content']/table/tbody/tr/td[" + i + "]"));
            List<WebElement> index2 = driver.findElements(By.xpath("//div[@class='widget-content']/table/tbody/tr/th[" + i + "]"));


            for (WebElement webElement : index2){
                String name = webElement.getText();
                System.out.println(name);
                System.out.println("---------------");
            }
            for (WebElement webElement : index) {

                String name = webElement.getText();
                System.out.println(name);


            }


            System.out.println("  ");
        }




        driver.quit();
    }

}
