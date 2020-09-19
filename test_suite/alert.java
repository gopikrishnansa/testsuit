package test_suite;
import  org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class alert {
    @Test
    public void alertTest() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("http://testautomationpractice.blogspot.com");
    driver.manage().window().maximize();
    WebElement buttonAlert = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
    buttonAlert.click();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    Thread.sleep(3000);
    driver.switchTo().alert().accept();
    Thread.sleep(3000);
    String msg = driver.findElement(By.xpath("//p[@id='demo']")).getText();
    System.out.println(msg);
    Thread.sleep(3000);
    driver.quit();


    }
}
