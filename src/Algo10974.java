import java.util.Scanner;

public class Algo10974 {

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
		
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i = 0 ; i<num ; i++){
			arr[i] = i+1;
		}
		
		do{
			for(int i = 0 ; i<num ; i++){
				System.out.print(arr[i] + " ");
			}
			
			System.out.println();
		}while(next_permutation(arr));
		
	}

}
