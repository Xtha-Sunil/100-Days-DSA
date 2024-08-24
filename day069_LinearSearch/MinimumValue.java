public class MinimumValue {
    private static int minValue(int[] arr){
        int ans = Integer.MAX_VALUE;

        for(int val : arr){
            ans = Math.min(ans, val);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,67,-19,0};

        System.out.println(minValue(arr));
    }
}
