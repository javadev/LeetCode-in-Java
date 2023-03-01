package g2401_2500.s2434_using_a_robot_to_print_the_lexicographically_smallest_string;

// #Medium #String #Hash_Table #Greedy #Stack #2022_12_07_Time_32_ms_(99.61%)_Space_72.8_MB_(76.43%)

public class Solution {
    public String robotWithString(String s) {
        int n = s.length();
        char[] c = s.toCharArray();
        char[] next = new char[n + 1];
        next[n] = (char) ('z' + 1);
        for (int i = n - 1; i >= 0; i--) {
            next[i] = (char) ('a' + Math.min(c[i] - 'a', next[i + 1] - 'a'));
        }
        char[] stack = new char[n];
        int j = 0;
        int k = 0;
        for (int i = 0; i < n; ++i) {
            if (c[i] == next[i]) {
                c[j++] = c[i];
                while (k > 0 && stack[k - 1] <= next[i + 1]) {
                    c[j++] = stack[--k];
                }
            } else {
                stack[k++] = c[i];
            }
        }
        while (k > 0) {
            c[j++] = stack[--k];
        }
        return new String(c);
    }
}
