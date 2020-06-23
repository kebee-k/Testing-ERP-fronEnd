package Employeepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class addEmployee {

        WebDriver driver;
        WebElement categories, subMenu, username, password, add, all, at, can, loginBt, course;

        @BeforeMethod
        public void loginPage() {
            System.out.println("before start");
            System.setProperty("webdriver.chrome.driver", "/home/keby/Desktop/seleniumjava/chromedriver_linux64 (1)/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        }

        @Test
        public void a_SaleTest() throws InterruptedException {
            driver.get("https://sparta-erp.web.app/");
            username = driver.findElement(By.name("username"));
            username.sendKeys("admin");
            password = driver.findElement(By.name("password"));
            password.sendKeys("admin");
            loginBt = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']"));
            loginBt.click();
            categories = driver.findElement(By.xpath("//*[text()='HR']"));
            categories.click();
            subMenu = driver.findElement(By.xpath("//*[text()='Dashboard']"));
            subMenu.click();
            Thread.sleep(5);
            all = driver.findElement(By.xpath("//*[text()='All Employees']"));
            all.click();
            Thread.sleep(1);
            course = driver.findElement(By.xpath("//*[text()='Add Employee']"));
            course.click();
            Thread.sleep(1000);
            at = driver.findElement(By.xpath("//div[@class='card-body']"));
            at.click();
            add = driver.findElement(By.xpath("//input[@name='firstName']"));
            add.sendKeys("kebe");
            add = driver.findElement(By.xpath("//input[@name='lastName']"));
            add.sendKeys("kebee");
            Thread.sleep(10);
            add = driver.findElement(By.xpath("//input[@name='email']"));
            add.sendKeys("sale@test.com");
            Thread.sleep(10);
            add = driver.findElement(By.xpath("//input[@name='telephone']"));
            add.sendKeys("0978096867");
            add = driver.findElement(By.xpath("//input[@name='birthDate']"));
            add.sendKeys("20/6/2020");
            Select element = new Select(driver.findElement(By.xpath("//div[@class='form-group']//select[@name='gender']")));
            element.selectByVisibleText("Male");
            Select ell = new Select(driver
                    .findElement(By.xpath("//div[@class='row']//div[@class='col-md-4']//select[@class='form-control']")));
            ell.selectByVisibleText("Sales");
            Thread.sleep(10);
            Select ell2 = new Select(
                    driver.findElement(By.xpath("//div[@class='row']//div[@class='col-md-4']//select[@id='test']")));
            ell2.selectByVisibleText("Sales Representative");
            Thread.sleep(10);
            Select ell22 = new Select(
                    driver.findElement(By.xpath("//div[@class='row']//div[@class='col-md-4']//select[@id='test1']")));
            ell22.selectByVisibleText("Junior");
            Thread.sleep(10);
            can = driver.findElement(By.xpath("//div[@class='row']//input[@name='hiredDate']"));
            can.sendKeys("6-6-2020");
            Select ell3 = new Select(driver.findElement(
                    By.xpath("//div[@class='row']//div[@class='col-sm-12']//select[@name='termOfEmployment']")));
            ell3.selectByVisibleText("Permanent");
            Select ell4 = new Select(
                    driver.findElement(By.xpath("//div[@class='row']//div[@class='col-sm-12']//select[@name='country']")));
            ell4.selectByVisibleText("Ethiopia");
            Select ell5 = new Select(
                    driver.findElement(By.xpath("//div[@class='row']//div[@class='col-sm-12']//select[@name='region']")));
            ell5.selectByVisibleText("Amhara");
            Select ell6 = new Select(
                    driver.findElement(By.xpath("//div[@class='row']//div[@class='col-sm-12']//select[@name='city']")));
            ell6.selectByVisibleText("Gondar");
            add = driver.findElement(By.xpath("//button[text()='Add Employee']"));
            add.click();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

        @AfterMethod
        public void lastly() {
            System.out.print("good");
            driver.quit();

        }

    }


