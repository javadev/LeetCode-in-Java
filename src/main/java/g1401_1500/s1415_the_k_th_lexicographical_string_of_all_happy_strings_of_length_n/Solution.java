package g1401_1500.s1415_the_k_th_lexicographical_string_of_all_happy_strings_of_length_n;

// #Medium #String #Backtracking #2022_03_27_Time_2_ms_(90.55%)_Space_42.5_MB_(65.75%)

public class Solution {
    private char[] arr = new char[] {'a', 'b', 'c'};
    private String res = "";
    private int k;

    private void get(StringBuilder str, int n, int index) {
        if (k < 1) {
            return;
        }
        if (str.length() == n) {
            if (k == 1) {
                res = str.toString();
            }
            k--;
            return;
        }
        for (int i = 0; i < 3; i++) {
            if (i == index) {
                continue;
            }
            str.append(arr[i]);
            get(str, n, i);
            str.deleteCharAt(str.length() - 1);
        }
    }

    public String getHappyString(int n, int k) {
        this.k = k;
        get(new StringBuilder(), n, -1);
        return res;
    }
}
