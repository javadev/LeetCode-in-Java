package g2201_2300.s2284_sender_with_largest_word_count;

// #Medium #Array #Hash_Table #String #Counting
// #2022_06_18_Time_42_ms_(95.64%)_Space_49.8_MB_(94.99%)

import java.util.HashMap;

public class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String, Integer> x = new HashMap<>();
        for (int i = 0; i < messages.length; i++) {
            int words = messages[i].length() - messages[i].replace(" ", "").length() + 1;
            if (x.containsKey(senders[i])) {
                x.put(senders[i], x.get(senders[i]) + words);
            } else {
                x.put(senders[i], words);
            }
        }
        String result = "";
        int max = 0;
        for (String key : x.keySet()) {
            if (x.get(key) > max || x.get(key) == max && result.compareTo(key) < 0) {
                max = x.get(key);
                result = key;
            }
        }
        return result;
    }
}
