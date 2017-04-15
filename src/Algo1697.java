import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Algo1697 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean check[] = new boolean[200001];
		int d[] = new int[200001];

		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(a);
		check[a] = true;
		d[a] = 0;
		
		while(q.peek() != null){
			int now = q.poll();
			if(now == b){
				break;
			}
			
			if(now*2 < 200001){
				if(!check[now*2]){
					q.offer(now*2);
					check[now*2] = true;
					d[now*2] = d[now] +1;
				}
			}
			
			if(now+1 < 200001){
				if(!check[now+1]){
					q.offer(now+1);
					check[now+1] = true;
					d[now+1] = d[now] +1;
				}
			}
			
			if(now-1 >= 0){
				if(!check[now-1]){
					q.offer(now-1);
					check[now-1] = true;
					d[now-1] = d[now] +1;
				}
			}
		}

		System.out.println(d[b]);

		sc.close();
	}

}
