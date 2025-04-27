package g3501_3600.s3528_unit_conversion_i;

// #Medium #2025_04_27_Time_3_ms_(99.90%)_Space_127.63_MB_(29.91%)

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
