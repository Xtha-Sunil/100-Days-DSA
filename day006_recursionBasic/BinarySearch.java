public class BinarySearch {
	public static void main(String[] args) {
		// sorted array
		int arr[] = {1,8,18,55,56,66, 77,  98};
		int target = 66;
		System.out.println(binarySearch(arr, target, 0, arr.length));
	}
	
	static int binarySearch(int[] arr,int target,int start, int end){
		// base case
		if (start > end) return -1;
		
		int mid = start + (end - start) / 2;
		
		// found
		if(arr[mid] == target) return mid;
		
		// check left half : target smaller
		if(arr[mid] > target) return binarySearch(arr, target, start, mid-1);
		
		// check right half : target bigger
		return binarySearch(arr, target, mid+1, end);
	}
}