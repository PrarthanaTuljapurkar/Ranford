package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import Base.BaseClass;
//import bsh.org.objectweb.asm.Label;
import jxl.Sheet;
	import jxl.Workbook;
	import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
	//import TestBase.Base;

	public class excel_utility extends BaseClass{
		
		public static String folderpath = config("excelfolderpath");
		static Workbook wb;
		static Sheet ws;
		 static WritableWorkbook wwb;
		 static WritableSheet wsh;
		public static void excelConnection(String fileName, String sheetName) throws IOException 
		{
			try {
				File f = new File(folderpath+fileName);
				
				wb = Workbook.getWorkbook(f);
				ws = wb.getSheet(sheetName);
				 //rowCount = ws.getRow(arg0)
			} catch (BiffException e) {
				e.printStackTrace();
			}
		}
			
			public static  int rcount()
			{
				int i = ws.getRows();
				return i;
			}
			public static int ccount()
			{
				int i=ws.getColumns();
				return i;
			}
public static String readdata(int col,int row)
{
	String x=ws.getCell(col,row).getContents();
	return x;
}

public static void outputexcelconnection(String ifilename,String ofilename,String sheetname)
{
	
	try {
		FileInputStream fis=new FileInputStream(folderpath+ifilename);
		
		 wb=Workbook.getWorkbook(fis);
			
		 ws=wb.getSheet(sheetname);
		 
		 FileOutputStream fos=new FileOutputStream(folderpath+ofilename);
		 
		wwb=Workbook.createWorkbook(fos, wb);
		 
		 wsh=wwb.getSheet(sheetname);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
}

public static void writedata(int col,int row,String data)
{
	try {
		Label l=new Label(col, row, data);
		wsh.addCell(l);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}

public static void saveworkbook()
{
	try {
		wwb.write();
		
		wwb.close();
		wb.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}
}
