package g2301_2400.s2326_spiral_matrix_iv;

// #Medium #Array #Matrix #Simulation #Linked_List
// #2022_07_15_Time_12_ms_(85.48%)_Space_61.9_MB_(90.83%)

import com_github_leetcode.ListNode;

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
public class Solution {
    private enum Direction {
        RIGHT,
        DOWN,
        LEFT,
        UP
    }

    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] arr = new int[m][n];
        int i = 0;
        int j = -1;
        Direction direction = Direction.RIGHT;
        // Boundaries
        // ++ after Left to right Horizontal traversed
        int a = 0;
        // -- after Down to Up vertical traversed
        int b = n - 1;
        // -- after Right to Left horizontal teversed
        int c = m - 1;
        // ++ after Down to Up vertical traversed
        int d = 0;
        for (int k = 0; k < m * n; ++k) {
            int val = -1;
            if (head != null) {
                val = head.val;
                head = head.next;
            }
            switch (direction) {
                case RIGHT:
                    ++j;
                    if (j == b) {
                        direction = Direction.DOWN;
                        ++a;
                    }
                    break;
                case DOWN:
                    ++i;
                    if (i == c) {
                        direction = Direction.LEFT;
                    }
                    break;
                case LEFT:
                    --j;
                    if (j == d) {
                        --c;
                        direction = Direction.UP;
                    }
                    break;
                case UP:
                default:
                    --i;
                    if (i == a) {
                        --b;
                        ++d;
                        direction = Direction.RIGHT;
                    }
                    break;
            }
            arr[i][j] = val;
        }
        return arr;
    }
}
