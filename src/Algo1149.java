import java.util.Scanner;

public class Algo1149 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int r,g,b;
		int min = Integer.MAX_VALUE;
		int answer[][] = new int[total][3];
		
		for(int i = 0 ; i < total ;i++){
			r = sc.nextInt();
			g = sc.nextInt();
			b = sc.nextInt();
			
			if(i == 0){
				answer[i][0] = r;
				answer[i][1] = g;
				answer[i][2] = b;	
			}else{
				answer[i][0] = min(answer[i-1][1]+r,answer[i-1][2]+r);
				answer[i][1] = min(answer[i-1][0]+g,answer[i-1][2]+g);
				answer[i][2] = min(answer[i-1][0]+b,answer[i-1][1]+b);	
			}
		}
		
		min = answer[total-1][0];
			
		if(min > answer[total-1][1]){
			min = answer[total-1][1];
		}
		
		if(min > answer[total-1][2]){
			min = answer[total-1][2];
		}
		
		
		System.out.println(min);
	}
	
	static int min(int a,int b){
		if(b>=a){
			return a;
		}else{
			return b;
		}
	}

}
