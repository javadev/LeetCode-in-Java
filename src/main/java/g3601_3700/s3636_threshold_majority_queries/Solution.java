package g3601_3700.s3636_threshold_majority_queries;

// #Hard #Biweekly_Contest_162 #2025_08_03_Time_1027_ms_(_%)_Space_72.53_MB_(100.00%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

@SuppressWarnings("java:S1210")
public class Solution {

    private static class FreqPair implements Comparable<FreqPair> {
        int count;
        int value;

        public FreqPair(int count, int value) {
            this.count = count;
            this.value = value;
        }

        @Override
        public int compareTo(FreqPair other) {
            if (this.count != other.count) {
                return Integer.compare(this.count, other.count);
            }
            return Integer.compare(other.value, this.value);
        }
    }

    // A helper class to store a query's range and its original index.
    private static class Query {
        int l;
        int r;
        int originalIndex;

        public Query(int l, int r, int idx) {
            this.l = l;
            this.r = r;
            this.originalIndex = idx;
        }
    }

    private int[] nums;
    private Map<Integer, Integer> counts;
    private TreeSet<FreqPair> sortedFrequencies;

    private void add(int pos) {
        int val = this.nums[pos];
        int oldCount = this.counts.getOrDefault(val, 0);
        if (oldCount > 0) {
            this.sortedFrequencies.remove(new FreqPair(oldCount, val));
        }
        int newCount = oldCount + 1;
        this.counts.put(val, newCount);
        this.sortedFrequencies.add(new FreqPair(newCount, val));
    }

    private void remove(int pos) {
        int val = this.nums[pos];
        int oldCount = this.counts.get(val);
        this.sortedFrequencies.remove(new FreqPair(oldCount, val));
        int newCount = oldCount - 1;
        if (newCount > 0) {
            this.counts.put(val, newCount);
            this.sortedFrequencies.add(new FreqPair(newCount, val));
        } else {
            this.counts.remove(val);
        }
    }

    public int[] subarrayMajority(int[] nums, int[][] queries) {
        this.nums = nums;
        this.counts = new HashMap<>();
        this.sortedFrequencies = new TreeSet<>();
        int n = nums.length;
        int qLen = queries.length;
        List<Query> queryList = new ArrayList<>();
        int[] thresholds = new int[qLen];
        for (int i = 0; i < qLen; i++) {
            queryList.add(new Query(queries[i][0], queries[i][1], i));
            thresholds[i] = queries[i][2];
        }
        int blockSize = 1;
        if (qLen > 0) {
            blockSize = Math.max(1, (int) (n / Math.sqrt(qLen)));
        }
        final int finalBlockSize = blockSize;
        queryList.sort(
                (a, b) -> {
                    int blockA = a.l / finalBlockSize;
                    int blockB = b.l / finalBlockSize;
                    if (blockA != blockB) {
                        return Integer.compare(blockA, blockB);
                    }
                    if ((blockA % 2) == 1) {
                        return Integer.compare(b.r, a.r);
                    } else {
                        return Integer.compare(a.r, b.r);
                    }
                });

        int[] ans = new int[qLen];
        int currentL = 0;
        int currentR = -1;
        for (Query q : queryList) {
            while (currentL > q.l) {
                add(--currentL);
            }
            while (currentR < q.r) {
                add(++currentR);
            }
            while (currentL < q.l) {
                remove(currentL++);
            }
            while (currentR > q.r) {
                remove(currentR--);
            }
            if (sortedFrequencies.isEmpty()) {
                ans[q.originalIndex] = -1;
            } else {
                FreqPair mostFrequent = sortedFrequencies.last();
                if (mostFrequent.count >= thresholds[q.originalIndex]) {
                    ans[q.originalIndex] = mostFrequent.value;
                } else {
                    ans[q.originalIndex] = -1;
                }
            }
        }
        return ans;
    }
}
