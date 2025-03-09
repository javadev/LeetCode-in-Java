package g0301_0400.s0373_find_k_pairs_with_smallest_sums;

// #Medium #Array #Heap_Priority_Queue #Top_Interview_150_Heap
// #2025_03_09_Time_0_ms_(100.00%)_Space_57.66_MB_(90.88%)

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        return new AbstractList<List<Integer>>() {
            private List<List<Integer>> pairs;

            @Override
            public List<Integer> get(int index) {
                init();
                return pairs.get(index);
            }

            @Override
            public int size() {
                init();
                return pairs.size();
            }

            private void load() {
                int n = nums1.length;
                int m = nums2.length;
                int left = nums1[0] + nums2[0];
                int right = nums1[n - 1] + nums2[m - 1];
                int middle;

                while (left <= right) {
                    middle = (left + right) / 2;
                    long count = getCount(nums1, nums2, middle, k);
                    if (count < k) {
                        left = middle + 1;
                    } else if (count > k) {
                        right = middle - 1;
                    } else {
                        left = middle;
                        break;
                    }
                }
                getPairs(nums1, nums2, left, k);
            }

            private long getCount(int[] nums1, int[] nums2, int goal, int k) {
                int prevRight = nums2.length - 1;
                int count = 0;

                for (int i = 0; i < nums1.length && nums1[i] + nums2[0] <= goal; i++) {
                    int left = 0;
                    int right = prevRight;
                    int position = -1;
                    while (left <= right) {
                        int middle = (right + left) / 2;
                        int sum = nums1[i] + nums2[middle];
                        if (sum <= goal) {
                            position = middle;
                            left = middle + 1;
                        } else {
                            right = middle - 1;
                        }
                    }
                    if (position >= 0) {
                        count += position + 1;
                        prevRight = position;
                    }
                    if (count > k) {
                        return count;
                    }
                }
                return count;
            }

            private void getPairs(int[] nums1, int[] nums2, int sum, int k) {
                pairs = new ArrayList<>();
                for (int item : nums1) {
                    for (int j = 0; j < nums2.length && item + nums2[j] < sum; j++) {
                        pairs.add(Arrays.asList(item, nums2[j]));
                    }
                }
                for (int value : nums1) {
                    for (int j = 0;
                            j < nums2.length && value + nums2[j] <= sum && pairs.size() < k;
                            j++) {
                        if (value + nums2[j] == sum) {
                            pairs.add(Arrays.asList(value, nums2[j]));
                        }
                    }
                }
            }

            public void init() {
                if (null == pairs) {
                    load();
                }
            }
        };
    }
}
