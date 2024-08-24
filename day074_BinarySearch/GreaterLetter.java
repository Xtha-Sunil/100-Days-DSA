public class GreaterLetter {
    public static void main(String[] args) {
        char[] arr = {'c','i','j'};
        char target = 'k';

        char ans = greaterLetter(arr, target);
        System.out.println(ans);
    }

    private static char greaterLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length -1;

        while(start <= end){
            int mid = start + (end -start)/2;
            if(target < letters[mid] ){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}
