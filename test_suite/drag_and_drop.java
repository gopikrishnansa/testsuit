package test_suite;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;
@Test
public class drag_and_drop {

    public void dragAndDrop() throws InterruptedException {

        WebDriver driver =  new ChromeDriver();
        driver.get("http://testautomationpractice.blogspot.com");
        driver.manage().window().maximize();
        String siteTitle = driver.getTitle();
        System.out.println("name of current window is : "+ siteTitle );
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Thread.sleep(3000);
        WebElement draggable = driver.findElement(By.id("draggable"));
        boolean statusDraggable = draggable.isDisplayed();
        WebElement droppable = driver.findElement(By.id("droppable"));
        boolean statusDroppable = draggable.isDisplayed();

        System.out.println("status of the draggable element ; "+statusDraggable );
        System.out.println("status of the droppable element ; "+statusDroppable );
        Actions action = new Actions(driver);
        action.dragAndDrop(draggable,droppable).perform();
        WebElement actionStatus = driver.findElement(By.xpath("//div[@id='droppable']/p"));
        String StatusOfAction = actionStatus.getText();
        System.out.print(StatusOfAction);
        String compare = "Dropped!";

        if (StatusOfAction == compare ) {
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }
    Thread.sleep(3000);
    driver.quit();

    }




}
