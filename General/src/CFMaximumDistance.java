import java.util.*; 
import java.io.*;

public class CFMaximumDistance {

	public static void main(String[] args) throws IOException{
		
		Scanner in = new Scanner(System.in);
		int numN = Integer.parseInt(in.nextLine());
		String[] XValue = in.nextLine().split(" ");
		String[] YValue = in.nextLine().split(" ");
		
		int max = 0;
		for(int i = 0;i < numN;i ++) {
			for(int o = 0;o < numN;o ++) {
				int dx = Integer.parseInt(XValue[i]) - Integer.parseInt(XValue[i]);
				int dy = Integer.parseInt(YValue[i]) - Integer.parseInt(YValue[i]);
				max = Math.max(max,  dx*dx + dy*dy);
			}
		}
		System.out.println(max);

	}

}
