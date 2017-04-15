import java.util.Scanner;

public class Algo10844 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		long dp[][] = new long[t+1][10];
		
		dp[1][0] = 0;
		dp[1][1] = 1;
		dp[1][2] = 1;
		dp[1][3] = 1;
		dp[1][4] = 1;
		dp[1][5] = 1;
		dp[1][6] = 1;
		dp[1][7] = 1;
		dp[1][8] = 1;
		dp[1][9] = 1;
		
		for(int i = 2 ; i<=t ;i++){
			dp[i][0] = dp[i-1][1];
			dp[i][1] = dp[i-1][0] + dp[i-1][2];
			dp[i][2] = dp[i-1][1] + dp[i-1][3];
			dp[i][3] = dp[i-1][2] + dp[i-1][4];
			dp[i][4] = dp[i-1][3] + dp[i-1][5];
			dp[i][5] = dp[i-1][4] + dp[i-1][6];
			dp[i][6] = dp[i-1][5] + dp[i-1][7];
			dp[i][7] = dp[i-1][6] + dp[i-1][8];
			dp[i][8] = dp[i-1][7] + dp[i-1][9];
			dp[i][9] = dp[i-1][8];
		}
		
		
		System.out.println((dp[t][0]+dp[t][1]+dp[t][2]+dp[t][3]+dp[t][4]+dp[t][5]+dp[t][6]+dp[t][7]+dp[t][8]+dp[t][9])%1000000000);
		
		sc.close();
	}

}
