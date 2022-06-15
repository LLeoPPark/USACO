import java.util.*; 
import java.io.*;

public class CFSoldierAndBananas {

	public static void main(String[] args) throws IOException{
		
		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split(" ");
		int icost = Integer.parseInt(input[0]);
		int imoney = Integer.parseInt(input[1]);
		int bwant = Integer.parseInt(input[2]);
		int scost = icost * ((bwant * (bwant + 1)) / 2);
		
		if(imoney - scost < 0) {
			System.out.print(Math.abs(imoney - scost));
		}else {
			System.out.print(0);
		}
		

	}

}
