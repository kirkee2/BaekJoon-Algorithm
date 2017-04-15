import java.util.Scanner;

public class Algo10819 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int a[] = new int[t+1];
		int dp[] = new int[t+1];
		
		for(int i = 1 ; i <=t ; i++){
			int tmp = sc.nextInt();
			a[i] = tmp;
			/*
			for(int j = i; j<=t ; j++){
				dp[j] = Math.max(dp[j], dp[j-i]+tmp);
			}
			*/
		}
		
		for(int i = 1 ; i <=t ; i++){
			for(int j = 1 ; j<=i ; j++){
				dp[i] = Math.max(dp[i], a[j] + dp[i-j]);
			}
		}
		
		
		
		System.out.println(dp[t]);
		
		
		sc.close();
	}

}
