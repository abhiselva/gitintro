import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataExcel {

	public ArrayList<String> getrowData(String testcase) throws IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\sabhi\\Selenium IO files\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int k = 0, column = 0;
		ArrayList<String> data = new ArrayList<String>();
		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.rowIterator();
				Row row = rows.next();
				Iterator<Cell> cell = row.cellIterator();
				while (cell.hasNext()) {
					Cell ce = cell.next();
					if (ce.getStringCellValue().equalsIgnoreCase("Testcase")) {
						column = k;
					}
					k++;
				}
				System.out.println(column);

				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcase)) {
						Iterator<Cell> c = r.cellIterator();
						while (c.hasNext()) {
							Cell cel = c.next();
							if (cel.getCellType() == CellType.STRING) 
							{
								data.add(cel.getStringCellValue());
							} 
							else //if (cel.getCellType() == CellType.NUMERIC) 
							{
								data.add(NumberToTextConverter.toText(cel.getNumericCellValue()));
								
							}
						}

					}
				}
			}
		}
		return data;

	}

	
	public ArrayList<String> getcolumnData(String testcase) throws IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\sabhi\\Selenium IO files\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int k = 0, column = 0;
		ArrayList<String> data = new ArrayList<String>();
		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.rowIterator();
				Row row = rows.next();
				Iterator<Cell> cell = row.cellIterator();
				while (cell.hasNext()) {
					Cell ce = cell.next();
					if (ce.getStringCellValue().equalsIgnoreCase("Testcase")) {
						column = k;
					}
					k++;
				}
				System.out.println(column);

				while (cell.hasNext()) {
					Cell c = cell.next();
					if (c.getStringCellValue().equalsIgnoreCase(testcase)) {
						Iterator<Cell> ce = c.cellIterator();
						while (ce.hasNext()) {
							Cell cel = c.next();
							if (cel.getCellType() == CellType.STRING) 
							{
								data.add(cel.getStringCellValue());
							} 
							else //if (cel.getCellType() == CellType.NUMERIC) 
							{
								data.add(NumberToTextConverter.toText(cel.getNumericCellValue()));
								
							}
						}

					}
				}
			}
		}
		return data;

	}
	public static void main(String[] args) throws IOException {

	}
}
