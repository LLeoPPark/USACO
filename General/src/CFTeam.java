import java.util.*; 
import java.io.*;

public class CFTeam {

	public static void main(String[] args) throws IOException{
		
		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());
		int [][] test = new int[num][3];
		
		for(int i = 0;i < num;i ++) {
			String[] input = in.nextLine().split(" ");
			for(int o = 0;o < 3;o ++) {
				test[i][o] = Integer.parseInt(input[o]);
			}
		}
		
		int ans = 0;
		int total = 0;
		for (int i = 0;i < num;i ++) {
			total = 0;
			for (int o = 0;o < 3;o ++) {
				if (test[i][o] == 1) {
					total += 1;
				}	
			}
			if (total >= 2) {
				ans += 1;
			}
		}
		System.out.print(ans);
		
		
		

	}

}
