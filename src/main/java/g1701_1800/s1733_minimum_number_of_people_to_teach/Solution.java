package g1701_1800.s1733_minimum_number_of_people_to_teach;

// #Medium #Array #Greedy #2022_04_28_Time_11_ms_(98.57%)_Space_56.3_MB_(95.71%)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int m = languages.length;
        boolean[][] speak = new boolean[m + 1][n + 1];
        boolean[][] teach = new boolean[m + 1][n + 1];
        for (int user = 0; user < m; user++) {
            int[] userLanguages = languages[user];
            for (int userLanguage : userLanguages) {
                speak[user + 1][userLanguage] = true;
            }
        }
        List<int[]> listToTeach = new ArrayList<>();
        for (int[] friend : friendships) {
            int userA = friend[0];
            int userB = friend[1];
            boolean hasCommonLanguage = false;
            for (int language = 1; language <= n; language++) {
                if (speak[userA][language] && speak[userB][language]) {
                    hasCommonLanguage = true;
                    break;
                }
            }
            if (!hasCommonLanguage) {
                for (int language = 1; language <= n; language++) {
                    if (!speak[userA][language]) {
                        teach[userA][language] = true;
                    }
                    if (!speak[userB][language]) {
                        teach[userB][language] = true;
                    }
                }
                listToTeach.add(friend);
            }
        }
        int minLanguage = Integer.MAX_VALUE;
        int languageToTeach = 0;
        for (int language = 1; language <= n; language++) {
            int count = 0;
            for (int user = 1; user <= m; user++) {
                if (teach[user][language]) {
                    count++;
                }
            }
            if (count < minLanguage) {
                minLanguage = count;
                languageToTeach = language;
            }
        }
        Set<Integer> setToTeach = new HashSet<>();
        for (int[] friend : listToTeach) {
            int userA = friend[0];
            int userB = friend[1];
            if (!speak[userA][languageToTeach]) {
                setToTeach.add(userA);
            }
            if (!speak[userB][languageToTeach]) {
                setToTeach.add(userB);
            }
        }
        return setToTeach.size();
    }
}
