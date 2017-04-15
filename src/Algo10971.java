import java.util.Scanner;

public class Algo10971 {

	public static boolean next(int a[]){
		int point = 0;
		
		for(int i = a.length-1 ; i>0; i--){
			if(a[i] > a[i-1]){
				point = i;
				break;
			}
		}
		
		if(point == 0){
			return false;
		}else{
			for(int i = a.length-1 ; i>point-1 ; i--){
				if(a[i] > a[point-1]){
					int tmp = a[i];
					a[i] = a[point-1];
					a[point-1] = tmp;
					break;
				}
			}
			
			int total = a.length-1;
			
			while(point<total){
				int tmp = a[point];
				a[point] = a[total];
				a[total] = tmp;
				point++;
				total--;
			}
			return true;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int w[][] = new int[t][t];
		int search[] = new int[t];
		int sum = 0;
		int answer = Integer.MAX_VALUE;
		boolean check = false;
		
		
		for(int i = 0 ; i<t ; i++){
			search[i] = i;
			for(int j = 0 ; j<t ; j++){
				w[i][j] = sc.nextInt();
			}
		}
		
		do{
			for(int i = 0 ; i<t-1; i++){
				if(w[search[i]][search[i+1]] == 0){
					check = true;
					break;
				}
				sum += w[search[i]][search[i+1]];
			}
			
			if(w[search[t-1]][search[0]] == 0){
				check = true;
			}else{
				sum += w[search[t-1]][search[0]];
			}
			
			if(check){
				sum =0;
				check = false;
			}else{
				if(answer>sum){
					answer = sum;
				}
				sum =0;
			}
		}while(next(search));
		
		System.out.println(answer);
	}

}
