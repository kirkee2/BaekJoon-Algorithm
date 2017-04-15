import java.util.Scanner;

public class Algo9095DP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	    
	     
	     for(int i = 0 ; i < t ; i++){
	    	 int tmp = sc.nextInt();
	    	 
	    	 int dp[] = new int[tmp+1];
	    	 if(tmp == 1){
		    	 System.out.println(1);
		     }else if(tmp == 2){
		    	 System.out.println(2);
		     }else if(tmp == 3){
		    	 System.out.println(4);
		     }else{
		    	 dp[1] = 1;
		    	 dp[2] = 2;
		    	 dp[3] = 4;
			     for(int j = 4 ; j <= tmp ; j++){
			    	 dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
			     }
			     
			     System.out.println(dp[tmp]);
		     }
	     }       
	     sc.close();
	}
}
