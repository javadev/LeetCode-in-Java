package g0301_0400.s0352_data_stream_as_disjoint_intervals;

// #Hard #Binary_Search #Design #Ordered_Set #2022_07_11_Time_109_ms_(62.48%)_Space_74_MB_(42.17%)

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    private static class Node {
        int min;
        int max;

        public Node(int val) {
            min = val;
            max = val;
        }
    }

    private List<Node> list;

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
        int i = 1;
        while (i < list.size()) {
            Node prev = list.get(i - 1);
            Node curr = list.get(i);
            if (curr.min == prev.max + 1) {
                prev.max = curr.max;
                list.remove(i--);
            }
            i++;
        }
        int len = list.size();
        int[][] res = new int[len][2];
        for (int j = 0; j < len; j++) {
            Node node = list.get(j);
            res[j][0] = node.min;
            res[j][1] = node.max;
        }
        return res;
    }
}
