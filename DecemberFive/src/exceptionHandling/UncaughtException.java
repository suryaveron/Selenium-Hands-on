package exceptionHandling;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class UncaughtException {

	public static void main(String[] args) {
		
		try{
			System.out.println(8/0);
		}
		catch(Throwable t){
			System.out.println(t.getMessage());
		}
		finally{
			System.out.println("finally");
		}
	System.out.println("outside finally");
	}

}
