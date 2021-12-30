package g0401_0500.s0434_number_of_segments_in_a_string;

// #Easy #String

public class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        String[] splitted = s.split(" ");
        int result = 0;
        for (int i = 0; i < splitted.length; i++) {
            if (splitted[i].length() > 0) {
                result++;
            }
        }
        return result;
    }
}
