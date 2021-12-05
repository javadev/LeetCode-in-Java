package g0201_0300.s0202_happy_number;

public class Solution {
    public boolean isHappy(int n) {
        boolean happy = false;
        int a = n;
        int rem = 0;
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
