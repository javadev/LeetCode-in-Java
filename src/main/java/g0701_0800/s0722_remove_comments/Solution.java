package g0701_0800.s0722_remove_comments;

// #Medium #Array #String #2022_03_24_Time_1_ms_(80.24%)_Space_42.3_MB_(53.67%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S135")
public class Solution {
    public List<String> removeComments(String[] source) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean multiComment = false;
        for (String line : source) {
            int n = line.length();
            int index = 0;
            while (index < n) {
                char ch = line.charAt(index);
                if (!multiComment && ch == '/') {
                    index++;
                    if (index >= n) {
                        sb.append(ch);
                        continue;
                    }
                    if (line.charAt(index) == '/') {
                        break;
                    } else if (line.charAt(index) == '*') {
                        multiComment = true;
                    } else {
                        sb.append(ch).append(line.charAt(index));
                    }
                } else if (multiComment && ch == '*') {
                    index++;
                    if (index >= n) {
                        continue;
                    }
                    if (line.charAt(index) == '/') {
                        multiComment = false;
                    } else {
                        index--;
                    }
                } else if (!multiComment) {
                    sb.append(ch);
                }
                index++;
            }
            if (sb.length() > 0 && !multiComment) {
                result.add(sb.toString());
                sb.setLength(0);
            }
        }
        return result;
    }
}
