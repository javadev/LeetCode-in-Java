package g1701_1800.s1774_closest_dessert_cost;

// #Medium #Array #Dynamic_Programming #Backtracking
// #2022_04_27_Time_5_ms_(82.32%)_Space_42.3_MB_(20.34%)

@SuppressWarnings("java:S1871")
public class Solution {
    private int finalValue = Integer.MAX_VALUE;

    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        for (int baseCost : baseCosts) {
            closestCost(baseCost, toppingCosts, target, 0);
        }
        return finalValue;
    }

    private void closestCost(int curCost, int[] toppingCosts, int target, int index) {
        if (index >= toppingCosts.length || curCost >= target) {
            if (Math.abs(target - curCost) < Math.abs(target - finalValue)) {
                finalValue = curCost;
            } else if (Math.abs(target - curCost) == Math.abs(target - finalValue)
                    && target < finalValue) {
                finalValue = curCost;
            }
            return;
        }
        closestCost(curCost, toppingCosts, target, index + 1);
        closestCost(curCost + toppingCosts[index], toppingCosts, target, index + 1);
        closestCost(curCost + toppingCosts[index] * 2, toppingCosts, target, index + 1);
    }
}
