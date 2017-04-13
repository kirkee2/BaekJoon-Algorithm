import java.util.Scanner;

public class Algo1722 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   
		long fac[] = new long[21];
		boolean check[] = new boolean[21];
		
		fac[0] = 1;
		for(int i = 1 ; i <= 20; i++){
			fac[i] = fac[i-1]*i;
		}
		
		int n = sc.nextInt();
		
		int option = sc.nextInt();
		
		if(option == 1){
			long degree = sc.nextLong();
			int answer[] = new int[n];
			
			for(int i = 0 ; i < n ; i++){
				for(int j =1 ; j<=n ; j++){
					if (check[j] == true){
						continue;
					}
	                if (fac[n-i-1] < degree) {
	                    degree -= fac[n-i-1];
	                }else {
	                    answer[i] = j;
	                    check[j] = true;
	                    break;
	                }
				}
			}
			
			for(int i = 0 ; i < n ; i++){
				System.out.print(answer[i] + " ");
			}
			System.out.println();
		}else if(option == 2){
			long sum = 0;
			int qu[] = new int[n];
			for(int i = 0 ; i <n ; i++){
				qu[i] = sc.nextInt();
			}
			
			for(int i = 0 ; i<n ; i++){
				for(int j = 1 ; j<qu[i] ; j++){
					if(check[j] == false){
						sum += fac[n-i-1];
					}
				}
				
				check[qu[i]] = true;
			}
			
			System.out.println(sum+1);
		}
	}
}
