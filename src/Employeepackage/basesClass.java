package Employeepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class basesClass {
        public static WebDriver driver;
        @BeforeMethod
        public  void setUp(){
            System.setProperty("webdriver.gecko.driver", "/home/keby/Desktop/seleniumjava/geckodriver");
            driver = new FirefoxDriver();
            driver.get("https://sparta-erp.web.app/");
            System.out.println("start");
        }

        @AfterMethod
        void ProgramTermination()
        {
            driver.quit();
        }


}
