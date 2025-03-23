package g3401_3500.s3492_maximum_containers_on_a_ship;

// #Easy #2025_03_23_Time_0_ms_(100.00%)_Space_40.80_MB_(88.06%)

public class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int c = n * n;
        int count = maxWeight / w;
        return Math.min(c, count);
    }
}
