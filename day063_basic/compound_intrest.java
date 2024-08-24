import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double principal = sc.nextDouble();

        System.out.print("Enter the rate (r): ");
        double rate = sc.nextDouble() / 100;
        
        System.out.print("Enter compounding frequency (n): ");
        int compoundFrequency = sc.nextInt();

        System.out.print("Enter the time (t): ");
        double time = sc.nextDouble();

        // Calculate compound interest
        double compoundInterest = principal * Math.pow(1 + (rate / compoundFrequency), compoundFrequency * time) - principal;

        System.out.printf("Interest: %.2f\n", compoundInterest);

        sc.close();
    }
}