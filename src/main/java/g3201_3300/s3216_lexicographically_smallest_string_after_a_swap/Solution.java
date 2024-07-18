package g3201_3300.s3216_lexicographically_smallest_string_after_a_swap;

// #Easy #String #Greedy #2024_07_18_Time_1_ms_(100.00%)_Space_43.3_MB_(20.48%)

public class Solution {
    public String getSmallestString(String s) {
        final char[] arr = s.toCharArray();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] % 2 == arr[i] % 2 && arr[i - 1] > arr[i]) {
                final char temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                break;
            }
        }
        return String.valueOf(arr);
    }
}
