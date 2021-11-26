package ReadExcel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class Read_From_Excel {
public static String value(int row, int col){
    String testdata = null;
    try {
        String filePath = "C:\\Users\\hp\\IdeaProjects\\Final\\Excel\\Values.xlsx";//my excel file location
        FileInputStream file = new FileInputStream(filePath);
        XSSFWorkbook wb = new XSSFWorkbook(file);//Getting the file
        XSSFSheet ws = wb.getSheetAt(0);//Getting from the sheet
        testdata = String.valueOf(ws.getRow(row).getCell(col));//Getting the values from excel and storing it in the testdata variable
        wb.close();//closing the file

    } catch (Exception e) {
        System.out.println("Excel value is wrong");
    }
    return testdata;//Returning the test data
}
}
