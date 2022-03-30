package g0201_0300.s0202_happy_number;

// #Easy #Top_Interview_Questions #Hash_Table #Math #Two_Pointers #Algorithm_II_Day_21_Others
// #Programming_Skills_I_Day_4_Loop #2022_03_04_Time_1_ms_(93.34%)_Space_41.4_MB_(26.37%)

public class Solution {
    public boolean isHappy(int n) {
        boolean happy;
        int a = n;
        int rem;
        int sum = 0;
        if (a == 1 || a == 7) {
            happy = true;
        } else if (a > 1 && a < 10) {
            happy = false;
        } else {
            while (a != 0) {
                rem = a % 10;
                sum = sum + (rem * rem);
                a = a / 10;
            }
            if (sum != 1) {
                happy = isHappy(sum);
            } else {
                happy = true;
            }
        }

        return happy;
    }
}
