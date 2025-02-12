package g3201_3300.s3245_alternating_groups_iii;

// #Hard #Array #Binary_Indexed_Tree #2025_02_12_Time_135_ms_(86.36%)_Space_84.24_MB_(40.91%)

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    private static final int SZ = 63333;
    private static final int OFFSET = SZ - 10;
    private static final BIT[] BITS = {new BIT(), new BIT()};

    // Class to represent the Binary Indexed Tree (BIT)
    private static class BIT {
        int[] bs = new int[SZ];

        // Update BIT: add value y to index x
        void update(int x, int y) {
            x = OFFSET - x;
            for (; x < SZ; x += x & -x) {
                bs[x] += y;
            }
        }

        // Query BIT: get the prefix sum up to index x
        int query(int x) {
            x = OFFSET - x;
            int ans = 0;
            for (; x > 0; x -= x & -x) {
                ans += bs[x];
            }
            return ans;
        }

        // Clear BIT values up to index x
        void clear(int x) {
            x = OFFSET - x;
            for (; x < SZ; x += x & -x) {
                bs[x] = 0;
            }
        }
    }

    // Wrapper functions for updating and querying the BITs
    private void edt(int x, int y) {
        // Update second BIT with product of index and value
        BITS[1].update(x, x * y);
        // Update first BIT with value
        BITS[0].update(x, y);
    }

    private int qry(int x) {
        // Query BITs and combine results
        return BITS[1].query(x) + (1 - x) * BITS[0].query(x);
    }

    // Function to calculate the length between two indices
    private int len(int x, int y) {
        return y - x + 1;
    }

    // Main function to handle the queries
    public List<Integer> numberOfAlternatingGroups(int[] colors, int[][] queries) {
        // Map to store start and end indices of alternating groups
        TreeMap<Integer, Integer> c = new TreeMap<>();
        int n = colors.length;
        // Initialize alternating groups
        for (int i = 0; i < colors.length; ++i) {
            int r = i;
            // Find end of the current alternating group
            while (r < colors.length && (colors[r] + colors[i] + r + i) % 2 == 0) {
                ++r;
            }
            // Store group boundaries in map
            c.put(i, r - 1);
            // Update BITs with new group
            edt(r - i, 1);
            // Move to the end of the current group
            i = r - 1;
        }
        // List to store results for type 1 queries
        List<Integer> results = new ArrayList<>();
        // Process each query
        for (int[] q : queries) {
            if (q[0] == 1) {
                // Query type 1: Count alternating groups of a given size
                int ans = qry(q[1]);
                Map.Entry<Integer, Integer> a = c.firstEntry();
                Map.Entry<Integer, Integer> b = c.lastEntry();
                if (a != b) {
                    // Check if merging groups is possible
                    if (colors[0] != colors[colors.length - 1]) {
                        int l1 = len(a.getKey(), a.getValue());
                        int l2 = len(b.getKey(), b.getValue());
                        // Subtract groups that are too small
                        ans -= Math.max(l1 - q[1] + 1, 0);
                        ans -= Math.max(l2 - q[1] + 1, 0);
                        // Add merged group size
                        ans += Math.max(l1 + l2 - q[1] + 1, 0);
                    }
                } else if (colors[0] != colors[colors.length - 1]) {
                    // If there's only one group, check if it can span the entire array
                    ans = n;
                }
                // Store result for type 1 query
                results.add(ans);
            } else {
                // Query type 2: Update color at a given index
                int x = q[1];
                int y = q[2];
                if (colors[x] == y) {
                    // If color is already correct, skip update
                    continue;
                }
                // Update color
                colors[x] = y;
                // Find the block containing index x
                Map.Entry<Integer, Integer> it = c.floorEntry(x);
                assert it != null && it.getKey() <= x && it.getValue() >= x;
                int l = it.getKey();
                int r = it.getValue();
                // Remove the old block
                edt(len(it.getKey(), it.getValue()), -1);
                c.remove(it.getKey());
                int ml = x;
                int mr = x;
                // Update or split the affected blocks
                if (l != ml) {
                    c.put(l, x - 1);
                    edt(len(l, x - 1), 1);
                } else {
                    if (x > 0 && colors[x] != colors[x - 1]) {
                        it = c.floorEntry(x - 1);
                        if (it != null) {
                            ml = it.getKey();
                            edt(len(it.getKey(), it.getValue()), -1);
                            c.remove(it.getKey());
                        }
                    }
                }
                if (r != mr) {
                    c.put(x + 1, r);
                    edt(len(x + 1, r), 1);
                } else {
                    if (x + 1 < colors.length && colors[x + 1] != colors[x]) {
                        it = c.ceilingEntry(x + 1);
                        if (it != null) {
                            mr = it.getValue();
                            edt(len(it.getKey(), it.getValue()), -1);
                            c.remove(it.getKey());
                        }
                    }
                }
                c.put(ml, mr);
                // Add new or modified block
                edt(len(ml, mr), 1);
            }
        }
        // Clear BITs after processing all queries
        for (int i = 0; i <= n + 2; ++i) {
            BITS[0].clear(i);
            BITS[1].clear(i);
        }
        return results;
    }
}
