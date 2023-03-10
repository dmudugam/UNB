package master.dmh;
		
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Reader {

	public static void main(String[] args) {
		String teacherName = null;
        String Period1 = null;
        String Period2 = null;
        String Period3 = null;
        String Period4 = null;
        String P1R = null;
        String P2R = null;
        String P3R = null;
        String P4R = null;
		try {
				int lastColumn = 100;
				boolean end = true;
			 	ArrayList<ArrayList<String>> allData = new ArrayList<ArrayList<String>>();
			 	ArrayList<String> perRowData = new ArrayList<String>();
	            XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream("/Users/dineth/eclipse-workspace/Master_Schedule_Reader/src/main/java/master/dmh/MasterSchedule.xlsx"));
	            Iterator<Row> iterator =  workbook.getSheetAt(0).iterator();
	            Row row = iterator.next();
	            while (iterator.hasNext() && end) {
	            	
	            	int counter = 0;
	                row = iterator.next();
	                Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column
	                
	                while (cellIterator.hasNext()) {
	                	
	                    
	                    Cell cell = cellIterator.next();
	                    switch (cell.getCellType()) {
		                    case STRING:
		                    	if(cell.getStringCellValue().equals("M= Special Education (Monitoring)")) {
		                    		lastColumn = cell.getColumnIndex();
		                    		break;
		                    	}
		                    	else if(cell.getColumnIndex() == lastColumn || cell.getColumnIndex() == lastColumn+1) {
		                    		break;
		                    	}
		                    	else if(cell.getStringCellValue().equals("End")) {
		                    		end = false;
		                    		break;
		                    	}
		                    	else if(cell.getColumnIndex() == 0) {
		                    		teacherName = cell.getStringCellValue();
		                    	}
		                    	else if(cell.getColumnIndex() == 1) {
		                    		Period1 = cell.getStringCellValue();
		                    	}
		                    	else if(cell.getColumnIndex() == 2) {
		                    		P1R = cell.getStringCellValue();
		                    	}
		                    	else if(cell.getColumnIndex() == 3) {
		                    		Period2 = cell.getStringCellValue();
		                    	}
		                    	else if(cell.getColumnIndex() == 4) {
		                    		P2R = cell.getStringCellValue();
		                    	}
		                    	else if(cell.getColumnIndex() == 5) {
		                    		Period3 = cell.getStringCellValue();
		                    	}
		                    	else if(cell.getColumnIndex() == 6) {
		                    		P3R = cell.getStringCellValue();
		                    	}
		                    	else if(cell.getColumnIndex() == 7) {
		                    		Period4 = cell.getStringCellValue();
		                    	}
		                    	else if(cell.getColumnIndex() == 8) {
		                    		P4R = cell.getStringCellValue();
		                    	}
		                        break;
		                    case NUMERIC:
		                        cell.setCellType(CellType.STRING);
		                        if(cell.getColumnIndex() == 2) {
		                    		P1R = cell.getStringCellValue();
		                    	}
		                    	else if(cell.getColumnIndex() == 4) {
		                    		P2R = cell.getStringCellValue();
		                    	}
		                    	else if(cell.getColumnIndex() == 6) {
		                    		P3R = cell.getStringCellValue();
		                    	}
		                    	else if(cell.getColumnIndex() == 8) {
		                    		P4R = cell.getStringCellValue();
		                    	}
		                        break;
		                    case BLANK:
		                    	if(cell.getColumnIndex() == 2) {
		                    		P1R = "NO ROOM";
		                    	}
		                    	else if(cell.getColumnIndex() == 4) {
		                    		P2R = "NO ROOM";
		                    	}
		                    	else if(cell.getColumnIndex() == 6) {
		                    		P3R = "NO ROOM";
		                    	}
		                    	else if(cell.getColumnIndex() == 8) {
		                    		P4R = "NO ROOM";
		                    	}
		                    	else if(cell.getColumnIndex() == 1) {
		                    		Period1 = "SPARE";
		                    	}
		                    	else if(cell.getColumnIndex() == 3) {
		                    		Period2 = "SPARE";
		                    	}
		                    	else if(cell.getColumnIndex() == 5) {
		                    		Period3 = "SPARE";
		                    	}
		                    	else if(cell.getColumnIndex() == 7) {
		                    		Period4 = "SPARE";
		                    	}
		                        break;
		                    default:
	                    }
	                }
	                System.out.println(teacherName);
	                System.out.println(Period1);
	                System.out.println(P1R);
	                System.out.println(Period2);
	                System.out.println(P2R);
	                System.out.println(Period3);
	                System.out.println(P3R);
	                System.out.println(Period4);
	                System.out.println(P4R);
	                System.out.println("");
	            }

	           
	        }
	        catch(Exception e){
	            e.printStackTrace();
	        }
	}
		

}
