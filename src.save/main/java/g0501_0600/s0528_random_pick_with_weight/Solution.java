package g0501_0600.s0528_random_pick_with_weight;

// #Medium #Math #Binary_Search #Prefix_Sum #Randomized #Binary_Search_II_Day_13
// #2022_03_18_Time_29_ms_(83.26%)_Space_46.5_MB_(94.36%)

import java.util.Comparator;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;

@SuppressWarnings("java:S2245")
public class Solution {
    private int prefix;
    private final Random random;
    private final TreeSet<int[]> treeSet;

    public Solution(int[] w) {
        prefix = 0;
        treeSet = new TreeSet<>(Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < w.length; i++) {
            prefix += w[i];
            treeSet.add(new int[] {prefix, i});
        }
        random = new Random();
    }

    public int pickIndex() {
        int target = random.nextInt(prefix) + 1;
        return Objects.requireNonNull(treeSet.ceiling(new int[] {target, 1}))[1];
    }
}
