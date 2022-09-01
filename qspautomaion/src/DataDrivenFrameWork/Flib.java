package DataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readExcelData(String path,String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis = new FileInputStream(path);
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheetName);
	 Row row= sh.getRow(rowNum);
	 Cell cell = row.getCell(cellNum);
	 String userName = cell.getStringCellValue();
	return userName;
	
	
	
	

	}
}
