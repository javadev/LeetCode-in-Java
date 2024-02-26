package g2801_2900.s2866_beautiful_towers_ii;

// #Medium #Array #Stack #Monotonic_Stack #2023_12_20_Time_35_ms_(89.02%)_Space_72.5_MB_(5.49%)

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public long maximumSumOfHeights(List<Integer> mH) {
        int n = mH.size();
        Deque<Integer> st = new LinkedList<>();
        int[] prevSmaller = new int[n + 1];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && mH.get(st.peek()) >= mH.get(i)) {
                st.pop();
            }
            if (st.isEmpty()) {
                prevSmaller[i] = -1;
            } else {
                prevSmaller[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        int[] nextSmaller = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && mH.get(st.peek()) >= mH.get(i)) {
                st.pop();
            }
            if (st.isEmpty()) {
                nextSmaller[i] = n;
            } else {
                nextSmaller[i] = st.peek();
            }
            st.push(i);
        }
        long[] leftSum = new long[n];
        leftSum[0] = mH.get(0);
        for (int i = 1; i < n; ++i) {
            int prevSmallerIdx = prevSmaller[i];
            int equalCount = i - prevSmallerIdx;
            leftSum[i] = ((long) equalCount * mH.get(i));
            if (prevSmallerIdx != -1) {
                leftSum[i] += leftSum[prevSmallerIdx];
            }
        }
        long[] rightSum = new long[n];
        rightSum[n - 1] = mH.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            int nextSmallerIdx = nextSmaller[i];
            int equalCount = nextSmallerIdx - i;
            rightSum[i] = ((long) equalCount * mH.get(i));
            if (nextSmallerIdx != n) {
                rightSum[i] += rightSum[nextSmallerIdx];
            }
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long totalSum = leftSum[i] + rightSum[i] - mH.get(i);
            ans = Math.max(ans, totalSum);
        }
        return ans;
    }
}
