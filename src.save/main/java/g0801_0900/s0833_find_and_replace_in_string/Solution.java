package g0801_0900.s0833_find_and_replace_in_string;

// #Medium #Array #String #Sorting #2022_03_24_Time_3_ms_(70.10%)_Space_43.1_MB_(44.04%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> stringIndexToKIndex = new HashMap<>();
        for (int i = 0; i < indices.length; ++i) {
            stringIndexToKIndex.put(indices[i], i);
        }
        int indexIntoS = 0;
        while (indexIntoS < s.length()) {
            if (stringIndexToKIndex.containsKey(indexIntoS)) {
                String substringInSources = sources[stringIndexToKIndex.get(indexIntoS)];
                if (indexIntoS + substringInSources.length() <= s.length()) {
                    String substringInS =
                            s.substring(indexIntoS, indexIntoS + substringInSources.length());
                    if (substringInS.equals(substringInSources)) {
                        sb.append(targets[stringIndexToKIndex.get(indexIntoS)]);
                        indexIntoS += substringInS.length() - 1;
                    } else {
                        sb.append(s.charAt(indexIntoS));
                    }
                } else {
                    sb.append(s.charAt(indexIntoS));
                }
            } else {
                sb.append(s.charAt(indexIntoS));
            }
            indexIntoS++;
        }
        return sb.toString();
    }
}
