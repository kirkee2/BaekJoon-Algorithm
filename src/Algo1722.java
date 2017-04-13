import java.util.Scanner;

/*
#include <iostream>
#include <vector>
using namespace std;
long long f[21] = {1};
bool c[21];
int main() {
    for (int i=1; i<=20; i++) {
        f[i] = f[i-1] * i;
    }
    int n;
    cin >> n;
    int what;
    cin >> what;
    if (what == 2) {
        vector<int> a(n);
        for (int i=0; i<n; i++) {
            cin >> a[i];
        }
        long long ans = 0;
        for (int i=0; i<n; i++) {
            for (int j=1; j<a[i]; j++) {
                if (c[j] == false) {
                    ans += f[n-i-1];
                }
            }
            c[a[i]] = true;
        }
        cout << ans+1 << '\n';
    } else if (what == 1) {
        long long k;
        cin >> k;
        vector<int> a(n);
        for (int i=0; i<n; i++) {
            for (int j=1; j<=n; j++) {
                if (c[j] == true) continue;
                if (f[n-i-1] < k) {
                    k -= f[n-i-1];
                } else {
                    a[i] = j;
                    c[j] = true;
                    break;
                }
            }
        }
        for (int i=0; i<n; i++) {
            cout << a[i] << ' ';
        }
        cout << '\n';
    }
    return 0;
}
 */
public class Algo1722 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   
		int fac[] = new int[21];
		boolean check[] = new boolean[21];
		
		fac[0] = 1;
		for(int i = 1 ; i <= 20; i++){
			fac[i] = fac[i-1]*i;
		}
		
		int n = sc.nextInt();
		
		int option = sc.nextInt();
		
		if(option == 1){
			long degree = sc.nextLong();
			int answer[] = new int[n];
			
			for(int i = 0 ; i < n ; i++){
				for(int j =1 ; j<=n ; j++){
					if (check[j] == true){
						continue;
					}
	                if (fac[n-i-1] < degree) {
	                    degree -= fac[n-i-1];
	                }else {
	                    answer[i] = j;
	                    check[j] = true;
	                    break;
	                }
				}
			}
			
			for(int i = 0 ; i < n ; i++){
				System.out.print(answer[i] + " ");
			}
			System.out.println();
		}else if(option == 2){
			long sum = 0;
			int qu[] = new int[n];
			for(int i = 0 ; i <n ; i++){
				qu[i] = sc.nextInt();
			}
			
			for(int i = 0 ; i<n ; i++){
				for(int j = 1 ; j<qu[i] ; j++){
					if(check[j] == false){
						sum += fac[n-i-1];
					}
				}
				
				check[qu[i]] = true;
			}
			
			System.out.println(sum+1);
		}
	}
}
