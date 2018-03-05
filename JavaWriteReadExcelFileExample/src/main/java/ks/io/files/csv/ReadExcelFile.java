package ks.io.files.csv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import ks.dto.feed.accounting.csv.AccountingCell;
import ks.dto.feed.accounting.csv.AccountingRow;
import ks.dto.feed.accounting.csv.AccountingWorkbook;
import ks.dto.feed.banks.Cabecera;
import ks.types.dataFeed.accounting.csv.IAccountingCell;
import ks.types.dataFeed.accounting.csv.IAccountingRow;
import ks.types.dataFeed.accounting.csv.IAccountingSheet;

/**
 * Created by anirudh on 20/10/14.
 */
public class ReadExcelFile {

	public static List<Cabecera> getStudentsListFromExcel(String path) {
		AccountingWorkbook<IAccountingSheet<IAccountingRow<IAccountingCell>, IAccountingCell>> ksWorkbook = new AccountingWorkbook<IAccountingSheet<IAccountingRow<IAccountingCell>, IAccountingCell>>();

		List<Cabecera> studentList = new ArrayList<Cabecera>();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(path);

			// Using XSSF for xlsx format, for xls use HSSF
			Workbook workbook = new XSSFWorkbook(fis);

			// identifica el número de cuadernos dentro de la hoja excel
			int numberOfSheets = workbook.getNumberOfSheets();

			// se recorre el número de cuadernos
			for (int i = 0; i < numberOfSheets; i++) { // NIVEL DE PLANTILLAS
				Sheet sheet = workbook.getSheetAt(i);
				sheet.getRow(0);		

				System.out.println("el nombre del cuaderno es: " + sheet.getSheetName());
				Iterator<Row> rowIterator = sheet.iterator();

				// iterating over each row
				while (rowIterator.hasNext()) { // NIVEL DE REGISTROS
					IAccountingCell ksCell=new AccountingCell();
					IAccountingRow<IAccountingCell> ksRow= new AccountingRow<IAccountingCell>();
					
					Row row = rowIterator.next();
					Iterator<Cell> cellIterator = row.cellIterator();

					// Iterating over each cell (column wise) in a particular
					// row.
					while (cellIterator.hasNext()) { // NIVEL DE COLUMNAS
						
						Cell cell = cellIterator.next();

						System.out.println("el índice de la celda es: " + cell.getColumnIndex());
						// System.out.println("su fórmula:
						// "+cell.getCellFormula());

						// The Cell Containing String will is name.
						if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
							ksCell.setValue(cell.getStringCellValue());
							System.out.println("su valor: " + cell.getStringCellValue());

							// The Cell Containing numeric value will contain
							// marks
						} else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
							System.out.println("su valor: " + String.valueOf(cell.getNumericCellValue()));

						}
						
						if (cell.getCellComment() != null) {
							ksCell.addComment(cell.getCellComment().toString());
							System.out.println("el comentario de la celda es: " + cell.getCellComment());
						}
					}
				}
			}

			fis.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return studentList;
	}

	public static void copyFile_Java7(String origen, String destino) throws IOException {
		Path FROM = Paths.get(origen);
		Path TO = Paths.get(destino);
		// sobreescribir el fichero de destino, si existe, y copiar
		// los atributos, incluyendo los permisos rwx
		CopyOption[] options = new CopyOption[] { StandardCopyOption.REPLACE_EXISTING,
				StandardCopyOption.COPY_ATTRIBUTES };
		Files.copy(FROM, TO, options);
	}

}
