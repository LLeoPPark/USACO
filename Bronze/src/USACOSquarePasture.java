import java.util.*; 
import java.io.*;

public class USACOSquarePasture {

	public static void main(String[] args) throws IOException{
		
		Scanner in = new Scanner(new FileReader("square.in"));
		PrintWriter out = new PrintWriter(new FileWriter("square.out"));
		
		String[] abcd = in.nextLine().split(" ");
		String[] efgh = in.nextLine().split(" ");
		
		int a = Integer.parseInt(abcd[0]);
		int b = Integer.parseInt(abcd[1]);
		int c = Integer.parseInt(abcd[2]);
		int d = Integer.parseInt(abcd[3]);
		int e = Integer.parseInt(efgh[0]);
		int f = Integer.parseInt(efgh[1]);
		int g = Integer.parseInt(efgh[2]);
		int h = Integer.parseInt(efgh[3]);	
		
		int max1 = Math.max(c, g);
        int min1 = Math.min(a, e);
        
        int max2 = Math.max(d, h);
        int min2 = Math.min(b, f);
        
        int side = Math.max(max1 - min1, max2 - min2);
        System.out.println(side);
        
		out.println((side) * (side));
		
		in.close();
		out.close(); 

	}

}
