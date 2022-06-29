import java.util.*; 
import java.io.*;

public class USACOCowSignal {

	public static void main(String[] args) throws IOException{
		
		Scanner in = new Scanner(new FileReader("input.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
	       
		int rowsorig = in.nextInt();
	    int colorig = in.nextInt();
	    int multf = in.nextInt();
	        
	    for(int r = 0; r<rowsorig; r++){
	    	String line = in.next();
	    	String answer = "";
	    	for (int i = 0; i<line.length(); i++){
	    		for(int k = 0; k<multf; k++){
	    			answer = answer+line.substring(i,i+1);
	    		}
	    	}
	    	for (int k = 0; k<multf; k++){
	    		out.println(answer);
	    	}
	    }
		
		
		
		
		in.close();
		out.close(); 
		

	}

}
