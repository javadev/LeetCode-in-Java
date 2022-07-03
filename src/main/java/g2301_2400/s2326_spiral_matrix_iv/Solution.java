package g2301_2400.s2326_spiral_matrix_iv;

// #Medium #2022_07_03_Time_12_ms_(83.33%)_Space_239.8_MB_(16.67%)

import com_github_leetcode.ListNode;
import java.util.Arrays;

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
@SuppressWarnings("java:S135")
public class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] result = new int[m][n];
        for (int[] x : result) {
            Arrays.fill(x, -1);
        }
        int rowBegin = 0;
        int rowEnd = m - 1;
        int colBegin = 0;
        int colEnd = n - 1;
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // traverse right
            for (int j = colBegin; j <= colEnd; j++) {
                result[rowBegin][j] = head.val;
                head = head.next;
                if (head == null) {
                    break;
                }
            }
            rowBegin++;
            if (head == null) {
                break;
            }
            // Traverse Down
            for (int j = rowBegin; j <= rowEnd; j++) {
                result[j][colEnd] = head.val;
                head = head.next;
                if (head == null) {
                    break;
                }
            }
            colEnd--;
            if (head == null) {
                break;
            }
            if (rowBegin <= rowEnd) {
                // Traverse Left
                for (int j = colEnd; j >= colBegin; j--) {
                    result[rowEnd][j] = head.val;
                    head = head.next;
                }
                if (head == null) {
                    break;
                }
            }
            rowEnd--;
            if (colBegin <= colEnd) {
                // Traver Up
                for (int j = rowEnd; j >= rowBegin; j--) {
                    result[j][colBegin] = head.val;
                    head = head.next;
                    if (head == null) {
                        break;
                    }
                }
                if (head == null) {
                    break;
                }
            }
            colBegin++;
        }
        return result;
    }
}
