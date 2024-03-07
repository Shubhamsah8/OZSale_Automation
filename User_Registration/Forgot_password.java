package OZSale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ForgotPassword {

    public WebDriver driver;

    @Test
    public void forgotPassword() throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://www.ozsale.com.au/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Login")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"__groot__\"]/div/div/div/div[1]/div[5]/div[2]/div/div[2]/div/div[2]/div[2]")).click();

        driver.findElement(By.xpath("//*[@id=\"__groot__\"]/div/div/div/div[1]/div[5]/div[2]/div/div[2]/div/div[3]/form/button[3]")).click();
        driver.findElement(By.xpath("//input[contains(@name, 'email')]")).sendKeys("shubhamsah086@gmail.com");
        //driver.findElement(By.xpath("//input[contans(@type, 'submit')]")).click();
        driver.findElement(By.xpath("//*[@id=\"__groot__\"]/div/div/div/div[1]/div[5]/div[2]/div/div[1]/button")).click();
    }
}
