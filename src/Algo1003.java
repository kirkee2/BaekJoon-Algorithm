import java.util.Scanner;

public class Algo1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
	
		int[] answer0 = new int[41];
		int[] answer1 = new int[41];
		int[] question = new int[total];
		
		for(int i = 0 ; i<total; i++){
			question[i] = sc.nextInt();	
		}
		
		for(int i = 0 ; i<41; i++){
			answer0[i] = -1;
			answer1[i] = -1;	
		}
		
		answer0[0] = 1;
		answer0[1] = 0;
		
		answer1[0] = 0;
		answer1[1] = 1;
	
		for(int i = 0 ; i<total ; i++){
			for(int j = 2 ; j <= question[i] ; j++){
				if(answer0[question[i]] == -1)
				{
					answer0[j] = answer0[j-1] + answer0[j-2];
				}
				
				if(answer1[question[i]] == -1)
				{
					answer1[j] = answer1[j-1] + answer1[j-2];
				}
			}
			
			System.out.println(answer0[question[i]] + " " +answer1[question[i]]);
		}

		sc.close();
	}
}
