package finance;

import baseClass.basesClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class addCustomer extends basesClass {
    @Test
    public  void  addNewCustomer() throws InterruptedException {
        driver.findElement(By.xpath("//ul[@class='nav flex-column']//span[text()='Finance']")).click();
        Thread.sleep(1000);
    }

}
