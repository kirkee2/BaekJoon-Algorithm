import java.util.Scanner;

public class Algo1753 { //벨만포드로 하면 시간초과뜸

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vertex = sc.nextInt();
		int edge = sc.nextInt();
		int start = sc.nextInt();
		byte[][] arr = new byte[vertex][vertex];
		double[] answer = new double[vertex];
		boolean update = true;
		
		for(int i = 0 ; i<edge ; i++){
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			byte w = sc.nextByte();
			
			if(arr[x][y] == 0){
				arr[x][y] = w;
			}else{
				if(arr[x][y] > w){
					arr[x][y] = w;
				}
			}
		}
		
		for(int i = 0 ; i<vertex ; i++){
			if(i != start-1){
				answer[i] = -1;
			}
		}
		
		while (update){
			update =false;
			for(int i = 0 ; i< vertex ; i++){
				for(int j = 0 ; j< vertex ; j++){
					if(arr[i][j] != 0){
						if(answer[i] == -1){
							
						}else if(answer[j] == -1){
							answer[j] = answer[i] + arr[i][j];
							update = true;
						}else{
							if(answer[j] > answer[i] +arr[i][j]){
								answer[j] = answer[i] +arr[i][j];
								update = true;
							}
						}
					}
				}
			}
		}
		
		for(int i = 0 ; i<vertex ; i++){
			if(answer[i] == -1){
				System.out.println("INF");
			}else{
				System.out.println((int)answer[i]);
			}
		}
		
		sc.close();
	}

}
