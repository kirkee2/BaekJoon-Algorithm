import java.util.Scanner;

public class Algo11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i = 0 ; i< testCase ; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Case #" + (int)(i+1) + ": " + a +" + "+ b + " = " +(int)(a+b));
		}
		sc.close();
	}

}
