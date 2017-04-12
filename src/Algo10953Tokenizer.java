import java.util.Scanner;
import java.util.StringTokenizer;

public class Algo10953Tokenizer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 0 ; i<testCase ; i++){
			String tmp = sc.nextLine();
			
			StringTokenizer st = new StringTokenizer(tmp,",");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			System.out.println(a+b);
		}
	}

}
