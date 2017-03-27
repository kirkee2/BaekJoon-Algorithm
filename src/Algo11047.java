import java.util.Scanner;

public class Algo11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int aim = sc.nextInt();
		int[] coins = new int[total];
		int sum = 0;
		boolean check = true;
		int count = 0;
		int real = -1;
		
		for(int i = 0 ; i < total ; i++){
			coins[i] = sc.nextInt();
			if(coins[i]>aim && real == -1){
				real = i-1;
			}
		}
		
		if(real == -1){
			real = total;
		}
		
		while(aim>0){
			int tmp = (int)aim/coins[real];

			sum += coins[real] * tmp;
			aim -= coins[real] * tmp;
			count += tmp;
			
			real--;
		}
		
		/*
		while(check){
			for(int i = 0 ; i <= real ; i++){
				if(coins[i] > aim){
					sum += coins[i-1];
					aim -= coins[i-1];
					count++;
					break;
				}
			}
			if(aim<=0){
				check = false;
			}
		}
		*/
		
		System.out.println(count);
			
		sc.close();
	}

}
