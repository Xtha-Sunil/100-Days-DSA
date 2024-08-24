
public class PrintSeries {
				public static void printAsc(int n){
								if(n == 6){
												return;
								}
								System.out.print(n + " ");
								printAsc(n + 1);
				}
				
				public static void printDec(int n){
								if(n == 6){
												return;
								}
								printDec(n + 1);
								System.out.print(n + " ");
				}
				
				public static void main(String[] args){
								printAsc(1);
								System.out.println("\nDescending");
								printDec(1);
				}
}