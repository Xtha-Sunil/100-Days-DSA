package day013;

public class Fibonacci {
    public static void main(String[] args) {
        fibo(0,1,10);
    }
    
    private static void fibo(int curr, int next, int n){
        if(n<=0)
            return;

        System.out.print(curr+ ", ");
        fibo(next, curr+next, --n);
    }
}
