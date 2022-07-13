import java.util.*; 
import java.io.*;

public class USACOMilkPails {

	public static void main(String[] args) throws IOException{
		
		Scanner in = new Scanner(new FileReader("input.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
		
		String[] abc = in.nextLine().split(" ");
		int x = Integer.parseInt(abc[0]);
		int y = Integer.parseInt(abc[1]);
		int m = Integer.parseInt(abc[2]);
		
		int max = 0;
		int xmax = m/x;
		int ymax = m/y;
		
		for(int i = 0;i <= xmax;i ++) {
			for(int j = 0;j <= ymax;j ++) {
				if(i*x + j*x > max && i*x + j*y <= m) {
					max = i*x + j*y;
				}
			}
		}
		
		out.println(max);
		in.close();
		out.close();

	}

}
