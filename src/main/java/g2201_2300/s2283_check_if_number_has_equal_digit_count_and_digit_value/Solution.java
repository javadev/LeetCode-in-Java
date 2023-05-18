package g2201_2300.s2283_check_if_number_has_equal_digit_count_and_digit_value;

// #Easy #String #Hash_Table #Counting #2022_06_17_Time_1_ms_(99.36%)_Space_40.4_MB_(96.46%)

public class Solution {
    public boolean digitCount(String num) {
        int[] cnt = new int[11];
        char[] arr = num.toCharArray();
        for (char d : arr) {
            ++cnt[d - '0'];
        }
        for (int i = 0; i < arr.length; i++) {
            if (cnt[i] != arr[i] - '0') {
                return false;
            }
        }
        return true;
    }
}
