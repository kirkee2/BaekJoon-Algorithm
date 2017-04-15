import java.util.Scanner;

public class Algo11057 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		long dp[][] = new long[t+1][10];
		
		dp[1][0] = 1;
		dp[1][1] = 1;
		dp[1][2] = 1;
		dp[1][3] = 1;
		dp[1][4] = 1;
		dp[1][5] = 1;
		dp[1][6] = 1;
		dp[1][7] = 1;
		dp[1][8] = 1;
		dp[1][9] = 1;
		
		for(int i = 2 ; i<= t ; i++){
			for(int j = 0 ; j<10 ; j++){
				for(int k = 0 ; k <= j ; k++){
					dp[i][j] += dp[i-1][k];
				}
				dp[i][j] %= 10007;
			}
		}
		
		System.out.println((dp[t][0]+dp[t][1]+dp[t][2]+dp[t][3]+dp[t][4]+dp[t][5]+dp[t][6]+dp[t][7]+dp[t][8]+dp[t][9])%10007);
		
		
	}

}
