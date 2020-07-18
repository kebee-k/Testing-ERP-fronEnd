package manufactureOrder;

import itPackage.readExcelFile;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class createManufactureOrder extends manufactureBasesClass {
    @DataProvider
    public Iterator<Object[]> getData() {
        ArrayList<Object[]> testData = readExcelFile.readExcelData();
        return testData.iterator();

    }

    @Test(priority = 1, dataProvider = "getData")
    public void manufactureOrderTest(String quantity, String description,
                                     String startDate, String endDate) throws InterruptedException {

        driver.findElement(By.xpath("//*[text()='Manufacturing']")).click();
        driver.findElement(By.xpath("//ul[@class='nav flex-column']//div[8]//div//li[2]//span")).click();
        Thread.sleep(5000);
        Select element = new Select(
                driver.findElement(By.xpath("//div[@class='card-body']//form//div//div//div//div//select")));
        element.selectByVisibleText("Foam");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='card-body']//form//div[3]//div//div//input")).sendKeys(quantity);
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@class='card-body']//form//div[3]//div//textarea[@name='description']")).sendKeys(description);
        Thread.sleep(50);
        driver.findElement(
                By.xpath("//div[@class='card-body']//form//div[4]//div//div//div//input[@name='startDate']")).sendKeys(startDate);
        Thread.sleep(50);
        driver.findElement(
                By.xpath("//div[@class='card-body']//form//div[4]//div[2]//div//div//input[@name='endDate']")).sendKeys(endDate);
        Thread.sleep(50);
        driver.findElement(By.xpath("//div[@class='card-body']//form//div[5]//button")).click();
        System.out.println("manufacture order created");
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void manufactureAllOrderTest() throws InterruptedException {

        driver.findElement(By.xpath("//*[text()='Manufacturing']")).click();
        driver.findElement(By.xpath("//ul[@class='nav flex-column']//div[8]//div//li[3]//span")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='card-body']//div//table//tbody//tr//td[7]//button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='card-body']//div//table//tbody//tr//td[8]//button")).click();
        System.out.println("manufacture order dane");
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    @Test(priority = 3)
    public void manufactureQualityTest() throws InterruptedException {
        driver.findElement(By.xpath("//*[text()='Manufacturing']")).click();
        driver.findElement(By.xpath("//ul[@class='nav flex-column']//div[8]//div//li[4]//span")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='card-body']//div//table//tbody//tr//td[7]//button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='card-body']//div//table//tbody//tr//td[8]//button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='Confirm BOM']")).click();
        System.out.println("manufacture order dane");
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}

