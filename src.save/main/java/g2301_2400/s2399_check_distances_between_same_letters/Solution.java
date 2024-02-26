package g2301_2400.s2399_check_distances_between_same_letters;

// #Easy #Array #String #Hash_Table #2022_09_19_Time_1_ms_(99.88%)_Space_43.8_MB_(22.33%)

public class Solution {
    public boolean checkDistances(String s, int[] distance) {
        boolean[] seenFirstIndexYet = new boolean[26];
        for (int idxIntoS = 0; idxIntoS < s.length(); ++idxIntoS) {
            char c = s.charAt(idxIntoS);
            if (!seenFirstIndexYet[c - 'a']) {
                seenFirstIndexYet[c - 'a'] = true;
                distance[c - 'a'] += idxIntoS;
            } else {
                // seenFirstIndexYet[c - 'a']
                distance[c - 'a'] -= idxIntoS;
                if (distance[c - 'a'] != -1) {
                    // early return
                    return false;
                }
            }
        }
        return true;
    }
}
