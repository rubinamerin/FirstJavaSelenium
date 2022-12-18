import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class SeleniumOne {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //driver find element (By.ByLinktext)
         driver.findElement(By.xpath("//input[@value='radio3']")).click();
         driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("Bangladesh");
         driver.findElement(By.xpath("//input[@name='checkBoxOption3']")).click();
         driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("merin");
       driver.findElement(By.xpath("//input[@name='show-hide']")).sendKeys("AHMED");
        //Aleart
       driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
        String aleartmsg = driver.switchTo().alert().getText();
        System.out.println(aleartmsg);
        driver.switchTo().alert().accept();

       //Thread.sleep(5000);

     WebElement scrollto  =driver.findElement(By.xpath("//button[@id='mousehover']"));
            JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",scrollto );




//driver.quit();
    }







}
