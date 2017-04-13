import java.util.Scanner;

public class Algo1463 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int dp[] = new int[t+1];
		
		dp[0] = 0;
		dp[1] = 0;
		
		/*
		for(int i = 2; i<=t ; i++){
			if(i%3 ==0 && i%2 == 0){
				dp[i] = min(dp[i/3],dp[i/2],dp[i-1]) +1;
			}else if(i%3 ==0){
				dp[i] = min(dp[i/3],dp[i-1]) + 1;
			}else if(i%2 == 0){
				dp[i] = min(dp[i/2],dp[i-1]) + 1;
			}else{
				dp[i] = dp[i-1] +1;
			}
		}
		*/
		
		for(int i = 2; i<=t ; i++){
			dp[i] = dp[i-1] +1;
			
			if(i%3 ==0 && dp[i] > dp[i/3]+1){
				dp[i] = dp[i/3]+1;
			}
			
			if(i%2 ==0 && dp[i] > dp[i/2]+1){
				dp[i] = dp[i/2]+1;
			}
		}
		
		System.out.println(dp[t]);

		sc.close();
	}

	static int min(int a, int b){
		if(a>b){
			return b;
		}else{
			return a;
		}
	}
	
	static int min(int a, int b, int c){
		if(a <= b && a <= c){
			return a;
		}else if(b <=a && b <= c){
			return b;
		}else{
			return c;
		}
	}
}
