import java.util.Scanner;


public class Algo13560 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10010];
		int team = sc.nextInt();
		int total = 0;
		int sum = 0;
		
		int[] arr = new int[team];
		
		for(int i = 0 ; i<team ; i++){
			arr[i] = sc.nextInt();
			total += i;
			sum += arr[i];
		}
		
		if(sum == total){
			for(int i = 0 ; i < team ; i++){
				for(int j= 0 ; j<team ; j++){
					if(arr[i] == j){
						a[j]++;
					}
				}
			}
			
			for(int i = 0 ; i <team ;i++){
				if(i == 0){
					if(a[0]>1){
						System.out.println("-1");
					}
				}else if(a[i] > i){
					System.out.println("-1");
				}else{
					System.out.println("1");
				}
			}
			
		}else{
			System.out.println("-1");
		}
		
		
		
		sc.close();
	}

}
