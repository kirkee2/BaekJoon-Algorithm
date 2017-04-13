import java.util.Scanner;
import java.util.StringTokenizer;


//속도 문제 떄문에 c++로 풀어야 풀린다.

/*코드 

#include <cstdio>
#include <cstring>

using namespace std;

char tmp[111];
int main(){
  int bitMask = 0;
  int testCase;
  scanf("%d",&testCase);
  int index;
  
  while(testCase--){
    scanf("%s",tmp);
    if(!strcmp(tmp,"add")){
      scanf("%d",&index);
      index--;
      bitMask = bitMask | (1 << index);
    }else if(!strcmp(tmp,"check")){
      scanf("%d",&index);
      index--;
      if((bitMask & (1 << index)) != 0){
        printf("1\n");
      }else{
        printf("0\n");
      }
    }else if(!strcmp(tmp,"remove")){
      scanf("%d",&index);
      index--;
      bitMask = bitMask & ~(1 << index);
    }else if(!strcmp(tmp,"toggle")){
      scanf("%d",&index);
      index--;
      bitMask = bitMask ^ (1 << index);
    }else if(!strcmp(tmp,"all")){
      bitMask = (1<<20) -1;
    }else{
      bitMask = 0;
    }
  }
} 
 */
public class Algo11723 {

	public static int bitMask;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		sc.nextLine();		
		
		for(int i = 0 ; i<testCase ; i++){
			String tmp = sc.nextLine();
			StringTokenizer st = new StringTokenizer(tmp);
			
			String command = st.nextToken();
			
			if(command.compareTo("add") == 0){
				add(Integer.parseInt(st.nextToken())-1);
			}else if(command.compareTo("check") == 0){
				check(Integer.parseInt(st.nextToken())-1);
			}else if(command.compareTo("remove") == 0){
				remove(Integer.parseInt(st.nextToken())-1);
			}else if(command.compareTo("toggle") == 0){
				toggle(Integer.parseInt(st.nextToken())-1);
			}else if(command.compareTo("all") == 0){
				all();
			}else{
				empty();
			}
		}
	}
	
	static void add(int index){
		bitMask = bitMask | (1 << index);
	}
	
	static void remove(int index){
		bitMask = bitMask & ~(1 << index);
	}
	
	static void check(int index){
		if((bitMask & (1 << index)) != 0){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
	}
	
	static void toggle(int index){
		bitMask = bitMask ^ (1 << index);
	}
	
	static void all(){
		bitMask = (1<<20) -1;
	}
	
	static void empty(){
		bitMask = 0;
	}
}
