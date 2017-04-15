import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Algo1963 {

	static int change(int a,int t,int c){
		String tmp = a+"";
		if(t == 0 && c == 0){
			return 0;
		}
		char []tmp2 = new char[4];
		for(int i =0 ; i <4 ; i++){
			tmp2[i] = tmp.charAt(i);
		}
		
		tmp2[t] = Character.forDigit(c,10);
	
		tmp = "";
		for(int i =0 ; i <4 ; i++){
			tmp += tmp2[i];
		}
		
		return Integer.parseInt(tmp);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		boolean prime[] = new boolean[10000];
		for(int i = 1000 ; i < 10000 ; i++){
			for(int j = 2 ; j<=(int)Math.sqrt(i) ; j++){
				if(i%j == 0){
					prime[i] = true;
					break;
				}
			}
		}
		
		for(int i = 0 ; i < t; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int d[] = new int[10000];
			boolean c[] = new boolean[10000];
			
			for(int j = 0 ; j<10000 ; j++){
				d[i] = -1;
			}
			
			Queue<Integer> q = new LinkedList<Integer>();
			
			q.offer(a);
			c[a] = true;
			d[a] = 0;
			
			while(q.peek() != null){
				int now = q.poll();
				
				if(now == b){
					break;
				}
				
				for(int j = 0 ; j< 4 ; j++){
					for(int k = 0 ; k<=9 ; k++){
						int tmp = change(now,j,k);
						if(tmp == 0){
							continue;
						}
						if(!prime[tmp]){
							if(!c[tmp]){
								q.offer(tmp);
								c[tmp] = true;
								d[tmp] = d[now] +1;
							}
						}
					}
				}
			}
			
			if(d[b] == -1){
				System.out.println("Impossible");
			}else{
				System.out.println(d[b]);
			}
		}

	}

}
