package purchaseOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class createPurchaseOrder extends purchaseClass {

    @Test()
    public void createPurchaseOrder() throws InterruptedException {

        driver.findElement(By.xpath("//*[text()='Procurment']")).click();
        driver.findElement(By.xpath("//div[@class='contents']//li[2]//span[text()='Create Purchase Order']")).click();
        Thread.sleep(5000);
        Select element = new Select(
                driver.findElement(By.xpath("//div[@class='form-group']//select[@name='supplier']")));
        element.selectByVisibleText("DERBA PAINT MANUFACTURING PLC");
        driver.findElement(By.xpath("//div[@class='col-sm-12']//textarea[@name='description']")).sendKeys("testin within script");
        Select ell = new Select(
                driver.findElement(By.xpath("//div[@class='duplicatedForm row']//select[@class='form-control']")));
        ell.selectByVisibleText("Hydrogen");
        driver.findElement(By.xpath("//div[@class='duplicatedForm row']//div[2]//input")).sendKeys("4");
        driver.findElement(By.xpath("//div[@class='card-body']//form//div[7]//button")).click();
        Thread.sleep(5000);
        System.out.println("purchase order created");
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
    @Test(dependsOnMethods = "createPurchaseOrder")
    public void approvePurchaseOrder() throws InterruptedException {

         driver.findElement(By.xpath("//*[text()='Finance']")).click();
         driver.findElement(By.xpath("//span[text()='Purchased Orders']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='card-body']//div//table//tbody//tr//td[6]//button")).click();
        Thread.sleep(500);
        System.out.println("purchase order Approved");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
    @Test(dependsOnMethods = "approvePurchaseOrder")
    public void  logisticDeliverPurchaseOrder() throws InterruptedException {
         driver.findElement(By.xpath("//*[text()='Logistics']")).click();
        driver.findElement(By.xpath("//ul[@class='nav flex-column']//div[5]//div//li[3]//span")).click();
        Thread.sleep(5000);
      driver.findElement(By.xpath("//div[@class='cr-page px-3 TablePage']//div[2]//div[2]//div//table//tbody//td[6]//button")).click();
        Thread.sleep(500);
        System.out.println("purchase order delivered");
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
    @Test(dependsOnMethods = "logisticDeliverPurchaseOrder")
    public void purchaseDeliveredToFinance() throws InterruptedException {
        driver.findElement(By.xpath("//*[text()='Finance']")).click();
        driver.findElement(By.xpath("//ul[@class='nav flex-column']//div//div//li[9]//span[text()='Delivered Orders']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='cr-page px-3']//div[2]//div//div//div[2]//table//tbody//tr//td[6]//button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("	//div[@class='card-body']//table//button")).click();
        Thread.sleep(500);
        System.out.println("purchase order invoiced");
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
    @Test(dependsOnMethods = "logisticDeliverPurchaseOrder")
    public void purchaseInventoryOder() throws InterruptedException {
      driver.findElement(By.xpath("//*[text()='Inventory']")).click();
        driver.findElement(By.xpath("//ul[@class='nav flex-column']//div[6]//div//li[4]//span")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='card-body']//div//table//tbody[1]//tr//td//button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='card-body']//div//table//tbody[1]//tr//td//button")).click();
        Thread.sleep(5000);
        System.out.println("purchase order recieved to inventiory");
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    }
