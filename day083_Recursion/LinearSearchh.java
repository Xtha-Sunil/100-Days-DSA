import java.util.ArrayList;

public class LinearSearchh {
    public static void main(String[] args) {
        int[] arr = {1,4,12,12,14,15,21,12,27,32};
        int target = 12;

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(search(arr, target, 0, list));
    }

    private static ArrayList<Integer> search(int[] arr, int target, int idx, ArrayList<Integer> list){
        if(idx == arr.length) return list;

        if(arr[idx] == target){
            list.add(idx);
        }
        return search(arr, target, idx+1, list);
    }
}
