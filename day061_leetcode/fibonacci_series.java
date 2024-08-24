import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number : ");
		int num = sc.nextInt();
		
		int a = 0, b=1, c;
		
		for(int i=1; i<=num;  i++){
			System.out.print(a + " ");
			
			c = a +b;
			a=b;
			b = c;
		}
		
		sc.close();
	}
}