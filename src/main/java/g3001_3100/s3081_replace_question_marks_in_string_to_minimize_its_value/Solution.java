package g3001_3100.s3081_replace_question_marks_in_string_to_minimize_its_value;

// #Medium #String #Hash_Table #Sorting #Greedy #Heap_Priority_Queue #Counting
// #2024_04_16_Time_12_ms_(99.56%)_Space_45.4_MB_(97.69%)

public class Solution {
    public String minimizeStringValue(String s) {
        int n = s.length();
        int time = 0;
        int[] count = new int[26];
        int[] res = new int[26];
        char[] str = s.toCharArray();
        for (char c : str) {
            if (c != '?') {
                count[c - 'a']++;
            } else {
                time++;
            }
        }
        int minTime = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            minTime = Math.min(minTime, count[i]);
        }
        while (time > 0) {
            for (int j = 0; j < 26; j++) {
                if (count[j] == minTime) {
                    res[j]++;
                    count[j]++;
                    time--;
                }
                if (time == 0) {
                    break;
                }
            }
            minTime++;
        }
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (str[i] == '?') {
                while (res[start] == 0) {
                    start++;
                }
                str[i] = (char) ('a' + start);
                res[start]--;
            }
        }
        return new String(str);
    }
}
