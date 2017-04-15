import java.util.Scanner;

public class Algo10844 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int dp[] = new int[t+1];
		
		dp[1] = 9;
		
		for(int i = 2 ; i<=t ;i++){
			dp[i] = dp[i-1]*2-i+1;
		}
		
		
		System.out.println(dp[t]);
		
		sc.close();
	}

}
