package g2101_2200.s2148_count_elements_with_strictly_smaller_and_greater_elements;

// #Easy #Array #Sorting #2022_06_07_Time_0_ms_(100.00%)_Space_40.6_MB_(88.75%)

public class Solution {
    public int countElements(int[] a) {
        int min = a[0];
        int max = a[0];
        int minocr = 1, maxocr = 1;
        for (int i = 1; i < a.length; ++i) {
            {
                if (a[i] < min) {
                    min = a[i];
                    minocr = 1;
                } else if (a[i] == min) {
                    minocr++;
                }
            }
            {
                if (a[i] > max) {
                    max = a[i];
                    maxocr = 1;
                } else if (a[i] == max) {
                    maxocr++;
                }
            }
        }
        return (min == max) ? 0 : a.length - minocr - maxocr;
    }
}
