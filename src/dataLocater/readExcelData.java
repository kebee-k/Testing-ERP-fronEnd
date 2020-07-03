package dataLocater;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class readExcelData{
    XSSFWorkbook WEB;
    XSSFSheet sheet;
    public  readExcelData(String excelPath){
        try {
            File src = new File(excelPath);
            FileInputStream  fls = new FileInputStream(src);
            WEB = new XSSFWorkbook(fls);
        }
        catch (Exception  e){
            System.out.println(e.getMessage());
        }
    }
   public  String  getData(int SheetNumber, int row, int column){
      sheet= WEB.getSheetAt(SheetNumber);


      String data =sheet.getRow(row).getCell(column).getStringCellValue();
      return  data;
   }
    public int getRowCount(int sheetIndex) {
        int row = WEB.getSheetAt(sheetIndex).getLastRowNum();
        row = row + 1;
        return row;
    }
}
