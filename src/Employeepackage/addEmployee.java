package Employeepackage;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class addEmployee extends basesClass {

    @Test(dataProvider = "TestDataFeed")
    public void employeeTest(String firstName, String lastName,  String email,
                             String telephone, String birthDate,String hiredDate) throws InterruptedException {

        // System.out.println("driver "+driver);
        driver.findElement(By.xpath("//*[text()='HR']")).click();
        Thread.sleep(50);
        driver.findElement(By.xpath("//*[text()='Dashboard']")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("//*[text()='All Employees']")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("//*[text()='Add Employee']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//div[@class='card-body']")).click();
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName);
        Thread.sleep(200);
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastName);
        Thread.sleep(200);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys(telephone);
        Thread.sleep(200);
        driver.findElement(By.xpath("//input[@name='birthDate']")).sendKeys(birthDate);
        Thread.sleep(200);
        Select element = new Select(driver.findElement(By.xpath("//div[@class='form-group']//select[@name='gender']")));
        element.selectByVisibleText("Male");
        Thread.sleep(300);
        Select ell = new Select(driver.findElement(By.xpath("//div[@class='row']//div[@class='col-md-4']//select[@class='form-control']")));
        ell.selectByVisibleText("Finance");
        Thread.sleep(300);
        Select ell2 = new Select(driver.findElement(By.xpath("//div[@class='row']//div[@class='col-md-4']//select[@id='test']")));
        ell2.selectByVisibleText("Junior Accountant");
        Thread.sleep(300);
        Select ell22 = new Select(driver.findElement(By.xpath("//div[@class='row']//div[@class='col-md-4']//select[@id='test1']")));
        ell22.selectByVisibleText("Junior");
        driver.findElement(By.xpath("//div[@class='row']//input[@name='hiredDate']")).sendKeys(hiredDate);
        Thread.sleep(200);
        Select ell3 = new Select(driver.findElement(
                By.xpath("//div[@class='row']//div[@class='col-sm-12']//select[@name='termOfEmployment']")));
        ell3.selectByVisibleText("Permanent");
        Select ell4 = new Select(
                driver.findElement(By.xpath("//div[@class='row']//div[@class='col-sm-12']//select[@name='country']")));
        ell4.selectByVisibleText("Ethiopia");
        Thread.sleep(300);
        Select ell5 = new Select(
                driver.findElement(By.xpath("//div[@class='row']//div[@class='col-sm-12']//select[@name='region']")));
        ell5.selectByVisibleText("Amhara");
        Thread.sleep(300);
        Select ell6 = new Select(
                driver.findElement(By.xpath("//div[@class='row']//div[@class='col-sm-12']//select[@name='city']")));
        ell6.selectByVisibleText("Gondar");
        Thread.sleep(300);
        driver.findElement(By.xpath("//button[text()='Add Employee']")).click();
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
        Object[][] Credential = new Object[row][6];
        for (int i = 0; i < row; i++) {

            Credential[i][0] = file.getData(0, i, 0);
            Credential[i][1] = file.getData(0, i, 1);
            Credential[i][2] = file.getData(0, i, 2);
            Credential[i][3] = file.getData(0, i, 3);
            Credential[i][4] = file.getData(0, i, 4);
            Credential[i][5] = file.getData(0, i, 5);
        }
        return Credential;
    }
}
