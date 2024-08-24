package day014;
public class PrintNumbersRecursively {
    public static void main(String[] args) {
        int n= 10;
        print1ToN(n);
        System.err.println("");
        printNTo1(n);
    }
    private static void print1ToN(int n){
        if(n<1) return;
        print1ToN(n-1);
        System.out.print(n + " ");
    }
    private static void printNTo1(int n){
        if(n<=0) return;

        System.out.print(n + " ");
        printNTo1(--n);
    }
}














