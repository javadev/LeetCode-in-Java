package g0401_0500.s0402_remove_k_digits;

// #Medium #String #Greedy #Stack #Monotonic_Stack #Acceptance_30.5%
// #2022_03_16_Time_6_ms_(90.82%)_Space_45.6_MB_(44.06%)

public class Solution {
    public String removeKdigits(String num, int k) {
        char[] list = new char[num.length()];
        int len = num.length() - k;
        int top = 0;
        for (int i = 0; i < num.length(); i++) {
            while (top > 0 && k > 0 && num.charAt(i) < list[top - 1]) {
                top--;
                k--;
            }
            list[top++] = num.charAt(i);
        }
        int number = 0;
        while (number < len && list[number] == '0') {
            number++;
        }
        return number == len ? "0" : new String(list, number, len - number);
    }
}
