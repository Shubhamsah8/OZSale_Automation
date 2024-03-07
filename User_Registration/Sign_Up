package OZSale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateAccount {

    public WebDriver driver;

    @Test
    public void createAccount(){
        driver = new ChromeDriver();

        driver.get("https://www.ozsale.com.au/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Login")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@name, 'firstName')]")));

        driver.findElement(By.xpath("//input[contains(@name, 'firstName')]")).sendKeys("Shubham");
        driver.findElement(By.xpath("//input[contains(@name, 'lastName')]")).sendKeys("Shah");
        driver.findElement(By.xpath("//input[contains(@name, 'email')]")).sendKeys("shubhamsah086@gmail.com");
        driver.findElement(By.xpath("//input[contains(@name, 'password')]")).sendKeys("HelloShubh123");

        driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).click();




    }
}
