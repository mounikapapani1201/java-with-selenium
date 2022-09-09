package webdriverAutomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelDemo {

	static String projectpath;
	static Workbook workbook;
	static org.apache.poi.ss.usermodel.Sheet sheet;

	public static void main(String[] args) throws IOException {
		getRowCount();
		getCelldatastring();
		getcelldataNumber();

	}

	private static void getcelldataNumber() throws IOException {

		try {
			projectpath = System.getProperty("user.dir");
			FileInputStream fis = new FileInputStream(projectpath + "\\testdata\\testdata.xlsx");
			workbook = new org.apache.poi.xssf.usermodel.XSSFWorkbook(fis);
			sheet = workbook.getSheet("Sheet1");
			double cellData = sheet.getRow(1).getCell(1).getNumericCellValue();
			System.out.println(cellData);
			
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());

			exp.printStackTrace();
		}

	}

	private static void getCelldatastring() {

	}

	private static void getRowCount() {
		// TODO Auto-generated method stub

	}

}
