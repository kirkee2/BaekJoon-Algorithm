import java.util.Scanner;

public class Algo11721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String tmp = sc.nextLine();
		
		int rest = tmp.length()%10;
		int sum = 0;
		
		for(int i = 0 ; i<tmp.length()/10 ; i++){
			System.out.println(tmp.substring(i*10, i*10+10));
			sum += 10;	
		}
		
		System.out.println(tmp.substring(sum, tmp.length()));
	}

}
