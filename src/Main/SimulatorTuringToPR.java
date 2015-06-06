package Main;

import util.ConvertTuringToPR;
import util.ImportFile;

public class SimulatorTuringToPR {
		
	
	
	public static void main(String args[]){
		
		ImportFile impf = new ImportFile("C:/Users/Lucas/Dropbox/UFC"
				+ "/Teoria da Computação/ProjetoTuringPR/"
				+ "SimulatorTuringToPR/src/Main/"
				+ "turingtoPR.txt");
		
		ConvertTuringToPR ctpr = new ConvertTuringToPR(impf.getReadFile());
		
		for ( String a: ctpr.getPr()   ){
			System.out.println( a + " ");
						
		}
	}
}
