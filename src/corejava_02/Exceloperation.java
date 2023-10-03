package corejavapackage;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//public class Exceloperation {
//	public void readExcel(String filePath, String fileName, String sheetName) throws IOException {
//		// Create an object of File class to open xlsx file
//		File file = new File(filePath + "\\" + fileName);
//		// Create an object of FileInputStream class to read excel file
//		FileInputStream inputStream = new FileInputStream(file);
//		Workbook myworkbook = null;
//		// Find the file extension by splitting file name in substring and getting
//		// only
//		// extension name
//		String fileExtensionName = fileName.substring(fileName.indexOf("."));
//		// Check condition if the file is xlsx file
//		if (fileExtensionName.equals(".xlsx")) {
//			// If it is xlsx file then create object of XSSFWorkbook class
//			myworkbook = new XSSFWorkbook(inputStream);
//		}
//		// Check condition if the file is xls file
//		else if (fileExtensionName.equals(".xls")) {
//			// If it is xls file then create object of XSSFWorkbook class
//			myworkbook = new HSSFWorkbook(inputStream);
//		}
//		// Read sheet inside the workbook by its name
//		Sheet mysheetSheet = myworkbook.getSheet(sheetName);
//		// Find number of rows in excel file
//		int rowCount = mysheetSheet.getLastRowNum() - mysheetSheet.getFirstRowNum();
//		// Create a loop over all the rows of excel file to read it
//		for (int i = 0; i < rowCount + 1; i++) {
//			Row row = mysheetSheet.getRow(i);
//			// Create a loop to print cell values in a row
//			for (int j = 0; j < row.getLastCellNum(); j++) {
//				// Print Excel data in console
//				System.out.print(row.getCell(j).getStringCellValue() + "|| ");
//			}
//			System.out.println();
//		}
//
//	}
//
//	//
//	// // Main function is calling readExcel function to read data from excel file
//	public static void main(String... strings) throws IOException {
//
//		// Create an object of ReadGuru99ExcelFile class
//
//		Exceloperation objExcelFile = new Exceloperation();
//
//		// Prepare the path of excel file
//
//		// String filePath = System.getProperty("user.dir") +
//		// "\\src\\excelExportAndFileIO";
//		String filePath = "C:\\My\\Study\\javaselenium\\";
//		// Call read file method of the class to read data
//
//		objExcelFile.readExcel(filePath, "ExportExcel.xlsx", "Input");
//
//	}
//
//}
// ==================================
//public class Exceloperation {
//
//	public void writeExcel(String filePath, String fileName, String sheetName, String[] dataToWrite)
//			throws IOException {
//
//		// Create an object of File class to open xlsx file
//
//		File file = new File(filePath + "\\" + fileName);
//
//		// Create an object of FileInputStream class to read excel file
//
//		FileInputStream inputStream = new FileInputStream(file);
//
//		Workbook MyWorkbook = null;
//
//		// Find the file extension by splitting file name in substring and getting
//		// only
//		// extension name
//
//		String fileExtensionName = fileName.substring(fileName.indexOf("."));
//
//		// Check condition if the file is xlsx file
//
//		if (fileExtensionName.equals(".xlsx")) {
//
//			// If it is xlsx file then create object of XSSFWorkbook class
//
//			MyWorkbook = new XSSFWorkbook(inputStream);
//
//		}
//
//		// Check condition if the file is xls file
//
//		else if (fileExtensionName.equals(".xls")) {
//
//			// If it is xls file then create object of XSSFWorkbook class
//
//			MyWorkbook = new HSSFWorkbook(inputStream);
//
//		}
//
//		// Read excel sheet by sheet name
//
//		Sheet sheet = MyWorkbook.getSheet(sheetName);
//
//		// Get the current count of rows in excel file
//
//		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
//
//		// Get the first row from the sheet
//		System.out.println(rowCount);
//
//		Row row = sheet.getRow(0);
//
//		// Create a new row and append it at last of sheet
//
//		Row newRow = sheet.createRow(rowCount + 1);
//
//		// Create a loop over the cell of newly created Row
//
//		for (int j = 0; j < row.getLastCellNum(); j++) {
//
//			// Fill data in row
//
//			Cell cell = newRow.createCell(j);
//
//			cell.setCellValue(dataToWrite[j]);
//
//		}
//
//		// Close input stream
//
//		inputStream.close();
//
//		// Create an object of FileOutputStream class to create write data in excel
//		// file
//
//		FileOutputStream outputStream = new FileOutputStream(file);
//
//		// write data in the excel file
//
//		MyWorkbook.write(outputStream);
//
//		// close output stream
//
//		outputStream.close();
//
//	}
//
//	public static void main(String... strings) throws IOException {
//
//		// Create an array with the data in the same order in which you expect to be
//		// filled in excel file
//
//		String[] valueToWrite = { "Mr. E", "Noida" };
//
//		// Create an object of current class
//
//		Exceloperation objExcelFile = new Exceloperation();
//
//		// Write the file using file name, sheet name and the data to be filled
//
//		objExcelFile.writeExcel(System.getProperty("user.dir") + "\\src\\resources", "WriteExcel.xlsx", "ExcelMyDemo",
//				valueToWrite);
//
//	}
//
//}
// ==================

public class Exceloperation {
	public static void main(String[] args) throws Exception {

		// Create blank workbook
		XSSFWorkbook workbook = new XSSFWorkbook();

		// Create a blank sheet
		XSSFSheet spreadsheet = workbook.createSheet(" Employee Info ");

		// Create row object
		XSSFRow row;

		// This data needs to be written (Object[])
		Map<String, Object[]> empinfo = new TreeMap<String, Object[]>();
		empinfo.put("1", new Object[] { "EMP ID", "EMP NAME", "DESIGNATION" });

		empinfo.put("2", new Object[] { "tp01", "Gopal", "Technical Manager" });

		empinfo.put("3", new Object[] { "tp02", "Manisha", "Proof Reader" });

		empinfo.put("4", new Object[] { "tp03", "Masthan", "Technical Writer" });

		empinfo.put("5", new Object[] { "tp04", "Satish", "Technical Writer" });

		empinfo.put("6", new Object[] { "tp05", "Krishna", "Technical Writer" });

		// Iterate over data and write to sheet
		Set<String> keyid = empinfo.keySet();
		int rowid = 0;

		for (String key : keyid) {
			row = spreadsheet.createRow(rowid++);
			Object[] objectArr = empinfo.get(key);
			int cellid = 0;

			for (Object obj : objectArr) {
				Cell cell = row.createCell(cellid++);
				cell.setCellValue((String) obj);
			}
		}
		// Write the workbook in file system
		FileOutputStream out = new FileOutputStream(
				new File(System.getProperty("user.dir") + "\\src\\resources\\" + "WriteExcel.xlsx"));

		workbook.write(out);
		out.close();
		System.out.println("Writesheet.xlsx written successfully");
	}
}
