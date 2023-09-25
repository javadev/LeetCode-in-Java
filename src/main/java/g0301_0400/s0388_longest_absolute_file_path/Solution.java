package g0301_0400.s0388_longest_absolute_file_path;

// #Medium #String #Depth_First_Search #Stack #2022_07_13_Time_1_ms_(95.33%)_Space_40.3_MB_(91.09%)

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int lengthLongestPath(String input) {
        Deque<Integer> stack = new ArrayDeque<>();
        int longestLen = 0;
        int currDirLen = 0;
        int i = 0;
        int currLevel;
        int nextLevel = 0;
        boolean isFile = false;
        Character period = '.';
        Character space = ' ';
        while (i < input.length()) {
            currLevel = nextLevel;
            int currStrLen = 0;
            while (i < input.length()
                    && (Character.isLetterOrDigit(input.charAt(i))
                            || period.equals(input.charAt(i))
                            || space.equals(input.charAt(i)))) {
                if (period.equals(input.charAt(i))) {
                    isFile = true;
                }
                i++;
                currStrLen++;
            }
            if (isFile) {
                longestLen = Math.max(longestLen, currDirLen + currStrLen);
            } else {
                currDirLen += currStrLen + 1;
                stack.push(currStrLen + 1);
            }
            nextLevel = 0;
            // increment one to let it pass "\n" and start from "\t"
            i = i + 1;
            while (i < input.length() - 1 && input.charAt(i) == '\t') {
                nextLevel++;
                i = i + 1;
            }
            if (nextLevel < currLevel) {
                int j = 0;
                if (isFile) {
                    while (!stack.isEmpty() && j < (currLevel - nextLevel)) {
                        currDirLen -= stack.pop();
                        j++;
                    }
                } else {
                    while (!stack.isEmpty() && j <= (currLevel - nextLevel)) {
                        currDirLen -= stack.pop();
                        j++;
                    }
                }
            } else if (nextLevel == currLevel && !isFile && !stack.isEmpty()) {
                currDirLen -= stack.pop();
            }
            if (nextLevel == 0) {
                currDirLen = 0;
                stack.clear();
            }
            isFile = false;
        }
        return longestLen;
    }
}
