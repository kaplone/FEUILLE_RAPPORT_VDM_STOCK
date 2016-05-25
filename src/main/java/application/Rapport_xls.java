package application;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.sql.rowset.RowSetWarning;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.jongo.MongoCursor;

import models.Destinataire;
import models.Materiel;
import utils.MongoAccess;

public class Rapport_xls {
	
	public static void export_xls_materiel(){

		
		
		  NPOIFSFileSystem fs = null;
		  FileOutputStream fileOut = null;

		  
		try {
			
			File f_test = new File("/home/autor/Desktop/modele_matériel.xls");
			fs = new NPOIFSFileSystem(f_test);
			
			
			HSSFWorkbook wb = new HSSFWorkbook(fs.getRoot(), true);
			Sheet sheet = wb.getSheetAt(0);
			
			MongoCursor<Materiel> materiels = MongoAccess.request("materiel").as(Materiel.class);
			
			int rowInt = 1;
			
			Row row;
			Cell cell;
			
			while (materiels.hasNext()) {
				Materiel dest = materiels.next();
				
				row = sheet.createRow(rowInt);
				
				cell = row.createCell(0);
			    cell.setCellValue(dest.get_id().toString());
			    cell = row.createCell(1);
			    cell.setCellValue(dest.getNom());
			    cell = row.createCell(2);
			    cell.setCellValue(dest.getMarque());
			    cell = row.createCell(3);
			    cell.setCellValue(dest.getModele());
			    cell = row.createCell(4);
			    cell.setCellValue(dest.getCapacite());
			    cell = row.createCell(5);
			    cell.setCellValue(dest.getCommentaire());
			    cell = row.createCell(6);
			    cell.setCellValue(dest.isUsb3() ? "X" : "");
			    
			    if (dest.getTags() != null){
			    	
			    	for (String tag : dest.getTags()){
			    	
				    	switch (tag){
				    	case "USB2" : cell = row.createCell(7);
		                              cell.setCellValue(tag);
		                              break;
				    	case "CF" : cell = row.createCell(8);
					                cell.setCellValue(tag);
					                break;
				    	case "UDMA7" : cell = row.createCell(9);
		                               cell.setCellValue(tag);
		                               break;
				    	case "SD" : cell = row.createCell(10);
                                  cell.setCellValue(tag);
                                  break;
				    	case "UHS1" : cell = row.createCell(11);
                                    cell.setCellValue(tag);
                                    break;
				    	case "UHS3" : cell = row.createCell(12);
                                    cell.setCellValue(tag);
                                    break;
				    	case "CLASSE8" : cell = row.createCell(13);
                                       cell.setCellValue(tag);
                                       break;
				    	case "CLASSE10" : cell = row.createCell(14);
                                        cell.setCellValue(tag);
                                        break;
				    	case "SDHC" : cell = row.createCell(15);
                                    cell.setCellValue(tag);
                                    break;
				    	case "SDXC" : cell = row.createCell(16);
                                    cell.setCellValue(tag);
                                    break;
					                
				    	}
				    }
			    }
			    
			    
			    rowInt ++;	
			}

	    
		 // Write the output to a file
			fileOut = new FileOutputStream( "/home/autor/Desktop/matériel.xls");

			
		    wb.write(fileOut);
	
			
		} catch (IOException e) {
			// TODO Bloc catch généré automatiquement
			e.printStackTrace();
		}
		  
		  try {
			fs.close();
		    fileOut.close();
		    
		    System.out.println("\n\n______Terminé______\n\n");
		} catch (IOException e) {
			// TODO Bloc catch généré automatiquement
			e.printStackTrace();
		}	

  }

	public static void export_xls_destinataire(){

		
		
		  NPOIFSFileSystem fs = null;
		  FileOutputStream fileOut = null;

		  
		try {
			
			File f_test = new File("/home/autor/Desktop/modele_destinataire.xls");
			fs = new NPOIFSFileSystem(f_test);
			
			
			HSSFWorkbook wb = new HSSFWorkbook(fs.getRoot(), true);
			Sheet sheet = wb.getSheetAt(0);
			
			MongoCursor<Destinataire> destinataires = MongoAccess.request("destinataire").as(Destinataire.class);
			
			int rowInt = 1;
			
			Row row;
			Cell cell;
			
			String affichage = "XXXX";
			
			while (destinataires.hasNext()) {
				Destinataire dest = destinataires.next();
				
				row = sheet.createRow(rowInt);
				
				cell = row.createCell(0);
			    cell.setCellValue(dest.get_id().toString());
			    System.out.println(dest.getNom());
			    cell = row.createCell(1);
			    cell.setCellValue(dest.getNom());
			    cell = row.createCell(2);
			    cell.setCellValue(dest.getPatronyme());
			    cell = row.createCell(3);
			    cell.setCellValue(dest.getPrenom());
			    cell = row.createCell(4);
			    cell.setCellValue(dest.getFonction());
			    cell = row.createCell(5);
			    cell.setCellValue(dest.getSociete());
			    cell = row.createCell(6);
			    cell.setCellValue(dest.getCommentaire());
			    cell = row.createCell(7);
			    cell.setCellValue(dest.isUsb3() ? "X" : "");
			    
			    if (dest.getTags() != null){
			    	
			    	for (String tag : dest.getTags()){
			    		
			    		System.out.println(tag);
			    		
			    		
				    	
				    	switch (tag){
				    	case "USB2" : cell = row.createCell(8);
		                              cell.setCellValue(tag);
		                              break;
				    	case "CF" : cell = row.createCell(9);
					                cell.setCellValue(tag);
					                break;
				    	case "UDMA7" : cell = row.createCell(10);
		                               cell.setCellValue(tag);
		                               break;
				    	case "SD" : cell = row.createCell(11);
                                    cell.setCellValue(tag);
                                    break;
				    	case "UHS1" : cell = row.createCell(12);
                                      cell.setCellValue(tag);
                                      break;
				    	case "UHS3" : cell = row.createCell(13);
                                      cell.setCellValue(tag);
                                      break;
				    	case "CLASSE8" : cell = row.createCell(14);
                                         cell.setCellValue(tag);
                                         break;
				    	case "CLASSE10" : cell = row.createCell(15);
                                          cell.setCellValue(tag);
                                          break;
				    	case "SDHC" : cell = row.createCell(16);
                                      cell.setCellValue(tag);
                                      break;
				    	case "SDXC" : cell = row.createCell(17);
                                      cell.setCellValue(tag);
                                      break;
					                
				    	}
				    }
			    }
			    
			    
			    rowInt ++;	
			}

	    
		 // Write the output to a file
 			fileOut = new FileOutputStream( "/home/autor/Desktop/destinataires.xls");

 			
 		    wb.write(fileOut);
	
			
		} catch (IOException e) {
			// TODO Bloc catch généré automatiquement
			e.printStackTrace();
		}
		  
		  try {
			fs.close();
		    fileOut.close();
		    
		    System.out.println("\n\n______Terminé______\n\n");
		} catch (IOException e) {
			// TODO Bloc catch généré automatiquement
			e.printStackTrace();
		}	

    }

}