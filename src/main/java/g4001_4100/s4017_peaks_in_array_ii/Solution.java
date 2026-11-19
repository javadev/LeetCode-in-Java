package g4001_4100.s4017_peaks_in_array_ii;

// #Hard #Array #Divide_and_Conquer #Segment_Tree #Senior_Staff #Weekly_Contest_514
// #2026_11_19_Time_139_ms_(92.31%)_Space_193.66_MB_(100.00%)

public class Solution {
    private int[] cnt;
    private int[] first;
    private int[] last;
    private long[] inner;
    private int qCnt;
    private int qFirst;
    private int qLast;
    private long qInner;

    public long[] countOfPeaks(int[] nums, int[][] queries) {
        int n = nums.length;
        int type1Count = 0;
        for (int[] q : queries) {
            if (q[0] == 1) {
                type1Count++;
            }
        }
        long[] ans = new long[type1Count];
        if (n < 3) {
            return ans;
        }
        int m = n - 2;
        cnt = new int[4 * m];
        first = new int[4 * m];
        last = new int[4 * m];
        inner = new long[4 * m];
        build(1, 1, m, nums);
        int ansIdx = 0;
        for (int[] q : queries) {
            if (q[0] == 1) {
                int l = q[1];
                int r = q[2];
                if (r - l + 1 < 3) {
                    ans[ansIdx++] = 0L;
                } else {
                    qCnt = 0;
                    qFirst = -1;
                    qLast = -1;
                    qInner = 0L;
                    query(1, 1, m, l + 1, r - 1);
                    if (qCnt == 0) {
                        ans[ansIdx++] = 0L;
                    } else {
                        long totalSub = tri((long) r - l + 1);
                        long leftLen = (long) qFirst - l + 1;
                        long rightLen = (long) r - qLast + 1;
                        long nonPeak = (tri(leftLen) - 1L) + qInner + tri(rightLen);
                        ans[ansIdx++] = totalSub - nonPeak;
                    }
                }
            } else {
                int idx = q[1];
                nums[idx] = q[2];
                int start = Math.max(1, idx - 1);
                int end = Math.min(m, idx + 1);
                for (int pos = start; pos <= end; pos++) {
                    update(1, 1, m, pos, isPeak(nums, pos));
                }
            }
        }
        return ans;
    }

    private boolean isPeak(int[] nums, int i) {
        return nums[i] > nums[i - 1] && nums[i] > nums[i + 1];
    }

    private long tri(long len) {
        return len * (len + 1L) / 2L;
    }

    private void build(int node, int tl, int tr, int[] nums) {
        if (tl == tr) {
            if (isPeak(nums, tl)) {
                cnt[node] = 1;
                first[node] = tl;
                last[node] = tl;
            } else {
                first[node] = -1;
                last[node] = -1;
            }
            return;
        }
        int mid = (tl + tr) >>> 1;
        build(node << 1, tl, mid, nums);
        build(node << 1 | 1, mid + 1, tr, nums);
        pull(node);
    }

    private void update(int node, int tl, int tr, int pos, boolean peak) {
        if (tl == tr) {
            if (peak) {
                cnt[node] = 1;
                first[node] = tl;
                last[node] = tl;
            } else {
                cnt[node] = 0;
                first[node] = -1;
                last[node] = -1;
            }
            inner[node] = 0L;
            return;
        }
        int mid = (tl + tr) >>> 1;
        if (pos <= mid) {
            update(node << 1, tl, mid, pos, peak);
        } else {
            update(node << 1 | 1, mid + 1, tr, pos, peak);
        }
        pull(node);
    }

    private void pull(int node) {
        int lc = node << 1;
        int rc = node << 1 | 1;
        if (cnt[lc] == 0) {
            cnt[node] = cnt[rc];
            first[node] = first[rc];
            last[node] = last[rc];
            inner[node] = inner[rc];
        } else if (cnt[rc] == 0) {
            cnt[node] = cnt[lc];
            first[node] = first[lc];
            last[node] = last[lc];
            inner[node] = inner[lc];
        } else {
            cnt[node] = cnt[lc] + cnt[rc];
            first[node] = first[lc];
            last[node] = last[rc];
            long gap = (long) first[rc] - last[lc] + 1L;
            inner[node] = inner[lc] + inner[rc] + tri(gap) - 1L;
        }
    }

    private void query(int node, int tl, int tr, int ql, int qr) {
        if (ql <= tl && tr <= qr) {
            if (cnt[node] == 0) {
                return;
            }
            if (qCnt == 0) {
                qCnt = cnt[node];
                qFirst = first[node];
                qLast = last[node];
                qInner = inner[node];
            } else {
                long gap = (long) first[node] - qLast + 1L;
                qInner += inner[node] + tri(gap) - 1L;
                qCnt += cnt[node];
                qLast = last[node];
            }
            return;
        }
        int mid = (tl + tr) >>> 1;
        if (ql <= mid) {
            query(node << 1, tl, mid, ql, qr);
        }
        if (qr > mid) {
            query(node << 1 | 1, mid + 1, tr, ql, qr);
        }
    }
}
