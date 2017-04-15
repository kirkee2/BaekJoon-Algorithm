import java.util.ArrayList;
import java.util.Scanner;

public class Algo6603 {

	public static boolean next(ArrayList<Integer> a){
		int point = 0;
		
		for(int i = a.size()-1 ; i>0; i--){
			if(a.get(i) > a.get(i-1)){
				point = i;
				break;
			}
		}
		
		if(point == 0){
			return false;
		}else{
			for(int i = a.size()-1 ; i>point-1 ; i--){
				if(a.get(i) > a.get(point-1)){
					int tmp = a.get(i);
					a.set(i, a.get(point-1));
					a.set(point-1, tmp);
					break;
				}
			}
			
			int total = a.size()-1;
			
			while(point<total){
				int tmp = a.get(point);
				a.set(point, a.get(total));
				a.set(total, tmp);
				point++;
				total--;
			}
			return true;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int t = sc.nextInt();
			
			if(t == 0){
				break;
			}
			
			int a[] = new int[t];
			
			for(int i = 0 ; i<t ; i++){
				a[i] = sc.nextInt();
			}
			
			ArrayList<Integer> d = new ArrayList<Integer>();
			int tmp;
			
			
			for(tmp = 0 ; tmp < t-6 ; tmp++){
				d.add(0);
			}
			
			for(int i = 0 ; i < 6 ; i++){
				d.add(1);
			}
			
			ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
			
			do{
				ArrayList<Integer> current =  new ArrayList<Integer>();
				for (int i=0; i<t; i++) {
	                if (d.get(i) == 1) {
	                    current.add(a[i]);
	                }
	            }
				ans.add(current);
			}while (next(d));
			
			for(int i = ans.size()-1  ; i >=0 ; i--){
				for(int j = i ; j >=0 ; j--){
					for(int k = 0 ; k < ans.get(j).size() ; k++){
						if(ans.get(i).get(k) < ans.get(j).get(k)){
							ArrayList<Integer> tmp1 = ans.get(i);
							ans.set(i, ans.get(j));
							ans.set(j, tmp1);
							break;
						}
					}
				}
			}
			
			
			for(int i = 0 ; i < ans.size() ; i++){
				for(int j = 0 ; j < ans.get(i).size() ; j++){
					System.out.print(ans.get(i).get(j) + " ");
				}
				
				System.out.println();
			}
			
			System.out.println();
		}
	}

}
