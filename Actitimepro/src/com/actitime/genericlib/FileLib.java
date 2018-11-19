package com.actitime.genericlib;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FileLib {

	String excelpath="./testdata/testdata.xlsx";
	public String getexceldata(String sheetname,int rownum,int colnum) throws Throwable
	{
		FileInputStream fobj=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fobj);
		Sheet sh=wb.getSheet(sheetname)	;
		Row row=sh.getRow(rownum);
		String data=row.getCell(colnum).getStringCellValue();
		wb.close();
		return data;
		
	}
	public void setexceldata(String sheetname,int rownum,int colnum,String data) throws Throwable
	{
		
		FileInputStream fobj=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fobj);
		Sheet sh=wb.getSheet(sheetname);
		Row row=sh.getRow(rownum);
		Cell cell=row.createCell(colnum);
        cell.setCellValue(data);
        
        FileOutputStream fos=new FileOutputStream(excelpath);
        wb.write(fos);
        wb.close();
	}
	public Properties getpropertyobj() throws Throwable
	{
		FileInputStream fobj=new FileInputStream("./testdata/commondata.properties");
		Properties pobj=new Properties();
		pobj.load(fobj);
		return pobj;
	}
	
}
