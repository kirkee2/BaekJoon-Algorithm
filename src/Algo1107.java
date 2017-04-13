import java.util.Scanner;

public class Algo1107 {

	static boolean broken[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		broken = new boolean[10];

		int target = sc.nextInt();
		int move = Math.abs(target - 100);
		int min = Integer.MAX_VALUE;
		
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++){
			broken[sc.nextInt()] = true;
		}
		for(int i = 0 ; i<=1000000 ; i++){
			if(possible(i) != 0){
				if(min > possible(i) + Math.abs(i - target)){
					min = possible(i) + Math.abs(i - target);
				}
			}
		}
		
		if(min>move){
			System.out.println(move);
		}else{
			System.out.println(min);
		}
		
		sc.close();
	}
	
	static int possible(int i){
		if(i == 0){
			if(broken[0]){
				return 0;
			}else{
				return 1;
			}
		}
		int len = 0;
		
		while(i>0){
			if(broken[i%10]){
				return 0;
			}
				
			i /= 10;
			len++;
		}
		return len;
	}

}
