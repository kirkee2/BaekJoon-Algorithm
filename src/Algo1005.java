import java.util.ArrayList;
import java.util.Scanner;

public class Algo1005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		
		boolean update =true;
		
		int[][] answer = new int[total][];
		int[] buildingCount = new int[total];
		int[] buildingRuleCount = new int[total];
		int[][] buildingDelay = new int[total][];
		
		ArrayList<Integer> startPoint = new ArrayList<Integer>();
		
		int[] aim = new int[total];
		
		int[][][] arr = new int[total][][];
		
		
		for(int i = 0 ; i<total ; i++){
			buildingCount[i] = sc.nextInt();
			buildingRuleCount[i] = sc.nextInt();
			buildingDelay[i] = new int[buildingCount[i]];
			arr[i] = new int[buildingCount[i]][buildingCount[i]];
			answer[i] = new int[buildingCount[i]];
			
			for(int j = 0 ; j< buildingCount[i] ; j++){
				buildingDelay[i][j] = sc.nextInt();
			}
			for(int j = 0 ; j< buildingRuleCount[i] ; j++){
				int start = sc.nextInt();
				int end = sc.nextInt();
				
				arr[i][start-1][end-1] = buildingDelay[i][start-1];
			}
			
			aim[i] = sc.nextInt();	
		}
		
		for(int i = 0 ; i<total ; i++){
			for(int j = 0 ; j< buildingCount[i] ; j++){
				answer[i][j] = -1;
			}
		}
		
		for(int i = 0 ; i<total ; i++){
			for(int j = 0 ; j< buildingCount[i] ; j++){
				for(int k = 0 ; k< buildingCount[i] ; k++){
					if(arr[i][j][k] != 0){
						if(!startPoint.contains((Integer)j)){
							startPoint.add(j);
						}
					}
				}
			}
			
			for(int j = 0 ; j< buildingCount[i] ; j++){
				for(int k = 0 ; k< buildingCount[i] ; k++){
					if(arr[i][j][k] != 0){
						startPoint.remove((Integer)k);
					}
				}
			}
			
			for(int j = 0 ; j < startPoint.size() ; j++){
				answer[i][startPoint.get(j)] = 0;
			}
			
			startPoint.clear();
		}
	
		
		for(int i = 0 ; i<total ; i++){
			while (update){
				update =false;
				for(int j = 0 ; j< buildingCount[i] ; j++){
					for(int k = 0 ; k< buildingCount[i] ; k++){
						if(arr[i][j][k] != 0){
							if(answer[i][k] == -1){
								answer[i][k] = answer[i][j]+arr[i][j][k];
								update = true;
							}else{
								if(answer[i][k] < answer[i][j]+arr[i][j][k]){
									answer[i][k] = answer[i][j]+arr[i][j][k];
									update = true;
								}
							}
						}
					}
				}
			}
			update= true;
		}
		
		
		for(int i = 0 ; i<total ; i++){
			System.out.println(answer[i][aim[i]-1] + buildingDelay[i][aim[i]-1]);
		}
		

		sc.close();
	}

}
