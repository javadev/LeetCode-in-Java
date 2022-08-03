package g0501_0600.s0556_next_greater_element_iii;

// #Medium #String #Math #Two_Pointers #Programming_Skills_II_Day_10
// #2022_08_03_Time_0_ms_(100.00%)_Space_39.2_MB_(89.26%)

public class Solution {
    /*
    - What this problem wants is finding the next permutation of n
    - Steps to find the next permuation:
       find largest index k such that inp[k] < inp[k+1];
           if k == -1: return -1
           else:
               look for largest index l such that inp[l] > inp[k]
               swap the two index
               reverse from k+1 to n.length
       */
    public int nextGreaterElement(int n) {
        char[] inp = String.valueOf(n).toCharArray();
        // Find k
        int k = -1;
        for (int i = inp.length - 2; i >= 0; i--) {
            if (inp[i] < inp[i + 1]) {
                k = i;
                break;
            }
        }
        if (k == -1) {
            return -1;
        }
        // Find l
        int largerIdx = inp.length - 1;
        for (int i = inp.length - 1; i >= 0; i--) {
            if (inp[i] > inp[k]) {
                largerIdx = i;
                break;
            }
        }
        swap(inp, k, largerIdx);
        reverse(inp, k + 1, inp.length - 1);
        // Build result
        int ret = 0;
        for (char c : inp) {
            int digit = c - '0';
            // Handle the case if ret > Integer.MAX_VALUE - This idea is borrowed from problem  8.
            // String to Integer (atoi)
            if (ret > Integer.MAX_VALUE / 10
                    || (ret == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return -1;
            }
            ret = ret * 10 + (c - '0');
        }
        return ret;
    }

    private void swap(char[] inp, int i, int j) {
        char temp = inp[i];
        inp[i] = inp[j];
        inp[j] = temp;
    }

    private void reverse(char[] inp, int start, int end) {
        while (start < end) {
            char temp = inp[start];
            inp[start] = inp[end];
            inp[end] = temp;
            start++;
            end--;
        }
    }
}
