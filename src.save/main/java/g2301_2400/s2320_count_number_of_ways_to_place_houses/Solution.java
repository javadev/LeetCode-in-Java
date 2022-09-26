package g2301_2400.s2320_count_number_of_ways_to_place_houses;

// #Medium #Dynamic_Programming #2022_06_28_Time_13_ms_(82.46%)_Space_40.6_MB_(94.91%)

public class Solution {
    public int countHousePlacements(int n) {
        // algo - 1st solve one side  of the street
        // think 0 - space , 1 - house
        // if n = 1 then we can take one 0 and one 1 (total ways = 2)
        // if n = 2 then 00 , 01 , 10 , 11 but we cant take 11 as two house cant be adjacent.
        // so the 1 ended string will be only 1 which is same as previous 0 ended string and 0 ended
        // string are 2 which is previous sum(total ways)
        // apply this formula for n no's
        long mod = 1000000007;
        long space = 1;
        long house = 1;
        long sum = space + house;
        while (--n > 0) {
            house = space;
            space = sum;
            sum = (house + space) % mod;
        }
        // as street has two side
        return (int) ((sum * sum) % mod);
    }
}
