import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;


public class ExcelReading {

    public static void main(String[] args) throws IOException, InvalidFormatException {

        File file = new File("C:\\Users\\Admin\\Desktop\\bhaskarNew folder\\New Microsoft Excel Worksheet.xlsx");
        Workbook wb = new XSSFWorkbook("C:\\Users\\Admin\\Desktop\\bhaskarNew folder\\New Microsoft Excel Worksheet.xlsx");

        Sheet sheet =  wb.getSheetAt(1);


        int rowsCount = sheet.getLastRowNum();

        for(int i=0;i<=rowsCount;i++) //7 //Rows
        {
            int columnCount = sheet.getRow(i).getLastCellNum();

                for(int j=0;j<columnCount;j++) // Columns
                {
                    System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
                }
        }
    }
}
