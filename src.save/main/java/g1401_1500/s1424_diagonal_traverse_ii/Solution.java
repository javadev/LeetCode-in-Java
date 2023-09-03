package g1401_1500.s1424_diagonal_traverse_ii;

// #Medium #Array #Sorting #Heap_Priority_Queue
// #2022_03_28_Time_39_ms_(85.56%)_Space_109.5_MB_(78.06%)

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<Integer> ans = new ArrayList<>();
        ArrayDeque<Iterator<Integer>> queue = new ArrayDeque<>();
        int pos = 0;
        do {
            if (pos < nums.size()) {
                queue.offerFirst(nums.get(pos).iterator());
            }
            int sz = queue.size();
            while (--sz >= 0) {
                Iterator<Integer> cur = queue.poll();
                ans.add(Objects.requireNonNull(cur).next());
                if (cur.hasNext()) {
                    queue.offer(cur);
                }
            }
            pos++;
        } while (!queue.isEmpty() || pos < nums.size());
        return ans.stream().mapToInt(o -> o).toArray();
    }
}
