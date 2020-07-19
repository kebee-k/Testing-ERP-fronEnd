package salasOrder;

import baseClass.basesClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;


public class createSaleOrder extends basesClass {
    @DataProvider
    public Iterator<Object[]> getData() {
        ArrayList<Object[]> testData = readExcelFile.readExcelFile();
        return testData.iterator();
    }

    @Test(dataProvider = "getData", priority = 1)
    public void createSalesOrder(String customer, String desc,
                                 String address, String order, String quantity) throws InterruptedException {

        driver.findElement(By.xpath("//*[text()='Sales']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@class='nav flex-column']//div[3]//div//li[2]//span")).click();
        Thread.sleep(1000);
        Select element = new Select(driver.findElement(By.xpath("//div[@class='card-body']//form//div//div//select")));
        Thread.sleep(2000);
        element.selectByVisibleText(customer);
        driver.findElement(By.xpath("//div[@class='card-body']//form//div[2]//div//input[@name='shipmentAddress']"))
                .sendKeys(desc);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='card-body']//form//div[3]//div//textarea")).
                sendKeys(address);
        Thread.sleep(1000);
       // driver.findElement(By.xpath("//div[@class='card-body']//form//div[2]//div//input[@name='shipmentAddress']"))
         //       .sendKeys(address);
        Thread.sleep(500);
        Select elm = new Select(driver.findElement(By.xpath("//div[@class='card-body']//form//div[5]//div//select")));
        Thread.sleep(2000);
        elm.selectByVisibleText(order);
        driver.findElement(By.xpath("//div[@class='card-body']//form//div[5]//div[2]//input")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='card-body']//form//div[5]//div[2]//input")).sendKeys(quantity);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='card-body']//form//div[8]//button")).click();
        Thread.sleep(5);
        System.out.println("sale order created");
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void checksSaleOrderExistenceOfMaterialOnStock() throws InterruptedException {
        driver.findElement(By.xpath("//ul[@class='nav flex-column']//span[text()='Inventory']")).click();
        driver.findElement(By.xpath("//ul[@class='nav flex-column']//div[6]//div//li[2]//span")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@class='card-body']//div//table//tbody[1]//tr//td[6]//button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='card-body']//div//table//tbody[1]//tr//td[6]//button")).click();
        Thread.sleep(5000);
        System.out.print("sale order approved .... ");
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    @Test(priority = 3)
    public void DeliverySaleOrder() throws InterruptedException {
        driver.findElement(By.xpath("//ul[@class='nav flex-column']//span[text()='Logistics']")).click();
        driver.findElement(By.xpath("//ul[@class='nav flex-column']//div[5]//div//li[2]//span")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@class='card-body']//div//table//tbody[4]//td[6]//button")).click();
        Thread.sleep(500);
        System.out.print("sale order deliverd.... ");
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void financeSaleTest() throws InterruptedException {
        driver.findElement(By.xpath("//ul[@class='nav flex-column']//span[text()='Finance']")).click();
        driver.findElement(By.xpath("//ul[@class='nav flex-column']//div[2]//div//li[8]//span")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@class='card-body']//div//table//tbody[6]//td[5]//button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='card-body']//div//table//tbody[6]//td[5]//button")).click();
        Thread.sleep(5000);
        System.out.print("sale order deliverd.... ");
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

}
