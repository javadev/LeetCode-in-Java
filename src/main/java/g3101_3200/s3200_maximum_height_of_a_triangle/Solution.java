package g3101_3200.s3200_maximum_height_of_a_triangle;

// #Easy #Array #Enumeration #2024_07_04_Time_1_ms_(86.34%)_Space_40.5_MB_(90.34%)

@SuppressWarnings("java:S135")
public class Solution {
    private int count(int v1, int v2) {
        int ct = 1;
        boolean flag = true;
        while (true) {
            if (flag) {
                if (ct <= v1) {
                    v1 -= ct;
                } else {
                    break;
                }
            } else {
                if (ct <= v2) {
                    v2 -= ct;
                } else {
                    break;
                }
            }
            ct++;
            flag = !flag;
        }
        return ct - 1;
    }

    public int maxHeightOfTriangle(int red, int blue) {
        return Math.max(count(red, blue), count(blue, red));
    }
}
