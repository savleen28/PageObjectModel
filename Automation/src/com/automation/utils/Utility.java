package com.automation.utils;

import org.testng.annotations.DataProvider;

import com.automation.utils.Xls_Reader;

public class Utility {
	
	public static boolean isExecutable(String test_name, Xls_Reader excel){
		String sheetName = "testcases";
		for(int rowNum =2; rowNum<excel.getRowCount(sheetName);rowNum++){
			if(excel.getCellData(sheetName, "tc_name", rowNum).equals(test_name)){
				if(excel.getCellData(sheetName, "run_mode", rowNum).equalsIgnoreCase("Y"))
					return true;
					
				else
						return false;
					
				}
			}
		
		return false;
	}
	
	@DataProvider
	public static Object[][] getData(String sheetname) 
	{
		Xls_Reader excel1 = new Xls_Reader("C:\\Users\\BEDI\\workspace\\POM\\Automation\\src\\com\\automation\\testdata\\testdata.xlsx");
		int rows = excel1.getRowCount(sheetname);

		int cols = excel1.getColumnCount(sheetname);
		Object data[][] = new Object [rows-1][cols];
		for(int rownum = 2;rownum<=rows;rownum++)
		{
			for(int colnum=0; colnum<cols;colnum++)
			{
				data[rownum-2][colnum] = excel1.getCellData(sheetname, colnum, rownum);

			}
		}

		return data;
	}
	
	
	

}
