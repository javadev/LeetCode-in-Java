package g1101_1200.s1104_path_in_zigzag_labelled_binary_tree;

// #Medium #Math #Tree #Binary_Tree #2022_02_28_Time_1_ms_(58.50%)_Space_41.6_MB_(28.60%)

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> answer = new LinkedList<>();
        while (label != 0) {
            answer.add(0, label);
            int logNode = (int) (Math.log(label) / Math.log(2));
            int levelStart = (int) (Math.pow(2, logNode));
            int diff = label - levelStart;
            int d2 = diff / 2;
            int prevEnd = levelStart - 1;
            int prevLabel = prevEnd - d2;
            label = prevLabel;
        }
        return answer;
    }
}
