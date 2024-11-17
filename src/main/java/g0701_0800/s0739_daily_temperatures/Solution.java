package g0701_0800.s0739_daily_temperatures;

// #Medium #Top_100_Liked_Questions #Array #Stack #Monotonic_Stack #Programming_Skills_II_Day_6
// #Big_O_Time_O(n)_Space_O(n) #2024_11_17_Time_8_ms_(96.83%)_Space_60.6_MB_(55.93%)

@SuppressWarnings("java:S135")
public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] sol = new int[temperatures.length];
        sol[temperatures.length - 1] = 0;
        for (int i = sol.length - 2; i >= 0; i--) {
            int j = i + 1;
            while (j <= sol.length) {
                if (temperatures[i] < temperatures[j]) {
                    sol[i] = j - i;
                    break;
                } else {
                    if (sol[j] == 0) {
                        break;
                    }
                    j = j + sol[j];
                }
            }
        }
        return sol;
    }
}
