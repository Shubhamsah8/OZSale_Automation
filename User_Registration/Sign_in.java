package OZSale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Signin {
    public WebDriver driver;

    @Test
    public void login() throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://www.ozsale.com.au/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Login")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"__groot__\"]/div/div/div/div[1]/div[5]/div[2]/div/div[2]/div/div[2]/div[2]")).click();

        driver.findElement(By.xpath("//input[contains(@name, 'email')]")).sendKeys("shubhamsah086@gmail.com");
        driver.findElement(By.xpath("//input[contains(@name, 'password')]")).sendKeys("Helloshubham123#");

        driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).click();
    }
}
