package g1701_1800.s1737_change_minimum_characters_to_satisfy_one_of_three_conditions;

// #Medium #String #Hash_Table #Prefix_Sum #Counting
// #2022_04_29_Time_8_ms_(87.70%)_Space_54.4_MB_(51.42%)

public class Solution {
    public int minCharacters(String s1, String s2) {
        int[] a = new int[26];
        int[] b = new int[26];
        int l1 = s1.length();
        int l2 = s2.length();
        for (char i : s1.toCharArray()) {
            a[i - 'a']++;
        }
        for (char i : s2.toCharArray()) {
            b[i - 'a']++;
        }
        int min = Integer.MAX_VALUE;
        int t1 = 0;
        int t2 = 0;
        int max = -1;
        for (int i = 0; i < 25; i++) {
            t1 += a[i];
            t2 += b[i];
            min = Math.min(min, Math.min(t1 + l2 - t2, t2 + l1 - t1));
            max = Math.max(max, a[i] + b[i]);
        }
        max = Math.max(max, a[25] + b[25]);
        return Math.min(min, l1 + l2 - max);
    }
}
