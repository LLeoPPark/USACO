import java.util.*; 
import java.io.*;

public class USACODiamondCollector {

	public static void main(String[] args) throws IOException{
		
		Scanner in = new Scanner(new FileReader("diamond.in"));
		PrintWriter out = new PrintWriter(new FileWriter("diamond.out"));
		
		String[] NandK = in.nextLine().split(" ");
		int N = Integer.parseInt(NandK[0]);
		int K = Integer.parseInt(NandK[1]);
		
		int[] arr = new int[N];
		for(int i = 0;i < N;i ++) {
			arr[i] = in.nextInt();
		}
		
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        } 
		
		int count = 0;
		int ans = 0;
		for(int i = 0;(i + 1) < arr.length;i ++) {
			if((arr[i] + K) >= arr[i + 1]) {
				count += 1;
			}else {
				if (count > ans) {
					ans = count;
				}
			count = 0;
			}
		}
		if (count > ans) {
			ans = count;
		}
		out.println(ans);
	

		in.close();
		out.close();

	}

}
