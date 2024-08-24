public class PowerCalc {
				public static int Power(int x , int n){
								if(x == 0)
												return 0;
								
								if ( n == 0)
												return 1;
								
								int ans = x * Power(x, n-1);
								
								return ans;
				}
				
				
				public static int Power2(int x, int n){
								if (n == 0){
												return 1;
								}
								if(x == 0){
												return 0;
								}
								
								if (n % 2 == 1){
												return Power2(x, n/2) * Power2(x, n/2) * x;
								} else {
												return Power2(x, n/2) * Power2(x, n/2);
								}
				}
		
				public static void main(String[] args) {
								//stack height = n
								System.out.println(Power(2, 5));
								
								// stack height = logn
								System.out.println(Power2(2,5));
				}
				
}