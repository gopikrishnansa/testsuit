package test_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class tooltip {
    @Test
    public void tooltipTest() throws InterruptedException {
        WebDriver driver =  new ChromeDriver();
        driver.get("http://testautomationpractice.blogspot.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement tooltip = driver.findElement(By.id("age"));
        Actions action = new  Actions(driver);
        action.moveToElement(tooltip).perform();
        Thread.sleep(5000);
        driver.quit();

    }
}
