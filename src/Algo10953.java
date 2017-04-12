import java.util.Scanner;

public class Algo10953 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 0 ; i<testCase ; i++){
			String tmp = sc.nextLine();
			int a = tmp.charAt(0)- '0';
			int b = (int)tmp.charAt(2) - '0';
			
			System.out.println(a+b);
		}
	}
}
