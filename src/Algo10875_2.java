import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Algo10875_2 {
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
		int previousLo[] = {t,t}; 
		boolean end = false;
		
		int cDirect = RIGHT;
		
		myMap.put(t+" "+t, true);
		
		int n = sc.nextInt();
		
		if(n == 0){
			System.out.println(t+1);
		}else{
			for(int i = 0 ; i <n ; i++){
				int changeT = sc.nextInt();
				String tmp = sc.nextLine();
				char changeD = tmp.charAt(1);
				
				//System.out.println("Check changeT = " + changeT + " changeD = " +changeD);
				
				if(cDirect == RIGHT){
					previousLo[1] = currentLo[1];
					currentLo[1] += changeT;
					
					for(int j = previousLo[1]+1 ; j <= currentLo[1] ; j++){
						currentT++;
						//System.out.println("RIGHT currentT = " + currentT + "   currentLo[0] = " + currentLo[0] + " currentLo[1] = "+ j);
						if(j >= t*2+1 || myMap.containsKey(currentLo[0]+" "+j)){
							//System.out.println("RIGHT DEAD");
							System.out.println(currentT);
							end = true;
							break;
						}
						myMap.put(currentLo[0]+" "+j, true);
					}
				}else if(cDirect == DOWN){
					previousLo[0] = currentLo[0];
					currentLo[0] += changeT;
					
					for(int j = previousLo[0]+1 ; j <= currentLo[0] ; j++){
						currentT++;
						//System.out.println("DOWN currentT = " + currentT + "   currentLo[0] = " + j + " currentLo[1] = "+ currentLo[1]);
						if(j >= t*2+1 || myMap.containsKey(j+" "+currentLo[1])){
							//System.out.println("DOWN DEAD");
							System.out.println(currentT);
							end = true;
							break;
						}
						myMap.put(j+" "+currentLo[1], true);
					}
				}else if(cDirect == LEFT){
					previousLo[1] = currentLo[1];
					currentLo[1] -= changeT;
					
					for(int j = previousLo[1]-1 ; j >= currentLo[1] ; j--){
						currentT++;
						//System.out.println("LEFT currentT = " + currentT + "   currentLo[0] = " + currentLo[0] + " currentLo[1] = "+ j);
						if(j < 0 || myMap.containsKey(currentLo[0]+" "+j)){
							//System.out.println("LEFT DEAD");
							System.out.println(currentT);
							end = true;
							break;
						}
						myMap.put(currentLo[0]+" "+j, true);
					}
				}else{
					previousLo[0] = currentLo[0];
					currentLo[0] -= changeT;
					
					for(int j = previousLo[0]-1 ; j >= currentLo[0] ; j--){
						currentT++;
						//System.out.println("UP currentT = " + currentT + "   currentLo[0] = " + j + " currentLo[1] = "+ currentLo[1]);
						if(j <0 || myMap.containsKey(j+" "+currentLo[1])){
							//System.out.println("UP DEAD");
							System.out.println(currentT);
							end = true;
							break;
						}
						myMap.put(j+" "+currentLo[1], true);
					}
				}
				
				if(end){
					break;
				}
				
				if(changeD == 'R'){
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
			}
			
			while(true){
				if(cDirect == RIGHT){
					previousLo[1] = currentLo[1];
					currentLo[1] += 1;
					
					for(int j = previousLo[1]+1 ; j <= currentLo[1] ; j++){
						currentT++;
						//System.out.println("RIGHT currentT = " + currentT + "   currentLo[0] = " + currentLo[0] + " currentLo[1] = "+ j);
						if(j >= t*2+1 || myMap.containsKey(currentLo[0]+" "+j)){
							//System.out.println("RIGHT DEAD");
							System.out.println(currentT);
							end = true;
							break;
						}
					}
				}else if(cDirect == DOWN){
					previousLo[0] = currentLo[0];
					currentLo[0] += 1;
					
					for(int j = previousLo[0]+1 ; j <= currentLo[0] ; j++){
						currentT++;
						//System.out.println("DOWN currentT = " + currentT + "   currentLo[0] = " + j + " currentLo[1] = "+ currentLo[1]);
						if(j >= t*2+1 || myMap.containsKey(j+" "+currentLo[1])){
							//System.out.println("DOWN DEAD");
							System.out.println(currentT);
							end = true;
							break;
						}
					}
				}else if(cDirect == LEFT){
					previousLo[1] = currentLo[1];
					currentLo[1] -= 1;
					
					for(int j = previousLo[1]-1 ; j >= currentLo[1] ; j--){
						currentT++;
						//System.out.println("LEFT currentT = " + currentT + "   currentLo[0] = " + currentLo[0] + " currentLo[1] = "+ j);
						if(j < 0 || myMap.containsKey(currentLo[0]+" "+j)){
							//System.out.println("LEFT DEAD");
							System.out.println(currentT);
							end = true;
							break;
						}
					}
				}else{
					previousLo[0] = currentLo[0];
					currentLo[0] -= 1;
					
					for(int j = previousLo[0]-1 ; j >= currentLo[0] ; j--){
						currentT++;
						//System.out.println("UP currentT = " + currentT + "   currentLo[0] = " + j + " currentLo[1] = "+ currentLo[1]);
						if(j <0 || myMap.containsKey(j+" "+currentLo[1])){
							//System.out.println("UP DEAD");
							System.out.println(currentT);
							end = true;
							break;
						}
					}
				}
				
				if(end){
					break;
				}
			}
		}	
		
		sc.close();
	}

}
