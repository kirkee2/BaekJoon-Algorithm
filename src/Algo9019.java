import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Algo9019 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int t= sc.nextInt();
		
		for(int k = 0 ; k<t ; k++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			Queue<Integer> q = new LinkedList<Integer>();
			
			q.offer(a);
			boolean check[] = new boolean[10000];
			String ans[] = new String[10000];
			
			for(int i = 0 ; i<10000 ; i++){
				ans[i] = "";
			}
			check[a] = true;
			
			while(q.peek() != null){
				int now = q.poll();
				
				if(now == b){
					break;
				}
				
				int d = now*2;
				int s = now-1;
				int r = now/10 + (now%10)*1000;
				int l = (now%1000)*10 + now/1000;
				
				if(d>=10000){
					d %=10000;
				}
				
				if(s == -1){
					s = 9999;
				}
				
				if(!check[d]){
					q.offer(d);
					check[d] = true;
					ans[d] = ans[now] + "D";
				}
				
				if(!check[s]){
					q.offer(s);
					check[s] = true;
					ans[s] = ans[now] + "S";
				}
				
				if(!check[l]){
					q.offer(l);
					check[l] = true;
					ans[l] = ans[now] +  "L";
				}
				
				if(!check[r]){
					q.offer(r);
					check[r] = true;
					ans[r] = ans[now] + "R";
				}
			}
			
			System.out.println(ans[b]);
		}
	}
}
