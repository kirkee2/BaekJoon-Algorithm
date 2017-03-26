
public class Algo1003Fibonacci {

	int[] memoLo;
	int[] memoDP;
	
	Algo1003Fibonacci(int total){
		memoDP = new int[total];
		memoLo = new int[total];
		for(int i = 0 ; i < total ; i++){
			memoDP[i] = -1;
			memoLo[i] = -1;
		}
		
		memoDP[0] = 0;
		memoDP[1] = 1;
		
		memoLo[0] = 0;
		memoLo[1] = 1;	
	}
	
	public static void main(String[] args) {
		Algo1003Fibonacci fi = new Algo1003Fibonacci(300);
		
		System.out.println("DP == " + fi.fibonacciDP(45));
		System.out.println("Recursive == " + fi.fibonacciRe(45));	
		System.out.println("Loop == " + fi.fibonacciLo(45));	
	}

	int fibonacciRe(int num){
		if(num == 0){
			return 0;
		}else if(num == 1){
			return 1;
		}else{
			return fibonacciRe(num-2) + fibonacciRe(num -1);
		}
	}
	
	int fibonacciDP(int num){
		if(memoDP[num] == -1){
			memoDP[num] = fibonacciDP(num-1) + fibonacciDP(num-2);
		}
		
		return memoDP[num];
	}
	
	int fibonacciLo(int num){
		if(memoLo[num] == -1){
			for(int i = 2 ; i<= num ; i++){
				memoLo[i] = memoLo[i-1] + memoLo[i-2];
			}
		}
		
		return memoLo[num];
	}
}
