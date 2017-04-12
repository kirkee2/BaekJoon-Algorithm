import java.util.Scanner;

public class Algo11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		sc.nextLine();
		
		String tmp = sc.nextLine();
		int sum = 0;
		
		for(int i = 0 ; i < testCase ; i++){
			sum += tmp.charAt(i)-'0';
		}
		
		System.out.println(sum);

	}

}
