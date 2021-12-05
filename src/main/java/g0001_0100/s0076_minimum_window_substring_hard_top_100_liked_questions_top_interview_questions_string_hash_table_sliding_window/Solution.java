package g0001_0100.s0076_minimum_window_substring_hard_top_100_liked_questions_top_interview_questions_string_hash_table_sliding_window;

public class Solution {
    public String minWindow(String s, String t) {
        int[] map = new int[128];
        for (int i = 0; i < t.length(); i++) {
            map[t.charAt(i) - 'A']++;
        }
        int count = t.length();
        int begin = 0;
        int end = 0;
        int d = Integer.MAX_VALUE;
        int head = 0;
        while (end < s.length()) {
            if (map[s.charAt(end++) - 'A']-- > 0) {
                count--;
            }
            while (count == 0) {
                if (end - begin < d) {
                    d = end - begin;
                    head = begin;
                }
                if (map[s.charAt(begin++) - 'A']++ == 0) {
                    count++;
                }
            }
        }
        return d == Integer.MAX_VALUE ? "" : s.substring(head, head + d);
    }
}
