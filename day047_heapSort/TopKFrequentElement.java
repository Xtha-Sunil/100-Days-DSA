import java.util.*;

class MaxHeapEntry {
    int num;
    int freq;

    MaxHeapEntry(int num, int freq) {
        this.num = num;
        this.freq = freq;
    }
}

public class TopKFrequentElement{
    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        MaxHeapEntry[] heap = new MaxHeapEntry[freqMap.size()];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            heap[index++] = new MaxHeapEntry(entry.getKey(), entry.getValue());
        }
        
        buildMaxHeap(heap);

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(heap[0].num);
            heap[0] = heap[--index];
            maxHeapify(heap, index, 0);
        }
        
        return result;
    }

    private static void buildMaxHeap(MaxHeapEntry[] heap) {
        for (int i = heap.length / 2 - 1; i >= 0; i--) {
            maxHeapify(heap, heap.length, i);
        }
    }

    private static void maxHeapify(MaxHeapEntry[] heap, int heapSize, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < heapSize && heap[left].freq > heap[largest].freq) {
            largest = left;
        }

        if (right < heapSize && heap[right].freq > heap[largest].freq) {
            largest = right;
        }

        if (largest != i) {
            MaxHeapEntry temp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = temp;
            maxHeapify(heap, heapSize, largest);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3};
        int k = 1;
        List<Integer> topKFrequentElements = topKFrequent(nums, k);
        System.out.println("Top " + k + " frequent elements: " + topKFrequentElements);
    }
}
