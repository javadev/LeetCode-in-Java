package g0301_0400.s0352_data_stream_as_disjoint_intervals;

// #Hard #Binary_Search #Design #Ordered_Set

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    private static class Node {
        int min;
        int max;

        public Node(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public Node(int val) {
            min = val;
            max = val;
        }
    }

    List<Node> list;
    // Initialize your data structure here.
    public SummaryRanges() {
        list = new ArrayList<>();
    }

    public void addNum(int val) {
        int left = 0;
        int right = list.size() - 1;
        int index = list.size();
        while (left <= right) {
            int mid = left + (right - left) / 2;
            Node node = list.get(mid);
            if (node.min <= val && val <= node.max) {
                return;
            } else if (val < node.min) {
                index = mid;
                right = mid - 1;
            } else if (val > node.max) {
                left = mid + 1;
            }
        }
        list.add(index, new Node(val));
    }

    public int[][] getIntervals() {
        for (int i = 1; i < list.size(); i++) {
            Node prev = list.get(i - 1);
            Node curr = list.get(i);
            if (curr.min == prev.max + 1) {
                prev.max = curr.max;
                list.remove(i--);
            }
        }
        int len = list.size();
        int[][] res = new int[len][2];
        for (int i = 0; i < len; i++) {
            Node node = list.get(i);
            res[i][0] = node.min;
            res[i][1] = node.max;
        }
        return res;
    }
}
