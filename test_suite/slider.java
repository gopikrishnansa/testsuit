package test_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class slider {
    @Test
    public void sliderTest() throws InterruptedException {
        WebDriver driver =  new ChromeDriver();
        driver.get("http://testautomationpractice.blogspot.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(slider);
        Thread.sleep(3000);  Scanner read = new Scanner(System.in);

        for (int i=0; i<50;i++){
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
        /*
        Action test = actions.dragAndDropBy(slider,30,0).build();
        test.perform();
        System.out.println(slider.isDisplayed());*/
        Thread.sleep(3000);
        driver.quit();
    }
}
