import java.util.*; 
import java.io.*;

public class USACOPromotionCounting {

	public static void main(String[] args) throws IOException{
		
		BufferedReader in = new BufferedReader(new FileReader("teleport.in"));
		PrintWriter out = new PrintWriter("teleport.out");
		
		String[] input1 = in.readLine().split(" ");
		int bb = Integer.parseInt(input1[0]);
		int ba = Integer.parseInt(input1[1]);
		String[] input2 = in.readLine().split(" ");
		int sb = Integer.parseInt(input2[0]);
		int sa = Integer.parseInt(input2[1]);
		String[] input3 = in.readLine().split(" ");
		int gb = Integer.parseInt(input3[0]);
		int ga = Integer.parseInt(input3[1]);
		String[] input4 = in.readLine().split(" ");
		int pb = Integer.parseInt(input4[0]);
		int pa = Integer.parseInt(input4[1]);
		
		int bronze = 0;
		int silver = 0;
		int gold = 0;
		int plat = 0;
		
		//new plat
		plat = pa - pb;
		gold -= (pa - pb);
		//new gold
		gold 
		

	}

}
