package g0601_0700.s0605_can_place_flowers;

// #Easy #Array #Greedy #Udemy_Arrays #2022_03_21_Time_1_ms_(96.77%)_Space_51.2_MB_(61.33%)

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && n > 0) {
                boolean left = i == 0 || flowerbed[i - 1] == 0;
                boolean right = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;
                if (left && right) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
            if (n == 0) {
                break;
            }
        }
        return n == 0;
    }
}
