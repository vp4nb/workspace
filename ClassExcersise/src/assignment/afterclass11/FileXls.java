package assignment.afterclass11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;

public class FileXls {

	public static void main(String[] args) throws IOException {
		
		String fileName="file123.xls";
		//System.out.println(System.getProperty("user.dir"));
		fileName=System.getProperty("user.dir")+File.separator+"src"+File.separator+"assignment"+File.separator+"afterclass11"+File.separator+fileName;
		//File fp1=new File(fileName);
		//fp1.createNewFile();
		try{
		FileOutputStream fos=new FileOutputStream(fileName);
		System.out.println("enter the day names: ");
		Scanner in=new Scanner(System.in);
		
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet worksheet = workbook.createSheet("POI Worksheet");
		// index from 0,0... cell A1 is cell(0,0)
				HSSFRow row1 = worksheet.createRow((short) 0);
		for(int i=0;i<7;i++)
		{

		HSSFCell cellA1 = row1.createCell((short) i);
		cellA1.setCellValue(in.next());
		HSSFCellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillForegroundColor(HSSFColor.GOLD.index);
		cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		cellA1.setCellStyle(cellStyle);
		
		}
		workbook.write(fos);
		fos.flush();
		fos.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
		
		}
		// TODO Auto-generated method stub
	}

}
