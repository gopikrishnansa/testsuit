package test_suite;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class doubleClick {
    @Test
    public void doubleClickTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://testautomationpractice.blogspot.com");
        driver.manage().window().maximize();
        WebElement button = driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
        System.out.println(button.isDisplayed());
        Thread.sleep(3000);

        Actions action = new Actions(driver);
        action.doubleClick(button).perform();
        Thread.sleep(2000);
        WebElement status = driver.findElement(By.xpath("//input[@id='field2']"));
        String show = status.getText();
        System.out.println(show);
        Thread.sleep(3000);
        driver.quit();
    }
}
