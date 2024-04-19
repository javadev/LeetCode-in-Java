package g3001_3100.s3100_water_bottles_ii;

// #Medium #Math #Simulation #2024_04_19_Time_0_ms_(100.00%)_Space_40.8_MB_(45.33%)

public class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int emptyBottles = numBottles;
        int bottleDrinks = numBottles;
        while (numExchange <= emptyBottles) {
            bottleDrinks += 1;
            emptyBottles = 1 + (emptyBottles - numExchange);
            numExchange++;
        }
        return bottleDrinks;
    }
}
