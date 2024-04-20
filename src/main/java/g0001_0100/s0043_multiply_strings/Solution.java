package g0001_0100.s0043_multiply_strings;

// #Medium #String #Math #Simulation #Data_Structure_II_Day_8_String #Programming_Skills_II_Day_4
// #Level_2_Day_2_String #2023_08_11_Time_1_ms_(100.00%)_Space_41.2_MB_(87.78%)

public class Solution {
    private int[] getIntArray(String s) {
        char[] chars = s.toCharArray();
        int[] arr = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            arr[i] = chars[i] - '0';
        }
        return arr;
    }

    private String convertToStr(int[] res, int i) {
        char[] chars = new char[res.length - i];
        int k = 0;
        for (; i < res.length; i++) {
            chars[k] = (char) (res[i] + '0');
            k++;
        }
        return new String(chars);
    }

    public String multiply(String num1, String num2) {
        int[] arr1 = getIntArray(num1);
        int[] arr2 = getIntArray(num2);
        int[] res = new int[arr1.length + arr2.length];
        int index = arr1.length + arr2.length - 1;
        for (int i = arr2.length - 1; i >= 0; i--) {
            int k = index--;
            for (int j = arr1.length - 1; j >= 0; j--) {
                res[k] += arr2[i] * arr1[j];
                k--;
            }
        }
        index = arr1.length + arr2.length - 1;
        int carry = 0;
        for (int i = index; i >= 0; i--) {
            int temp = res[i] + carry;
            res[i] = temp % 10;
            carry = temp / 10;
        }
        int i = 0;
        while (i < res.length && res[i] == 0) {
            i++;
        }

        if (i > index) {
            return "0";
        } else {
            return convertToStr(res, i);
        }
    }
}
