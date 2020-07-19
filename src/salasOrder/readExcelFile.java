package salasOrder;

import dataLocater.readExcelData;

import java.util.ArrayList;
import java.util.Random;

public class readExcelFile {
    public static ArrayList<Object[]> readExcelFile() {
        ArrayList<Object[]> myData = new ArrayList<>();
        readExcelData eat = new readExcelData(
                "/home/keby/IdeaProjects/Testing-erp-frontEnd/src/dataLocater/ExcelRead.xlsx");
        int rowCount = eat.getRowCount(5);
        for (int rowNum = 2; rowNum <= rowCount;rowNum++ ) {

            Random random = new Random();
            int val = random.nextInt(100);
            String customer = eat.getData(5, 2, 1);
            String desc = eat.getData(3, 2, 2);
            String address = eat.getData(3, 2, 2);
            String order = eat.getData(3, 2, 2);
            String quantity = eat.getData(3, 2, 2);

            Object ob[] = {customer, desc ,address,order,quantity};
            myData.add(ob);
        }

        return myData;
    }
}
