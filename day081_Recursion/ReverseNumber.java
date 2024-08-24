package day014;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int rev = reverseNumber(num);
        System.out.println(rev);
    }

    private static int reverseNumber(int num){
        if(num == 0) return 1;

        int digit = (int)(Math.log10(num)) + 1;
        return helper(num, digit);
    }

    private static int helper(int num , int digit){
        if(digit == 1) return num;
        int rem = num % 10;
        return rem * (int)(Math.pow(10, digit-1)) + helper(num/10, digit-1);
    }
}
