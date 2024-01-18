package g2201_2300.s2240_number_of_ways_to_buy_pens_and_pencils;

// #Medium #Math #Enumeration #2022_06_13_Time_19_ms_(68.73%)_Space_41.4_MB_(12.23%)

public class Solution {
    public long waysToBuyPensPencils(int totalMoney, int costPen, int costPencil) {
        long ways = 0;
        for (int cntPen = 0; (cntPen * costPen) <= totalMoney; cntPen++) {
            int remMoney = (totalMoney - (cntPen * costPen));
            ways += (remMoney / costPencil) + 1;
        }
        return ways;
    }
}
