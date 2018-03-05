package ks.io.files.csv;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import ks.dto.feed.banks.Cabecera;

/**
 * Created by anirudh on 23/10/14.
 */
public class WriteExcelFile {
    private static final String FILE_PATH = "/Users/anirudh/Projects/JCGExamples/JavaWriteReadExcelFileExample/testWriteStudents.xlsx";
    //We are making use of a single instance to prevent multiple write access to same file.
    private static final WriteExcelFile INSTANCE = new WriteExcelFile();

    public static WriteExcelFile getInstance() {
        return INSTANCE;
    }

    private WriteExcelFile() {
    }

    public static void main(String args[]){

        List<Cabecera> studentList = new ArrayList<Cabecera>();
        studentList.add(new Cabecera());
        studentList.add(new Cabecera());
        studentList.add(new Cabecera());

        writeStudentsListToExcel(studentList);

    }

    public static void writeStudentsListToExcel(List<Cabecera> studentList){

        // Using XSSF for xlsx format, for xls use HSSF
        Workbook workbook = new XSSFWorkbook();

        Sheet studentsSheet = workbook.createSheet("Students");

        int rowIndex = 0;
        for(Cabecera student : studentList){
            Row row = studentsSheet.createRow(rowIndex++);
            int cellIndex = 0;
            //first place in row is name
            row.createCell(cellIndex++).setCellValue(new Date());

            //second place in row is marks in maths
            row.createCell(cellIndex++).setCellValue(new Date());

            //third place in row is marks in Science
            row.createCell(cellIndex++).setCellValue(new Date());

            //fourth place in row is marks in English
            row.createCell(cellIndex++).setCellValue(new Date());

        }

        //write this workbook in excel file.
        try {
            FileOutputStream fos = new FileOutputStream(FILE_PATH);
            workbook.write(fos);
            fos.close();

            System.out.println(FILE_PATH + " is successfully written");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
