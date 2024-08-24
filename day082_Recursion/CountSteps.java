package day015;
// given num count step req tonum become zero
public class CountSteps {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(countSteps(num));
    }

    private static int countSteps(int num){
        return helper(num , 0);
    }
    private static int helper(int num , int steps){
        if(num == 0){
            return steps;
        }   
        if((num & 1) == 0){
            return helper(num/2, steps+1);
        }else{
           return helper(num - 1, steps +1);
        }
    }
}
