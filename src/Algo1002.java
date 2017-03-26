import java.util.Scanner;

//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;

public class Algo1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		
		int[] answer = new int[total];
		
		for(int i = 0 ; i<total; i++){
			int aX = sc.nextInt();
			int aY = sc.nextInt();
			int aR= sc.nextInt();
			
			int bX = sc.nextInt();
			int bY = sc.nextInt();
			int bR = sc.nextInt();
			
			if(aX == bX && aY == bY){
				if(aR == bR){
					answer[i] = -1;
				}else{
					answer[i] = 0;
				}
			}else{
				double dis = Math.sqrt((aX - bX) * (aX - bX) + (aY - bY) * (aY - bY));
				int radiusSum = aR + bR;
				int min = Math.abs(aR- bR);
				
				if(dis < radiusSum && dis > min){
					answer[i] = 2;
				}else if(dis == radiusSum || dis == min){
					answer[i] = 1;
				}else{
					answer[i] = 0;
				}
			}
		}
	
		for(int i = 0 ; i<total; i++){
			System.out.println(answer[i]);
		}
		sc.close();
	}
}
/*
public class Algo1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		
		JSONArray a = new JSONArray();
		JSONArray b = new JSONArray();
		
		for(int i = 0 ; i<total; i++){
			JSONObject aTmp = new JSONObject();
			JSONObject bTmp = new JSONObject();
			
			aTmp.put("x", sc.nextInt());
			aTmp.put("y", sc.nextInt());
			aTmp.put("r", sc.nextInt());
			
			aTmp.get("x");
			
			a.add(aTmp);
			
			bTmp.put("x", sc.nextInt());
			bTmp.put("y", sc.nextInt());
			bTmp.put("r", sc.nextInt());
			b.add(bTmp);
		}
		
		for(int i = 0 ; i<total; i++){
			JSONObject aTmp = new JSONObject();
			JSONObject bTmp = new JSONObject();
			aTmp = (JSONObject) a.get(i);
			bTmp = (JSONObject) b.get(i);
			
			if((int)aTmp.get("x") == (int)bTmp.get("x") && (int)aTmp.get("y")  == (int)bTmp.get("y")){
				if((int)aTmp.get("r") == (int)bTmp.get("r")){
					System.out.println(-1);
				}else{
					System.out.println(0);
				}
			}else{
				int xDif = ((int)aTmp.get("x") - (int)bTmp.get("x")) * ((int)aTmp.get("x") - (int)bTmp.get("x"));
				int yDif = ((int)aTmp.get("y") - (int)bTmp.get("y")) * ((int)aTmp.get("y") - (int)bTmp.get("y"));
				int totalDif = xDif + yDif;
				
				int radiusSum = ((int)aTmp.get("r") + (int)bTmp.get("r")) * ((int)aTmp.get("r") + (int)bTmp.get("r"));
				
				if(totalDif > radiusSum){
					System.out.println(0);
				}else if(totalDif < radiusSum){
					System.out.println(2);
				}else{
					System.out.println(1);
				}
			}
		}
		
		
		sc.close();
	}
}
*/
