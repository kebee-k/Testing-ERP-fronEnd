package Employeepackage;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Random;

public class addEmployee extends basesClass {

    @Test
    public void addEmployeeToFinanceDept() throws InterruptedException {
        readExcelData eat = new readExcelData(
                "/home/addiaba/Testing-ERP-fronEnd/src/dataLocater/ExcelRead.xlsx");
        int rowCount = eat.getRowCount(2);
        for (int rowNUm = 1; rowNUm <= rowCount; rowNUm++) {
            Random random = new Random();
            int val = random.nextInt(100);
            String firstName = eat.getData(2, 1, 0);
            String lastName = eat.getData(2, 1, 1);
            String email = eat.getData(2, 1, 2);
            String Email = "ke"+val + email;
            String telephone = eat.getData(2, 1, 3);
            String Phone = telephone + val;
            String birthDate = eat.getData(2, 1, 4);
            String hiredDate = eat.getData(2, 1, 5);

            // System.out.println("driver "+driver);
            driver.findElement(By.xpath("//*[text()='HR']")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[text()='Dashboard']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[text()='All Employees']")).click();
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[text()='Add Employee']")).click();
            Thread.sleep(6000);
            driver.findElement(By.xpath("//div[@class='card-body']")).click();
            driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName);
            Thread.sleep(200);
            driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastName);
            Thread.sleep(200);
            driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Email);
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys(Phone);
            Thread.sleep(200);
            driver.findElement(By.xpath("//input[@name='birthDate']")).sendKeys(birthDate);
            Thread.sleep(800);
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
            Thread.sleep(200);
            driver.findElement(By.xpath("//div[@class='row']//input[@name='hiredDate']")).sendKeys(hiredDate);
            Thread.sleep(2000);
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
            Thread.sleep(4000);
            Boolean status = driver.findElement(By.xpath("//div[@class='cr-page px-3 TablePage']//div//div//div//div[2]//div//table//tbody//tr//td")).isDisplayed();
            Assert.assertTrue(status);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            System.out.println("Login successful");

        }
    }
    @Test
    public void  addEmployeeToSaleDept() throws InterruptedException {
        readExcelData eat = new readExcelData(
                "/home/keby/IdeaProjects/Testing-erp-frontEnd/src/dataLocater/ExcelRead.xlsx");
        int rowCount = eat.getRowCount(2);
        for (int rowNUm = 1; rowNUm <= rowCount; rowNUm++) {
            Random random = new Random();
            int val = random.nextInt(100);
            String firstName = eat.getData(2, 1, 0);
            String lastName = eat.getData(2, 1, 1);
            String email = eat.getData(2, 1, 2);
            String Email = "ke" + val + email;
            String telephone = eat.getData(2, 1, 3);
            String Phone = telephone + val;
            String birthDate = eat.getData(2, 1, 4);
            String hiredDate = eat.getData(2, 1, 5);

            driver.findElement(By.xpath("//*[text()='HR']")).click();
            driver.findElement(By.xpath("//*[text()='Dashboard']")).click();
            Thread.sleep(5);
            driver.findElement(By.xpath("//*[text()='All Employees']")).click();
            Thread.sleep(1);
            driver.findElement(By.xpath("//*[text()='Add Employee']")).click();
            Thread.sleep(1);
            driver.findElement(By.xpath("//div[@class='card-body']")).click();
            driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName);
            driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastName);
            Thread.sleep(10);
            driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Email);
            Thread.sleep(10);
            driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys(Phone);
            driver.findElement(By.xpath("//input[@name='birthDate']")).sendKeys(birthDate);
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
            driver.findElement(By.xpath("//div[@class='row']//input[@name='hiredDate']")).sendKeys(hiredDate);
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
            driver.findElement(By.xpath("//button[text()='Add Employee']")).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        }
    }

}
