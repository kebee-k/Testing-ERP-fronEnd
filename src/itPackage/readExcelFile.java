package itPackage;


import dataLocater.readExcelData;

import java.util.ArrayList;
import java.util.Random;

public class  readExcelFile {
    public static ArrayList<Object[]> readExcelData() {
        ArrayList<Object[]> myData = new ArrayList<>();
        try {
            readExcelData eat = new readExcelData(
                    "/home/keby/IdeaProjects/Testing-erp-frontEnd/src/dataLocater/ExcelRead.xlsx");
            int rowCount = eat.getRowCount(3);
            for (int rowNum = 1; rowNum <= rowCount; rowNum++) {

                Random random = new Random();
                int val = random.nextInt(100);
                String username = eat.getData(3, 1, 0);
                username = val + username;
                String password = eat.getData(3, 1, 1);
                password = val + password;
                Object ob[] = {username, password};
                myData.add(ob);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return myData;
    }
}
