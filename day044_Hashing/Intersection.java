import java.util.*;

public class Intersection{
    public static int[] findIntersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> intersectionList = new ArrayList<>();

        // Populate frequency map for nums1
        for (int num : nums1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Find intersection
        for (int num : nums2) {
            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
                intersectionList.add(num);
                freqMap.put(num, freqMap.get(num) - 1);
            }
        }

        // Convert intersection list to array
        int[] result = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++) {
            result[i] = intersectionList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = findIntersection(nums1, nums2);

        System.out.println("Intersection " + Arrays.toString(result));
    }
}
