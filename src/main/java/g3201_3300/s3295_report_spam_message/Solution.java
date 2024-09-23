package g3201_3300.s3295_report_spam_message;

// #Medium #Array #String #Hash_Table #2024_09_24_Time_39_ms_(98.87%)_Space_85.4_MB_(9.13%)

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> bannedUnique = new HashSet<>(Arrays.asList(bannedWords));
        int bannedCount = 0;
        for (String msg : message) {
            if (bannedUnique.contains(msg)) {
                bannedCount++;
            }
            if (bannedCount == 2) {
                return true;
            }
        }
        return false;
    }
}
