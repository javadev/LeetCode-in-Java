package g3001_3100.s3014_minimum_number_of_pushes_to_type_word_i;

// #Easy #String #Math #Greedy #2024_02_28_Time_0_ms_(100.00%)_Space_41.5_MB_(91.88%)

public class Solution {
    public int minimumPushes(String word) {
        if (word.length() <= 8) {
            return word.length();
        } else {
            int iteration = 1;
            int len = word.length();
            int count = 0;
            while (len > 0) {
                if (len >= 8) {
                    count = count + 8 * iteration;
                    len = len - 8;
                } else {
                    count = count + len * iteration;
                    len = 0;
                }
                iteration++;
            }
            return count;
        }
    }
}
