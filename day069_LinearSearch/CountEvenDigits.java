public class CountEvenDigits {
    private static Boolean doesSatisfy(int num){
        if(num == 0)
            return false;
        return ((int)(Math.log10(num))+1) % 2 == 0;
    }
    
    private static int countEvenDigitsNumber(int[] arr){
        int ans = 0;
        for (int num : arr){
            if(doesSatisfy(num)){
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,12,123,1234,1232};

        System.out.println(countEvenDigitsNumber(arr));
    
    }
}
