package Employeepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class basesClass {
    public static WebDriver driver;
    WebElement username, password;

    @BeforeClass
    public void setUpBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/addiaba/selenium.jar/chromedriver_linux64/chromedriver");
        //  driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://localhost:3000/");
        System.out.println("start");
        username = driver.findElement(By.name("username"));
        username.sendKeys("admin");
        Thread.sleep(50);
        password = driver.findElement(By.name("password"));
        password.sendKeys("admin");
        Thread.sleep(50);
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']")).click();
        Thread.sleep(5000);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    @AfterClass
    void closeBrowser() {
        driver.quit();
    }


}
