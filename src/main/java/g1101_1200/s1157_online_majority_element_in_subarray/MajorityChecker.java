package g1101_1200.s1157_online_majority_element_in_subarray;

// #Hard #Array #Binary_Search #Design #Segment_Tree #Binary_Indexed_Tree
// #2023_06_02_Time_108_ms_(95.24%)_Space_58.6_MB_(20.64%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityChecker {
    private final Map<Integer, List<Integer>> valToInd;
    private static final int NUM_OF_BITS = 15;
    private final int[][] bitCount;

    public MajorityChecker(int[] arr) {
        valToInd = new HashMap<>();
        bitCount = new int[arr.length + 1][NUM_OF_BITS];
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            List<Integer> indList = valToInd.computeIfAbsent(val, k -> new ArrayList<>());
            indList.add(i);
            for (int j = 0; j < NUM_OF_BITS; j++) {
                bitCount[i + 1][j] = bitCount[i][j] + (val & 1);
                val >>= 1;
            }
        }
    }

    public int query(int left, int right, int threshold) {
        int candidateVal = 0;
        for (int i = NUM_OF_BITS - 1; i >= 0; i--) {
            int curBit = bitCount[right + 1][i] - bitCount[left][i] >= threshold ? 1 : 0;
            candidateVal = (candidateVal << 1) + curBit;
        }
        List<Integer> indList = valToInd.get(candidateVal);
        if (indList == null || indList.size() < threshold) {
            return -1;
        }
        int indOfLeft = Collections.binarySearch(indList, left);
        if (indOfLeft < 0) {
            indOfLeft = -indOfLeft - 1;
        }
        int indOfRight = Collections.binarySearch(indList, right);
        if (indOfRight < 0) {
            indOfRight = -indOfRight - 2;
        }
        if (indOfRight - indOfLeft + 1 >= threshold) {
            return candidateVal;
        } else {
            return -1;
        }
    }
}

/*
 * Your MajorityChecker object will be instantiated and called as such:
 * MajorityChecker obj = new MajorityChecker(arr);
 * int param_1 = obj.query(left,right,threshold);
 */
