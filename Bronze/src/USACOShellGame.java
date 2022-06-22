import java.util.*; 
import java.io.*;

public class USACOShellGame {

	public static void main(String[] args) throws IOException{
		
		Scanner in = new Scanner(new FileReader("shell.in"));
		PrintWriter out = new PrintWriter(new FileWriter("shell.out"));
		
		int N = Integer.parseInt(in.nextLine());
		int[] shell_at_position = new int[3];
		int[] counter = new int[3];
		
		for(int i = 0; i < 3;i ++) {
			shell_at_position[i] = i;
		}
		for(int i = 0; i < N;i ++) {
			
			String[] input = in.nextLine().split(" ");
			int a = Integer.parseInt(input[0])-1;
			int b = Integer.parseInt(input[1])-1;
			int g = Integer.parseInt(input[2])-1;
			
			int temp = shell_at_position[b];
			shell_at_position[b] = shell_at_position[a];
			shell_at_position[a] = temp;
			
			counter[shell_at_position[g]]++;
		}
		
		out.println(Math.max(counter[0],Math.max(counter[1], counter[2])));
		
		in.close();
		out.close();
	}

}
