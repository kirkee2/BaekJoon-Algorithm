import java.util.Scanner;

public class Algo10819 {
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
		int a[] = new int[t];
		int sum = 0;
		int answer = 0;
		
		for(int i = 0 ; i <t ; i++){
			a[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i<t ; i++){
			for(int j = i ; j<t ; j++){
				if(a[i]>=a[j]){
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		
		do{
			for(int i = 0 ; i< t-1 ; i++){
				sum += Math.abs(a[i] - a[i+1]);
			}
			
			if(sum>answer){
				answer = sum;
			}
			
			sum = 0;
		}while(next(a));
		
		
		System.out.println(answer);
	
		sc.close();
	}

}
