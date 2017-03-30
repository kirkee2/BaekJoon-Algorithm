import java.util.Scanner;

public class Algo10942 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		String num = "";
		
		for(int i = 1 ; i<=total ; i++){
			num += "" + sc.nextInt();
		}
		
		int question = sc.nextInt();
		
		int[] answer = new int[question];
		
		for(int i = 0 ; i< question; i++){
			String tmp = num.substring(sc.nextInt()-1, sc.nextInt()-1);
			
			if(tmp.compareTo(reverseString(tmp)) == 0){
				answer[i] = 1;
			}else{
				answer[i] = 0;
			}
		}
		
		for(int i = 0 ; i< question; i++){
			System.out.println(answer[i]);
		}
		
	}
	
	public static String reverseString(String s) {
	    return ( new StringBuffer(s) ).reverse().toString();
	 }
}
