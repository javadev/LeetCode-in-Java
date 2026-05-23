package g3701_3800.s3783_mirror_distance_of_an_integer;

// #Easy #Math #Mid_Level #Weekly_Contest_481 #2026_05_22_Time_1_ms_(99.88%)_Space_42.74_MB_(18.96%)

public class Solution {
    private int rev(int n) {
        int a = 0;
        while (n > 0) {
            a = a * 10 + (n % 10);
            n /= 10;
        }
        return a;
    }

    public int mirrorDistance(int n) {
        int m = rev(n);
        return Math.abs(m - n);
    }
}
