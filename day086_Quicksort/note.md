Quick sort in inplace unstable sorting algorithm
with worst TC O(N\*N)
best TC O(N logN)

Quick sort is good for Arrays
MergeSort is good for Linked list

- How quicksort works;
  1. Select any pivot point
  2. Move element smaller than pivot element to left of pivot and larger to right of pivot
  3. recursive call on 2 halves:
     - sort(arr, low, end);
     - sort(arr, start, high);
