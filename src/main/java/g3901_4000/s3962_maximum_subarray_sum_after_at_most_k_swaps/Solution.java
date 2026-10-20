package g3901_4000.s3962_maximum_subarray_sum_after_at_most_k_swaps;

// #Hard #Array #Hash_Table #Sorting #Greedy #Heap_Priority_Queue #Ordered_Set #Binary_Indexed_Tree
// #Senior_Staff #Weekly_Contest_506 #2026_10_20_Time_13_ms_(98.61%)_Space_45.05_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    public long maxSum(int[] nums, int k) {
        if (k == 0) {
            return maxSubarraySum(nums);
        }
        PositiveInfo info = analyzePositiveValues(nums);
        if (info.count == 0) {
            return info.maxElement;
        }
        int maxPositiveWindow = findMaxPositiveWindow(nums, info.count);
        if (k >= info.count - maxPositiveWindow) {
            return info.sum;
        }
        int[] values = getUniqueSortedValues(nums);
        int[] map = mapValues(nums, values);
        int[] totalCounts = countMappedValues(map, values.length);
        return findBestSum(nums, k, values, map, totalCounts);
    }

    private long maxSubarraySum(int[] nums) {
        long max = nums[0];
        long cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cur = Math.max(nums[i], cur + nums[i]);
            max = Math.max(max, cur);
        }
        return max;
    }

    private PositiveInfo analyzePositiveValues(int[] nums) {
        int count = 0;
        long sum = 0;
        long maxElement = Long.MIN_VALUE;
        for (int x : nums) {
            if (x > 0) {
                sum += x;
                count++;
            }
            maxElement = Math.max(maxElement, x);
        }
        return new PositiveInfo(count, sum, maxElement);
    }

    private int findMaxPositiveWindow(int[] nums, int windowSize) {
        int current = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                current++;
            }
            if (i >= windowSize && nums[i - windowSize] > 0) {
                current--;
            }
            if (i >= windowSize - 1) {
                max = Math.max(max, current);
            }
        }
        return max;
    }

    private int[] getUniqueSortedValues(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int size = 0;
        for (int x : sorted) {
            if (size == 0 || sorted[size - 1] != x) {
                sorted[size++] = x;
            }
        }
        return Arrays.copyOf(sorted, size);
    }

    private int[] mapValues(int[] nums, int[] values) {
        int[] map = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            map[i] = Arrays.binarySearch(values, nums[i]);
        }
        return map;
    }

    private int[] countMappedValues(int[] map, int size) {
        int[] counts = new int[size];
        for (int index : map) {
            counts[index]++;
        }
        return counts;
    }

    private long findBestSum(int[] nums, int k, int[] values, int[] map, int[] totalCounts) {
        long best = Long.MIN_VALUE;
        int[] included = new int[values.length];
        for (int i = 0; i < nums.length; i++) {
            Arrays.fill(included, 0);
            SwapContext context = new SwapContext(values, included, totalCounts);
            best = evaluateStartingPosition(nums, i, k, map, context, best);
        }
        return best;
    }

    private long evaluateStartingPosition(
            int[] nums, int start, int k, int[] map, SwapContext context, long best) {
        long sum = 0;
        int minIndex = context.values.length;
        int maxOutside = context.values.length - 1;
        for (int j = start; j < nums.length; j++) {
            int index = map[j];
            context.included[index]++;
            sum += nums[j];
            minIndex = Math.min(minIndex, index);
            maxOutside = findMaxOutside(maxOutside, context);
            if (hasNoUsefulSwap(minIndex, maxOutside, context.values)) {
                best = Math.max(best, sum);
            } else if (sum + (long) k * (context.values[maxOutside] - context.values[minIndex])
                    > best) {
                long candidate = optimizeSwaps(k, sum, minIndex, maxOutside, context);
                best = Math.max(best, candidate);
            }
        }
        return best;
    }

    private int findMaxOutside(int maxOutside, SwapContext context) {
        while (maxOutside >= 0 && context.totalCounts[maxOutside] == context.included[maxOutside]) {
            maxOutside--;
        }
        return maxOutside;
    }

    private boolean hasNoUsefulSwap(int minIndex, int maxOutside, int[] values) {
        return maxOutside < 0 || values[minIndex] >= values[maxOutside];
    }

    private long optimizeSwaps(int k, long sum, int minIndex, int maxOutside, SwapContext context) {
        int[] values = context.values;
        int[] included = context.included;
        int[] totalCounts = context.totalCounts;
        long result = sum;
        int swaps = 0;
        int left = minIndex;
        int right = maxOutside;
        int leftCount = included[left];
        int rightCount = totalCounts[right] - included[right];

        while (swaps < k && left < right) {
            if (leftCount == 0) {
                left++;
                if (left < right) {
                    leftCount = included[left];
                }
            } else if (rightCount == 0) {
                right--;
                if (left < right) {
                    rightCount = totalCounts[right] - included[right];
                }
            } else if (values[left] >= values[right]) {
                break;
            } else {
                int take = Math.min(k - swaps, Math.min(leftCount, rightCount));
                result += (long) take * (values[right] - values[left]);
                swaps += take;
                leftCount -= take;
                rightCount -= take;
            }
        }
        return result;
    }

    static final class SwapContext {
        private final int[] values;
        private final int[] included;
        private final int[] totalCounts;

        SwapContext(int[] values, int[] included, int[] totalCounts) {
            this.values = values;
            this.included = included;
            this.totalCounts = totalCounts;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SwapContext)) {
                return false;
            }
            SwapContext other = (SwapContext) obj;
            return Arrays.equals(values, other.values)
                    && Arrays.equals(included, other.included)
                    && Arrays.equals(totalCounts, other.totalCounts);
        }

        @Override
        public int hashCode() {
            int result = Arrays.hashCode(values);
            result = 31 * result + Arrays.hashCode(included);
            result = 31 * result + Arrays.hashCode(totalCounts);
            return result;
        }

        @Override
        public String toString() {
            return "SwapContext[values="
                    + Arrays.toString(values)
                    + ", included="
                    + Arrays.toString(included)
                    + ", totalCounts="
                    + Arrays.toString(totalCounts)
                    + "]";
        }
    }

    private static final class PositiveInfo {
        private final int count;
        private final long sum;
        private final long maxElement;

        PositiveInfo(int count, long sum, long maxElement) {
            this.count = count;
            this.sum = sum;
            this.maxElement = maxElement;
        }
    }
}
