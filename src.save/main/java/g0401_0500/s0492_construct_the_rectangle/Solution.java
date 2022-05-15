package g0401_0500.s0492_construct_the_rectangle;

// #Easy #Math #Acceptance_52.7% #2022_03_19_Time_1_ms_(74.25%)_Space_41.9_MB_(17.67%)

public class Solution {
    /*
      Algorithm:
     - start with an index i from the square root all the way to 1;
     - if at any time, area % i == 0 (so i is a divisor of area), then it's the closest solution.
    */
    public int[] constructRectangle(int area) {
        int low = (int) Math.sqrt(area);
        while (low > 0) {
            if (area % low == 0) {
                return new int[] {area / low, low};
            }
            low--;
        }
        return new int[] {0, 0};
    }
}
