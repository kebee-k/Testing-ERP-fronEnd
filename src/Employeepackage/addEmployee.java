package Employeepackage;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class addEmployee extends basesClass {

    @Test(dataProvider = "TestDataFeed")
    public void employeeTest(String username, String password) throws InterruptedException {
        System.out.println("driver "+driver);
        driver.findElement(By.name("username")).sendKeys(username);
        Thread.sleep(500);
        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(500);
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']")).click();
        Thread.sleep(5000);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        System.out.println("Login successful");

    }

    @DataProvider
    public Object[][] TestDataFeed() {
        readExcelData file = new readExcelData(
                "/home/keby/IdeaProjects/Testing-erp-frontEnd/src/dataLocater/ExcelRead.xlsx");
        int row = file.getRowCount(0);
        Object[][] Credential = new Object[row][2];
        for (int i = 0; i < row; i++) {
            Credential[i][0] = file.getData(0, i, 0);
            Credential[i][1] = file.getData(0, i, 1);
        }
        return Credential;
    }
}
