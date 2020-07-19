package manufactureOrder;

import java.util.ArrayList;
public class readExcelData {

        public static ArrayList<Object[]> readExcelData() {
            ArrayList<Object[]> myData = new ArrayList<>();
            dataLocater.readExcelData eat = new dataLocater.readExcelData(
                    "/home/keby/IdeaProjects/Testing-erp-frontEnd/src/dataLocater/ExcelRead.xlsx");
            int rowCount = eat.getRowCount(4);
            for (int rowNum = 2; rowNum <= rowCount;rowNum++ ) {

                String quantity = eat.getData(4, 1, 1);

                String description = eat.getData(4, 1, 2);
                String startDate = eat.getData(4, 1, 3);
                String endDate= eat.getData(4, 1, 4);
                Object ob[] = {quantity, description,startDate,endDate};
                myData.add(ob);
            }

            return myData;
        }
    }
