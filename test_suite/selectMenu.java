package test_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

public class selectMenu {

    @Test
    public void selectMenuTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://testautomationpractice.blogspot.com");
        driver.manage().window().maximize();
        Thread.sleep(5);
        WebElement dropList = driver.findElement(By.xpath("//select[@id='speed']"));
        Actions action = new Actions(driver);
        action.moveToElement(dropList);
        System.out.println(dropList.isDisplayed());
        Select drop = new Select(dropList);
        drop.selectByVisibleText("Faster");
        Thread.sleep(3000);
        driver.quit();

    }
}
