import java.util.*;

public class SubsetWithDupes {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(solve(arr));
    }

    static List<List<Integer>> solve(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start;
        int end = 0;
        
        for(int i =0; i<arr.length; i++){
            start = 0;

            if(i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }

            int n = outer.size();
            end = outer.size() - 1;

            for(int j = start; j<n; j++ ){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
