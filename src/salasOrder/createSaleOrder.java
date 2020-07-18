package salasOrder;

import baseClass.basesClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class createSaleOrder extends basesClass {
    @Test(priority = 1)
    public void createSalesOrder() throws InterruptedException {

        driver.findElement(By.xpath("//*[text()='Sales']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@class='nav flex-column']//div[3]//div//li[2]//span")).click();
        Thread.sleep(1000);
        Select element = new Select(driver.findElement(By.xpath("//div[@class='card-body']//form//div//div//select")));
        Thread.sleep(2000);
        element.selectByVisibleText("NEFAS SILK PAINTS FACTORY");
        driver.findElement(By.xpath("//div[@class='card-body']//form//div[2]//div//input[@name='shipmentAddress']")).sendKeys("Addis Ababa");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='card-body']//form//div[3]//div//textarea")).sendKeys("testing description");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='card-body']//form//div[2]//div//input[@name='shipmentAddress']")).sendKeys("Addis Ababa");
        Thread.sleep(500);
        Select elm = new Select(driver.findElement(By.xpath("//div[@class='card-body']//form//div[5]//div//select")));
        Thread.sleep(2000);
        elm.selectByVisibleText("Foam");
        driver.findElement(By.xpath("//div[@class='card-body']//form//div[5]//div[2]//input")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='card-body']//form//div[5]//div[2]//input")).sendKeys("1");
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
