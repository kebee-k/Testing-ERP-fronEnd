package itPackage;

import baseClass.basesClass;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class createAccount extends basesClass {

     @DataProvider
    public Iterator<Object[]> getData()
    {
      ArrayList<Object[]> testData = readExcelFile.readExcelData();
        return  testData.iterator();

    }
    @Test(dependsOnMethods = {"salesTest"},dataProvider = "getData")
    public void a_ManufactureTest(String username, String password) throws InterruptedException {

        driver.findElement(By.xpath("//*[text()='IT']")).click();
         driver.findElement(By.xpath("//*[text()='Manage Accounts']")).click();
         driver.findElement(By.xpath("//div[@class='card-body']//table[@class='table']//tbody//tr[1]//td//button")).click();
        Thread.sleep(30);
         driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        Thread.sleep(40);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        Thread.sleep(40);
        driver.findElement(By.xpath("//button[text()='Register Account']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
    @Test(dataProvider = "getData")
    public void salesTest(String username, String password) throws InterruptedException {

        driver.findElement(By.xpath("//*[text()='IT']")).click();
        driver.findElement(By.xpath("//*[text()='Manage Accounts']")).click();
        driver.findElement(By.xpath("//div[@class='card-body']//table[@class='table']//tbody//tr[1]//td//button")).click();
        Thread.sleep(30);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        Thread.sleep(40);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        Thread.sleep(40);
        driver.findElement(By.xpath("//button[text()='Register Account']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}
