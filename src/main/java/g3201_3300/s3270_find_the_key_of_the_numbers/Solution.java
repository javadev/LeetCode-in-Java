package g3201_3300.s3270_find_the_key_of_the_numbers;

// #Easy #2024_09_02_Time_0_ms_(100.00%)_Space_40.5_MB_(100.00%)

public class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int s1 =
                Math.min(((num1 / 1000) % 10), Math.min(((num2 / 1000) % 10), ((num3 / 1000) % 10)))
                        * 1000;
        int s2 =
                Math.min(((num1 / 100) % 10), Math.min(((num2 / 100) % 10), ((num3 / 100) % 10)))
                        * 100;
        int s3 =
                Math.min(((num1 / 10) % 10), Math.min(((num2 / 10) % 10), ((num3 / 10) % 10))) * 10;
        int s4 = Math.min((num1 % 10), Math.min((num2 % 10), (num3 % 10)));
        return s1 + s2 + s3 + s4;
    }
}
