package purchaseOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class purchaseClass {
    public static WebDriver driver;
    WebElement username,password;

    @BeforeClass
    public  void setUpBrowser() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/home/keby/Desktop/seleniumjava/geckodriver");
        driver = new FirefoxDriver();
         driver.get("https://sparta-erp.web.app/");
       // driver.get("http://localhost:3000/");

        System.out.println("start");
        username= driver.findElement(By.name("username"));
        username.sendKeys("admin");
        Thread.sleep(50);
        password=driver.findElement(By.name("password"));
        password.sendKeys("admin");
        Thread.sleep(50);
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']")).click();
        Thread.sleep(5000);
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    @AfterClass
    public  void closeBrowser()
    {
        driver.quit();
    }

}
