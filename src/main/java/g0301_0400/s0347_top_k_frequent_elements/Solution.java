package g0301_0400.s0347_top_k_frequent_elements;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Hash_Table #Sorting
// #Heap_Priority_Queue #Counting #Divide_and_Conquer #Quickselect #Bucket_Sort

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> queue =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        queue.addAll(map.entrySet());
        int[] result = new int[k];
        for (int i = 0; i < k; i++) result[i] = Objects.requireNonNull(queue.poll()).getKey();
        return result;
    }
}
