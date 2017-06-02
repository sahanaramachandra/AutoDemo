package Generic;

import java.io.File;
import java.util.Set;

public class Excel 
{

	public static void main(String args[]) throws Exception
	{
		File f=new File("./Data/input.xlsx");
		Workbook wb=WorkbookFactory.create(f);
		Set s=wb.getSheet("Sheet1");
		Row r=s.getRow(0);
		Cell c=r.getCell(0);
		String v=c.getStringCellValue();
		System.out.println(v);
		
		
		
	}
}
