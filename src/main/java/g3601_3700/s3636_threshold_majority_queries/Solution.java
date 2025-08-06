package g3601_3700.s3636_threshold_majority_queries;

// #Hard #Biweekly_Contest_162 #2025_08_06_Time_82_ms_(98.38%)_Space_71.28_MB_(74.76%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private int[] nums;
    private int[] indexToValue;
    private int[] cnt;
    private int maxCnt = 0;
    private int minVal = 0;

    private static class Query {
        int bid;
        int l;
        int r;
        int threshold;
        int qid;

        Query(int bid, int l, int r, int threshold, int qid) {
            this.bid = bid;
            this.l = l;
            this.r = r;
            this.threshold = threshold;
            this.qid = qid;
        }
    }

    public int[] subarrayMajority(int[] nums, int[][] queries) {
        int n = nums.length;
        int m = queries.length;
        this.nums = nums;
        cnt = new int[n + 1];
        int[] nums2 = nums.clone();
        Arrays.sort(nums2);
        indexToValue = new int[n];
        for (int i = 0; i < n; i++) {
            indexToValue[i] = Arrays.binarySearch(nums2, nums[i]);
        }
        int[] ans = new int[m];
        int blockSize = (int) Math.ceil(n / Math.sqrt(m));
        List<Query> qs = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int[] q = queries[i];
            int l = q[0];
            int r = q[1] + 1;
            int threshold = q[2];
            if (r - l > blockSize) {
                qs.add(new Query(l / blockSize, l, r, threshold, i));
                continue;
            }
            for (int j = l; j < r; j++) {
                add(j);
            }
            ans[i] = maxCnt >= threshold ? minVal : -1;
            for (int j = l; j < r; j++) {
                cnt[indexToValue[j]]--;
            }
            maxCnt = 0;
        }
        qs.sort((a, b) -> a.bid != b.bid ? a.bid - b.bid : a.r - b.r);
        int r = 0;
        for (int i = 0; i < qs.size(); i++) {
            Query q = qs.get(i);
            int l0 = (q.bid + 1) * blockSize;
            if (i == 0 || q.bid > qs.get(i - 1).bid) {
                r = l0;
                Arrays.fill(cnt, 0);
                maxCnt = 0;
            }
            for (; r < q.r; r++) {
                add(r);
            }
            int tmpMaxCnt = maxCnt;
            int tmpMinVal = minVal;
            for (int j = q.l; j < l0; j++) {
                add(j);
            }
            ans[q.qid] = maxCnt >= q.threshold ? minVal : -1;
            maxCnt = tmpMaxCnt;
            minVal = tmpMinVal;
            for (int j = q.l; j < l0; j++) {
                cnt[indexToValue[j]]--;
            }
        }
        return ans;
    }

    private void add(int i) {
        int v = indexToValue[i];
        int c = ++cnt[v];
        int x = nums[i];
        if (c > maxCnt) {
            maxCnt = c;
            minVal = x;
        } else if (c == maxCnt) {
            minVal = Math.min(minVal, x);
        }
    }
}
