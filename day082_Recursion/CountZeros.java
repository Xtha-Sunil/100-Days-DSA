package day015;

public class CountZeros {
    public static void main(String[] args) {
        int num = 3020400;
        System.out.println(countZeros(num, 0));
    }

    private static int countZeros(int num, int count){
        if(num == 0)
            return count;
        
        if(num % 10 == 0)
            count++;
        
        return countZeros(num/10, count);
    }
}
