import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Algo10875 {

	static final int RIGHT =0;
	static final int DOWN =1;
	static final int LEFT =2;
	static final int UP =3;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, Boolean> myMap = new HashMap<String, Boolean>();
		int t = sc.nextInt();
		int currentT =0;
		int currentLo[] = {t,t}; 
		
		int cDirect = RIGHT;
		
		myMap.put(t+" "+t, true);
		
		int n = sc.nextInt();
		int changeT[] = new int[n];
		char changeD[] = new char[n];
		
		for(int i = 0 ; i <n ; i++){
			changeT[i] = sc.nextInt();
			
			String tmp = sc.nextLine();
			changeD[i] = tmp.charAt(1);
		}	
		
		int tmpT = 0;
		int nCount = 0;
		
		while(true){
			currentT++;
			tmpT++;
			if(cDirect == RIGHT){
				currentLo[1]++;
			}else if(cDirect == DOWN){
				currentLo[0]++;
			}else if(cDirect == LEFT){
				currentLo[1]--;
			}else{
				currentLo[0]--;
			}
			
			if(currentLo[0] <0 || currentLo[0] >= t*2+1 || currentLo[1] <0 || currentLo[1] >= t*2+1){
				//System.out.println("DEAD = " + currentT);
				System.out.println(currentT);
				break;
			}
			
			if(myMap.containsKey(currentLo[0]+" "+currentLo[1])){
				System.out.println(currentT);
				break;
			}


			if(nCount < n){
				if(tmpT == changeT[nCount]){
					if(changeD[nCount] == 'R'){
						cDirect++;
						if(cDirect == 4){
							cDirect = 0;
						}
					}else{
						cDirect--;
						if(cDirect == -1){
							cDirect = 3;
						}
					}
					
					tmpT =0;
					nCount++;
				}
			}
			
			myMap.put(currentLo[0]+" "+currentLo[1], true);
		}
		sc.close();
	}
}
