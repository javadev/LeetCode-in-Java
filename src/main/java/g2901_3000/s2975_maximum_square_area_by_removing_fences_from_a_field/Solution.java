package g2901_3000.s2975_maximum_square_area_by_removing_fences_from_a_field;

// #Medium #Array #Hash_Table #Enumeration #2024_01_18_Time_413_ms_(78.25%)_Space_60.2_MB_(79.94%)

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int maximizeSquareArea(
            final int m, final int n, final int[] hFences, final int[] vFences) {
        int[] hFencesWithBorder = new int[hFences.length + 2];
        System.arraycopy(hFences, 0, hFencesWithBorder, 0, hFences.length);
        hFencesWithBorder[hFences.length] = 1;
        hFencesWithBorder[hFences.length + 1] = m;
        Arrays.sort(hFencesWithBorder);
        Set<Integer> edgeSet = new HashSet<>();
        for (int i = 0; i < hFencesWithBorder.length; i += 1) {
            for (int j = i + 1; j < hFencesWithBorder.length; j += 1) {
                edgeSet.add(hFencesWithBorder[j] - hFencesWithBorder[i]);
            }
        }
        int maxEdge = -1;
        int[] vFencesWithBorder = new int[vFences.length + 2];
        System.arraycopy(vFences, 0, vFencesWithBorder, 0, vFences.length);
        vFencesWithBorder[vFences.length] = 1;
        vFencesWithBorder[vFences.length + 1] = n;
        Arrays.sort(vFencesWithBorder);
        for (int i = 0; i < vFencesWithBorder.length; i += 1) {
            for (int j = i + 1; j < vFencesWithBorder.length; j += 1) {
                int curEdge = vFencesWithBorder[j] - vFencesWithBorder[i];
                if (edgeSet.contains(curEdge) && curEdge > maxEdge) {
                    maxEdge = curEdge;
                }
            }
        }
        int mod = (int) 1e9 + 7;
        return (maxEdge != -1) ? (int) ((long) maxEdge * maxEdge % mod) : -1;
    }
}
