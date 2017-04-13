import java.util.Scanner;

public class Algo10972 {
	public static boolean next_permutation(int[] a) {
		int point = 0;

		for(int i = a.length-1 ; i >0 ; i--){
			if(a[i] >= a[i-1]){
				point = i;
				break;
			}
		}

        // 마지막 순열
        if (point == 0) {
            return false;
        }

        int j = a.length-1;
        while (a[j] <= a[point-1]) {
            j -= 1;
        }

        int temp = a[point-1];
        a[point-1] = a[j];
        a[j] = temp;

        j = a.length-1;
        while (point < j) {
            temp = a[point];
            a[point] = a[j];
            a[j] = temp;
            point++;
            j--;
        }
        
        return true;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		int arr[] = new int[testCase];
		int point = 0;
		int last = testCase -1;
        
		for(int i = 0 ; i<testCase ; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i = testCase-1 ; i >0 ; i--){
			if(arr[i] >= arr[i-1]){
				point = i;
				break;
			}
		}
		
		if(point != 0){			
			int swap = point;
			/*
	        while (arr[swap] <= arr[point-1]) {
	            swap -= 1;
	        }
	        */
			
	        
			for(int i = testCase-1 ; i>=point ;i--){
				if(arr[i] > arr[point-1]){
					swap = i;
					break;
				}
			}
			
			
			int tmp = arr[swap];
			arr[swap] = arr[point-1];
			arr[point-1] = tmp;
			
			while (point < last) {
	            tmp = arr[point];
	            arr[point] = arr[last];
	            arr[last] = tmp;
	            point++;
	            last--;
	        }
			
			/*
			 * 이게 틀렸었음.
			for(int i = point ; i<(point + testCase)/2 ;i++){
				tmp = arr[point];
				arr[point] = arr[testCase-1-i+point];
				arr[testCase-1-i+point] = tmp;
			}
			*/  
			
			for(int i = 0 ; i<testCase ; i++){
				System.out.print(arr[i] + " ");
			}
		}else{
			System.out.print("-1");
		}
		
		System.out.println();
	}
}
