package g3901_4000.s3943_number_of_pairs_after_increment;

// #Hard #Array #Hash_Table #Counting #Divide_and_Conquer #Senior_Staff #Weekly_Contest_503
// #2026_09_29_Time_233_ms_(98.11%)_Space_189.48_MB_(39.62%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    private HashMap<Long, Long> cache;

    private void update(long[] nums2, int l, int r, long val) {
        if (r < l) {
            return;
        }
        for (int i = l; i <= r; i++) {
            long oldValue = nums2[i];
            long newValue = nums2[i] + val;
            cache.put(oldValue, cache.getOrDefault(oldValue, 0L) - 1);
            cache.put(newValue, cache.getOrDefault(newValue, 0L) + 1);
            nums2[i] = newValue;
        }
    }

    public int[] numberOfPairs(int[] nums1, int[] nums2, int[][] queries) {
        long[] n2 = initialize(nums2);
        long globalOffset = 0;
        List<Integer> answers = new ArrayList<>();
        int q = 0;
        while (q < queries.length) {
            QueryResult result = processQuery(q, queries, nums1, n2, globalOffset);
            q = result.nextIndex;
            globalOffset = result.globalOffset;
            if (result.answer != null) {
                answers.add(result.answer);
            }
        }
        return toArray(answers);
    }

    private long[] initialize(int[] nums2) {
        cache = new HashMap<>();
        long[] result = new long[nums2.length];
        for (int i = 0; i < nums2.length; i++) {
            result[i] = nums2[i];
            incrementCount(result[i]);
        }
        return result;
    }

    private void incrementCount(long value) {
        cache.put(value, cache.getOrDefault(value, 0L) + 1);
    }

    private QueryResult processQuery(
            int index, int[][] queries, int[] nums1, long[] nums2, long globalOffset) {
        int[] query = queries[index];
        if (query[0] == 1) {
            return processUpdateQuery(index, queries, nums2, globalOffset);
        }
        int answer = countPairs(nums1, query[1], globalOffset);
        return new QueryResult(index + 1, globalOffset, answer);
    }

    private QueryResult processUpdateQuery(
            int index, int[][] queries, long[] nums2, long globalOffset) {
        int[] query = queries[index];
        int l = query[1];
        int r = query[2];
        long val = query[3];
        int nextIndex = index + 1;
        while (nextIndex < queries.length && hasSameRange(queries[nextIndex], l, r)) {
            val += queries[nextIndex][3];
            nextIndex++;
        }
        globalOffset = applyUpdate(nums2, l, r, val, globalOffset);
        return new QueryResult(nextIndex, globalOffset, null);
    }

    private boolean hasSameRange(int[] query, int l, int r) {
        return query.length == 4 && query[1] == l && query[2] == r;
    }

    private long applyUpdate(long[] nums2, int l, int r, long val, long globalOffset) {
        int length = r - l + 1;
        if (length <= nums2.length / 2) {
            update(nums2, l, r, val);
            return globalOffset;
        }
        update(nums2, 0, l - 1, -val);
        update(nums2, r + 1, nums2.length - 1, -val);
        return globalOffset + val;
    }

    private int countPairs(int[] nums1, long target, long globalOffset) {
        long totalPairs = 0;
        for (int num1 : nums1) {
            long num2 = target - num1 - globalOffset;
            totalPairs += cache.getOrDefault(num2, 0L);
        }
        return (int) totalPairs;
    }

    private int[] toArray(List<Integer> answers) {
        int[] result = new int[answers.size()];
        for (int i = 0; i < answers.size(); i++) {
            result[i] = answers.get(i);
        }
        return result;
    }

    private static final class QueryResult {
        private final int nextIndex;
        private final long globalOffset;
        private final Integer answer;

        private QueryResult(int nextIndex, long globalOffset, Integer answer) {
            this.nextIndex = nextIndex;
            this.globalOffset = globalOffset;
            this.answer = answer;
        }
    }
}
