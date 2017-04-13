import java.util.Scanner;
import java.util.StringTokenizer;

public class Algo11723Intuition {

	boolean array[];
	
	Algo11723Intuition(){
		array = new boolean[21];
		
		for(int i = 0 ; i < 21 ; i++){
			array[i] = false;
		}
	}
	/*
	add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
	remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
	check x: S에 x가 있으면 1을, 없으면 0을 출력한다.
	toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
	all: S를 {1, 2, ..., 20} 으로 바꾼다.
	empty: S를 공집합으로 바꾼다. 
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Algo11723Intuition a = new Algo11723Intuition();
		
		int testCase = sc.nextInt();
		sc.nextLine();
		
		
		for(int i = 0 ; i<testCase ; i++){
			String tmp = sc.nextLine();
			StringTokenizer st = new StringTokenizer(tmp);
			
			String command = st.nextToken();
			
			if(command.compareTo("add") == 0){
				a.add(Integer.parseInt(st.nextToken()));
			}else if(command.compareTo("check") == 0){
				a.check(Integer.parseInt(st.nextToken()));
			}else if(command.compareTo("remove") == 0){
				a.remove(Integer.parseInt(st.nextToken()));
			}else if(command.compareTo("toggle") == 0){
				a.toggle(Integer.parseInt(st.nextToken()));
			}else if(command.compareTo("all") == 0){
				a.all();
			}else{
				a.empty();
			}
		}
		
		sc.close();
	}
	
	void add(int index){
		array[index] = true;
	}
	
	void remove(int index){
		array[index] = false;
	}
	
	void check(int index){
		if(array[index]){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
	}
	
	void toggle(int index){
		for(int i = 1 ; i < 21 ; i++){
			if(array[i]){
				array[i] = false;
			}else{
				array[i] = true;
			}
		}
	}
	
	void all(){
		for(int i = 1 ; i < 21 ; i++){
			array[i] = true;
		}
	}
	
	void empty(){
		for(int i = 1 ; i < 21 ; i++){
			array[i] = false;
		}
	}
}
