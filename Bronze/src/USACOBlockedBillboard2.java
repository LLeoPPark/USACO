import java.util.*; 
import java.io.*;

public class USACOBlockedBillboard2 {

	public static void main(String[] args) throws IOException{
		
		Scanner in = new Scanner(new FileReader("billboard.in"));
		PrintWriter out = new PrintWriter(new FileWriter("billboard.out"));
		
		String[] abcd = in.nextLine().split(" ");
		String[] efgh = in.nextLine().split(" ");
		
		int x1 = Integer.parseInt(abcd[0]);
		int y1 = Integer.parseInt(abcd[1]);
		int x2 = Integer.parseInt(abcd[2]);
		int y2 = Integer.parseInt(abcd[3]);
		int x3 = Integer.parseInt(efgh[0]);
		int y3 = Integer.parseInt(efgh[1]);
		int x4 = Integer.parseInt(efgh[2]);
		int y4 = Integer.parseInt(efgh[3]);
		
		int corners = 0;
		if(x1 >= x3 && x1 <= x4 && y1 >= y3 && y1 <= y4) {
			corners += 1;
		}
		if(x2 >= x3 && x2 <= x4 && y1 >= y3 && y1 <= y4) {
			corners += 1;
		}
		if(x1 >= x3 && x1 <= x4 && y2 >= y3 && y2 <= y4) {
			corners += 1;
		}
		if(x2 >= x3 && x2 <= x4 && y2 >= y3 && y2 <= y4) {
			corners += 1;
		}
		
		if(corners < 2) {
			out.println((x2-x1)*(y2-y1));
		}
		else if(corners == 4) {
			out.println(0);
		}else {
			int xl = Math.max(x1,  x3);
			int xr = Math.min(x2,  x4);
			int yl = Math.max(y1,  y3);
			int yr = Math.min(y2,  y4);
			
			out.println((x2 - x1)*(y2 - y1) - (xr - xl)*(yr - yl));
		}
		in.close();
		out.close();

	}

}
