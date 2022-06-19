package g2201_2300.s2269_find_the_k_beauty_of_a_number;

// #Easy #String #Math #Sliding_Window #2022_06_15_Time_2_ms_(38.88%)_Space_41.3_MB_(41.96%)

public class Solution {
    public int divisorSubstrings(int num, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        String s = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        while (i < s.length() && j < s.length()) {
            sb.append(s.charAt(j) - '0');
            int val = Integer.parseInt(sb.toString());
            if (j - i + 1 == k) {
                if (val != 0 && num % val == 0) {
                    count++;
                }
                sb.deleteCharAt(0);
                i++;
                j++;
            } else {
                j++;
            }
        }
        return count;
    }
}
