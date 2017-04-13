import java.util.Scanner;

public class Algo1476 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int e = sc.nextInt(); //16
		int s = sc.nextInt(); //29
		int m = sc.nextInt(); //20
		
		int year = 1;
		int eTmp = year;
		int sTmp = year;
		int mTmp = year;
		
		while(true){
			if(eTmp == 16)
				eTmp = 1;
			
			if(sTmp == 29)
				sTmp = 1;
			
			if(mTmp == 20)
				mTmp = 1;
			
			if(eTmp == e && sTmp ==s && mTmp == m){
				System.out.println(year);
				break;
			}
			
			eTmp++;
			sTmp++;
			mTmp++;
			year++;
		}
		
		sc.close();
	}

}
