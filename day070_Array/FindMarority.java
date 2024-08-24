public class MajorityElement {
    public static int findMajority(int[] nums) {
        int count = 0;
        Integer curr = null;

        for (int num : nums) {
            if (count == 0) {
                curr = num;
            }
            count += (num == curr) ? 1 : -1;
        }

        return curr;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        
        System.out.println(findMajority(num));
    }
}
