import java.util.Scanner;

public class Algo10973 {
	 public static boolean prev_permutation(int[] arr) {
	        int i = arr.length-1;
	        
	        
	        while (i > 0 && arr[i-1] <=arr[i]) {
	            i -= 1;
	        }

	        if (i <= 0) {
	            return false;
	        }

	        int j = arr.length-1;
	        while (arr[j] >= arr[i-1]) {
	            j -= 1;
	        }

	        int temp = arr[i-1];
	        arr[i-1] = arr[j];
	        arr[j] = temp;

	        j = arr.length-1;
	        while (i < j) {
	            temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            i += 1;
	            j -= 1;
	        }
	        return true;
	    }
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int testCase = sc.nextInt();
	        int[] arr = new int[testCase];
	        for (int i=0; i<testCase; i++) {
	            arr[i] = sc.nextInt();
	        }
	        if (prev_permutation(arr)) {
	            for (int i=0; i<testCase; i++) {
	                System.out.print(arr[i] + " ");
	            }
	            System.out.println();
	        } else {
	            System.out.println("-1");
	        }
	    }

}
