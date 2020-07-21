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
        for (int rowNum = 1; rowNum <= rowCount;rowNum++ ) {

            Random random = new Random();
            int val = random.nextInt(100);
            String customer = eat.getData(5, 1, 0);
            String desc = eat.getData(5, 1, 1);
            String address = eat.getData(5, 1, 2);
            String order = eat.getData(5, 1, 3);
            String quantity = eat.getData(5, 1, 4);

            Object ob[] = {customer,address, desc,order,quantity};
            myData.add(ob);
        }

        return myData;
    }
}
