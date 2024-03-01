package g0501_0600.s0537_complex_number_multiplication;

// #Medium #String #Math #Simulation #2022_08_02_Time_6_ms_(71.88%)_Space_42.3_MB_(44.10%)

public class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int countReal;
        int countImagine;
        int[] arr1 = new int[2];
        int[] arr2 = new int[2];

        arr1[0] = Integer.parseInt(num1.substring(0, num1.indexOf("+")));
        arr1[1] = Integer.parseInt(num1.substring(num1.indexOf("+") + 1, num1.length() - 1));

        arr2[0] = Integer.parseInt(num2.substring(0, num2.indexOf("+")));
        arr2[1] = Integer.parseInt(num2.substring(num2.indexOf("+") + 1, num2.length() - 1));

        countReal = arr1[0] * arr2[0] - arr1[1] * arr2[1];
        countImagine = arr1[0] * arr2[1] + arr1[1] * arr2[0];

        return countReal + "+" + countImagine + "i";
    }
}
