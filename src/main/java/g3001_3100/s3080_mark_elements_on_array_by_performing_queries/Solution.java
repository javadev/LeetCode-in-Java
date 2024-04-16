package g3001_3100.s3080_mark_elements_on_array_by_performing_queries;

// #Medium #Array #Hash_Table #Sorting #Heap_Priority_Queue #Simulation
// #2024_04_16_Time_50_ms_(99.96%)_Space_77.2_MB_(15.35%)

@SuppressWarnings({"java:S1871", "java:S6541"})
public class Solution {
    public long[] unmarkedSumArray(int[] nums, int[][] queries) {
        int l = nums.length;
        int[] orig = new int[l];
        for (int i = 0; i < l; i++) {
            orig[i] = i;
        }
        int x = 1;
        while (x < l) {
            int[] temp = new int[l];
            int[] teor = new int[l];
            int y = 0;
            while (y < l) {
                int s1 = 0;
                int s2 = 0;
                while (s1 + s2 < 2 * x && y + s1 + s2 < l) {
                    if (s2 >= x || y + x + s2 >= l) {
                        temp[y + s1 + s2] = nums[y + s1];
                        teor[y + s1 + s2] = orig[y + s1];
                        s1++;
                    } else if (s1 >= x) {
                        temp[y + s1 + s2] = nums[y + x + s2];
                        teor[y + s1 + s2] = orig[y + x + s2];
                        s2++;
                    } else if (nums[y + s1] <= nums[y + x + s2]) {
                        temp[y + s1 + s2] = nums[y + s1];
                        teor[y + s1 + s2] = orig[y + s1];
                        s1++;
                    } else {
                        temp[y + s1 + s2] = nums[y + x + s2];
                        teor[y + s1 + s2] = orig[y + x + s2];
                        s2++;
                    }
                }
                y += 2 * x;
            }
            for (int i = 0; i < l; i++) {
                nums[i] = temp[i];
                orig[i] = teor[i];
            }
            x *= 2;
        }
        int[] change = new int[l];
        for (int i = 0; i < l; i++) {
            change[orig[i]] = i;
        }
        boolean[] mark = new boolean[l];
        int m = queries.length;
        int st = 0;
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        long[] out = new long[m];
        for (int i = 0; i < m; i++) {
            int a = queries[i][0];
            if (!mark[change[a]]) {
                mark[change[a]] = true;
                sum -= nums[change[a]];
            }
            int b = queries[i][1];
            int many = 0;
            while (many < b) {
                if (st == l) {
                    out[i] = sum;
                    break;
                }
                if (!mark[st]) {
                    mark[st] = true;
                    sum -= nums[st];
                    many++;
                }
                st++;
            }
            out[i] = sum;
        }
        return out;
    }
}
