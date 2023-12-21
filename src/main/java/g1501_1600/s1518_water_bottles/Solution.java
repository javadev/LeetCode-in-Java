package g1501_1600.s1518_water_bottles;

// #Easy #Math #Simulation #2022_04_09_Time_0_ms_(100.00%)_Space_40.5_MB_(71.92%)

public class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drunk = numBottles;
        int emptyBottles = numBottles;
        while (emptyBottles >= numExchange) {
            int exchangedBottles = emptyBottles / numExchange;
            drunk += exchangedBottles;
            int unUsedEmptyBottles = emptyBottles % numExchange;
            emptyBottles = exchangedBottles + unUsedEmptyBottles;
        }
        return drunk;
    }
}
