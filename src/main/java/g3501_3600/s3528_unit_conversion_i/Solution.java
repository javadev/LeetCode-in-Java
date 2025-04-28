package g3501_3600.s3528_unit_conversion_i;

// #Medium #Depth_First_Search #Breadth_First_Search #Graph
// #2025_04_28_Time_3_ms_(99.90%)_Space_127.84_MB_(26.65%)

public class Solution {
    public int[] baseUnitConversions(int[][] conversions) {
        int[] arr = new int[conversions.length + 1];
        arr[0] = 1;
        for (int[] conversion : conversions) {
            long val = ((long) arr[conversion[0]] * conversion[2]) % 1000000007;
            arr[conversion[1]] = (int) val;
        }
        return arr;
    }
}
