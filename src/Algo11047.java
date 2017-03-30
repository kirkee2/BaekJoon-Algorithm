import java.util.Scanner;

public class Algo11047 {
//greedy algorithm
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int aim = sc.nextInt();
		int[] coins = new int[total];
		int count = 0;
		int real = -1;
		
		for(int i = 0 ; i < total ; i++){
			coins[i] = sc.nextInt();
			if(coins[i]>aim && real == -1){
				real = i-1;
			}
		}
		
		if(real == -1){
			real = total-1;
		}
		
		while(aim>0){
			int tmp = (int)aim/coins[real];

			aim -= coins[real] * tmp;
			count += tmp;
			
			real--;
		}
		
		System.out.println(count);
			
		sc.close();
	}

}
