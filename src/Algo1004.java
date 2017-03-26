import java.util.Scanner;

public class Algo1004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = sc.nextInt();
		int[] answer = new int[total];
		
		int[] startx = new int[total];
		int[] starty = new int[total];
		int[] endx = new int[total];
		int[] endy = new int[total];
		int[] totalPlanet = new int[total];
		int[][][] planets = new int[total][][];
		
		for(int i = 0 ; i < total ; i++){
			answer[i] = 0;
		}
		
		for(int i = 0 ; i < total ; i++){
			startx[i] = sc.nextInt();
			starty[i] = sc.nextInt();
			endx[i] = sc.nextInt();
			endy[i] = sc.nextInt();
			totalPlanet[i] = sc.nextInt();
			planets[i] = new int[totalPlanet[i]][3];
			
			for(int j = 0 ; j<totalPlanet[i] ; j++){
				for(int k = 0 ; k<3; k++){
					planets[i][j][k] = sc.nextInt();
				}
			}
		}
		
		
		for(int i = 0 ; i<total ; i++){
			for(int j = 0 ; j<totalPlanet[i] ; j++){
				boolean startCheck = Math.sqrt((startx[i] - planets[i][j][0]) * (startx[i] - planets[i][j][0]) + (starty[i] - planets[i][j][1]) *(starty[i] - planets[i][j][1])) <= planets[i][j][2];
				boolean endCheck = Math.sqrt((endx[i] - planets[i][j][0]) * (endx[i] - planets[i][j][0]) + (endy[i] - planets[i][j][1]) *(endy[i] - planets[i][j][1])) <= planets[i][j][2];
				
				if(startCheck && endCheck){
			
				}else if(startCheck || endCheck){
					answer[i] += 1;
				}
			}
		}
		
		for(int i = 0 ; i < total ; i++){
			System.out.println(answer[i]);
		}
		
		/*
		for(int i = 0 ; i < total ; i++){
			System.out.println("startx == "+startx[i]);
			System.out.println("starty == "+starty[i]);
			System.out.println("endx == "+endx[i]);
			System.out.println("endy == "+endy[i]);
			System.out.println("totalPlanet == "+totalPlanet[i]);
			
			for(int j = 0 ; j<totalPlanet[i] ; j++){
				
				for(int k = 0 ; k<3; k++){
					System.out.print("planets["+i+"]["+j+"]["+k+"] == "+planets[i][j][k] + "  /   ");
				}
				
				System.out.println();
			}
		}
		*/	
		
		sc.close();
	}
}
