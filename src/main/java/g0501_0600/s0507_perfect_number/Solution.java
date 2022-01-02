package g0501_0600.s0507_perfect_number;

// #Easy #Math

public class Solution {
    public boolean checkPerfectNumber(int num) {
        int s = 1;
        for (int sq = (int) Math.sqrt(num); sq > 1; sq--)
            s = num % sq == 0 ? s += sq + (num / sq) : s;
        return num != 1 && s == num;
    }
}
