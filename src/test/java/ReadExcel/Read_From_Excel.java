package ReadExcel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class Read_From_Excel {
public static String value(int row, int col){
    String testdata = null;
    try {
        String filePath = "C:\\Users\\mma2928\\IdeaProjects\\Final\\Excel\\Excel Values.xlsx";
        FileInputStream file = new FileInputStream(filePath);
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet ws = wb.getSheetAt(0);
        testdata = String.valueOf(ws.getRow(row).getCell(col));
        wb.close();
    } catch (Exception e) {
        System.out.println("Excel value is wrong");
    }
    return testdata;
}
}
