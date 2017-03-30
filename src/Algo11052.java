import java.util.ArrayList;
import java.util.Scanner;

public class Algo11052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int current;
		int[] arr = new int[total+1];
		
		for(int i = 1 ; i <= total ; i++){
			current = sc.nextInt();		
			
			for(int j = i ; j <= total; j++) {
				arr[j] = Math.max(arr[j],arr[j-i] + current);
			}
		}
		
		System.out.println(arr[total]);
		
		sc.close();
	}

}

