package g0301_0400.s0347_top_k_frequent_elements;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Hash_Table #Sorting
// #Heap_Priority_Queue #Counting #Divide_and_Conquer #Quickselect #Bucket_Sort

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        // Min heap of <number, frequency>
        Queue<int[]> queue = new PriorityQueue<>(k + 1, (a, b) -> (a[1] - b[1]));
        // Filter with min heap
        int j = 0;
        for (int i = 0; i <= nums.length; i++) {
            if (i == nums.length || nums[i] != nums[j]) {
                queue.offer(new int[] {nums[j], i - j});
                if (queue.size() > k) {
                    queue.poll();
                }
                j = i;
            }
        }
        // Convert to int array
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = queue.poll()[0];
        }
        return result;
    }
}
