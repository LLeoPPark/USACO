import java.util.*; 
import java.io.*;

public class USACOMixingMilk {

	public static void main(String[] args) throws IOException{
		
		Scanner in = new Scanner(new FileReader("mixmilk.in"));
		PrintWriter out = new PrintWriter(new FileWriter("mixmilk.out"));
		
		String[] ab = in.nextLine().split(" ");
		String[] cd = in.nextLine().split(" ");
		String[] ef = in.nextLine().split(" ");
		
		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[1]);
		int c = Integer.parseInt(cd[0]);
		int d = Integer.parseInt(cd[1]);
		int e = Integer.parseInt(ef[0]);
		int f = Integer.parseInt(ef[1]);
		
		int nob = 3;
		ArrayList<Integer> maxcap = new ArrayList<Integer>(); 
		ArrayList<Integer> milk = new ArrayList<Integer>(); 
		maxcap.add(0);
		maxcap.add(0);
		maxcap.add(0);
		milk.add(0);
		milk.add(0);
		milk.add(0);
		
	}

}
