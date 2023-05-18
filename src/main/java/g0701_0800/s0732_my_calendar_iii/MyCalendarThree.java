package g0701_0800.s0732_my_calendar_iii;

// #Hard #Binary_Search #Design #Ordered_Set #Segment_Tree
// #2022_03_25_Time_40_ms_(95.37%)_Space_61.9_MB_(11.11%)

public class MyCalendarThree {
    private final Node root;

    public MyCalendarThree() {
        root = new Node(0, 1000000000, 0);
    }

    public int book(int start, int end) {
        updateTree(root, start, end - 1);
        return root.val;
    }

    private void updateTree(Node root, int start, int end) {
        if (root == null) {
            return;
        }
        if (root.low >= start && root.high <= end) {
            root.val++;
            if (root.left != null) {
                updateTree(root.left, start, end);
            }
            if (root.right != null) {
                updateTree(root.right, start, end);
            }
            return;
        }

        int mid = (root.low + root.high) / 2;
        if (root.left == null) {
            root.left = new Node(root.low, mid, root.val);
        }

        if (root.right == null) {
            root.right = new Node(mid + 1, root.high, root.val);
        }

        if (start <= mid) {
            updateTree(root.left, start, end);
        }

        if (end > mid) {
            updateTree(root.right, start, end);
        }

        root.val = Math.max(root.left.val, root.right.val);
    }

    static class Node {
        int low;
        int high;
        int val;
        Node left;
        Node right;

        public Node(int low, int high, int val) {
            this.low = low;
            this.high = high;
            this.val = val;
        }
    }
}

/*
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */
