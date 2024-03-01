package g3001_3100.s3016_minimum_number_of_pushes_to_type_word_ii;

// #Medium #String #Hash_Table #Sorting #Greedy #Breadth_First_Search #Graph #Prefix_Sum #Counting
// #2024_02_28_Time_7_ms_(100.00%)_Space_45.5_MB_(91.68%)

public class Solution {
    public int minimumPushes(String word) {
        var count = new int[26];
        var l = word.length();
        for (var i = 0; i < l; ++i) {
            ++count[word.charAt(i) - 'a'];
        }
        int j = 8;
        int result = 0;
        while (true) {
            var mi = 0;
            for (var i = 0; i < 26; ++i) {
                if (count[mi] < count[i]) {
                    mi = i;
                }
            }
            if (count[mi] == 0) {
                break;
            }
            result += (j / 8) * count[mi];
            count[mi] = 0;
            ++j;
        }
        return result;
    }
}
