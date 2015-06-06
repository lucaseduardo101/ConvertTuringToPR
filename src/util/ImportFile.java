package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ImportFile {
	private File file ;
	private BufferedReader in;
	private ArrayList<String[]> readFile;
	
	public ImportFile( String fileName ){
		
		readFile = new ArrayList<String[]>();
		
		try{
			file = new File(fileName);			
			in = new BufferedReader(new FileReader(file));
			String s = ""; 			  
			s = in.readLine();   
			while (s !=null){
				readFile.add( s.split(" ") );
				s = in.readLine();				
			}
			in.close();
			 			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		
	}
	
	public ArrayList<String[]> getReadFile(){
		return this.readFile;
	}

}
