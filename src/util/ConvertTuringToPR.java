package util;

import java.util.ArrayList;

public class ConvertTuringToPR {
	private ArrayList<String> pr;
	public ConvertTuringToPR( ArrayList<String[]> turing ){
		pr = new ArrayList<String>();
		pr.add("one-step( <q, C> ) =");
		for ( String[] a: turing  ) {
			pr.add( "action( < q, C>,"+ a[2] + "," +a[3] +")" + ", se q ="+a[0] + "e current(C) = "+ a[1] );
		}
	}		
	
	public ArrayList<String> getPr(){
		return pr;		
	}
	
}