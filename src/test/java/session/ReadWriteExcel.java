package session;

import java.awt.Label;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel {
	public static  Cell cell;
	
	public static void main(String[] args) throws Exception  
	{
		File fis =    new File(System.getProperty("user.dir") + "\\sheet\\orange.xlsx");
		FileInputStream inputStream = new FileInputStream(fis);
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet ExcelWSheet = workbook.getSheetAt(0);
		Row row  = ExcelWSheet.getRow(3);
		Cell cell = row.getCell(6);
			cell = row.createCell(6);
			String Result = "Working";
			String mess = "56";
			String fnl = "'+Result+' + '"+mess+"'";
			System.out.println(fnl);
			cell.setCellValue("Working");
		
		FileOutputStream fileOut = new FileOutputStream(System.getProperty("user.dir") + "\\sheet\\orange.xlsx");
		workbook.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}
}

