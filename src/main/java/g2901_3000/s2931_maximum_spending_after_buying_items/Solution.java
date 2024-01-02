package g2901_3000.s2931_maximum_spending_after_buying_items;

// #Hard #Array #Sorting #Greedy #Matrix #Heap_Priority_Queue
// #2024_01_02_Time_18_ms_(79.00%)_Space_55.4_MB_(78.52%)

public class Solution {
    private static class Node {
        int val = -1;
        Node next = null;

        public Node(int val) {
            this.val = val;
        }

        public Node() {}
    }

    public long maxSpending(int[][] values) {
        int m = values.length;
        int n = values[0].length;
        Node head = new Node();
        Node node = head;
        for (int j = n - 1; j >= 0; j--) {
            node.next = new Node(values[0][j]);
            node = node.next;
        }
        for (int i = 1; i < m; i++) {
            node = head;
            for (int j = n - 1; j >= 0; j--) {
                while (node.next != null && node.next.val <= values[i][j]) {
                    node = node.next;
                }
                Node next = node.next;
                node.next = new Node(values[i][j]);
                node = node.next;
                node.next = next;
            }
        }
        long res = 0;
        long day = 1;
        node = head.next;
        while (node != null) {
            res += day * node.val;
            node = node.next;
            day++;
        }
        return res;
    }
}
