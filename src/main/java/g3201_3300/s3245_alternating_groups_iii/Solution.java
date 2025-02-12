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

    // Binary Indexed Tree (BIT) class.
    private static class BIT {
        int[] bs = new int[SZ];

        // Update BIT: add value y to index x.
        void update(int x, int y) {
            x = OFFSET - x;
            for (; x < SZ; x += x & -x) {
                bs[x] += y;
            }
        }

        // Query BIT: get the prefix sum up to index x.
        int query(int x) {
            x = OFFSET - x;
            int ans = 0;
            for (; x > 0; x -= x & -x) {
                ans += bs[x];
            }
            return ans;
        }

        // Clear BIT values starting from index x.
        void clear(int x) {
            x = OFFSET - x;
            for (; x < SZ; x += x & -x) {
                bs[x] = 0;
            }
        }
    }

    // --- BIT wrapper methods ---
    // Updates both BITs for a given group length.
    private void edt(int x, int y) {
        // Second BIT is updated with x * y.
        BITS[1].update(x, x * y);
        // First BIT is updated with y.
        BITS[0].update(x, y);
    }

    // Combines BIT queries to get the result for a given x.
    private int qry(int x) {
        return BITS[1].query(x) + (1 - x) * BITS[0].query(x);
    }

    // Returns the length of a group from index x to y.
    private int len(int x, int y) {
        return y - x + 1;
    }

    // --- Group operations ---
    // Removes a group (block) by updating BIT with a negative value.
    private void removeGroup(int start, int end) {
        edt(len(start, end), -1);
    }

    // Adds a group (block) by updating BIT with a positive value.
    private void addGroup(int start, int end) {
        edt(len(start, end), 1);
    }

    // Initializes the alternating groups using the colors array.
    private void initializeGroups(int[] colors, TreeMap<Integer, Integer> groups) {
        int n = colors.length;
        int i = 0;
        while (i < n) {
            int r = i;
            // Determine the end of the current alternating group.
            while (r < n && (colors[r] + colors[i] + r + i) % 2 == 0) {
                ++r;
            }
            // The group spans from index i to r-1.
            groups.put(i, r - 1);
            // Update BITs with the length of this group.
            edt(r - i, 1);
            // Skip to the end of the current group.
            i = r - 1;
            ++i;
        }
    }

    // Processes a type 1 query: returns the number of alternating groups
    // of at least the given size.
    private int processQueryType1(int[] colors, TreeMap<Integer, Integer> groups, int groupSize) {
        int ans = qry(groupSize);
        Map.Entry<Integer, Integer> firstGroup = groups.firstEntry();
        Map.Entry<Integer, Integer> lastGroup = groups.lastEntry();
        // If there is more than one group and the first and last colors differ,
        // adjust the answer by "merging" the groups at the boundaries.
        if (firstGroup != lastGroup) {
            if (colors[0] != colors[colors.length - 1]) {
                int leftLen = len(firstGroup.getKey(), firstGroup.getValue());
                int rightLen = len(lastGroup.getKey(), lastGroup.getValue());
                ans -= Math.max(leftLen - groupSize + 1, 0);
                ans -= Math.max(rightLen - groupSize + 1, 0);
                ans += Math.max(leftLen + rightLen - groupSize + 1, 0);
            }
        } else if (colors[0] != colors[colors.length - 1]) {
            // In the special case when there's a single group but the
            // first and last colors differ, the whole array is counted.
            ans = colors.length;
        }
        return ans;
    }

    // Processes a type 2 query: updates the color at index x and adjusts groups.
    private void processQueryType2(
            int[] colors, TreeMap<Integer, Integer> groups, int x, int newColor) {
        if (colors[x] == newColor) {
            return;
        }
        // Update the color at index x.
        colors[x] = newColor;
        // Find the group (block) that contains index x.
        Map.Entry<Integer, Integer> it = groups.floorEntry(x);
        int l = it.getKey();
        int r = it.getValue();
        // Remove the old group from BIT and map.
        removeGroup(l, r);
        groups.remove(l);
        int ml = x;
        int mr = x;
        // Process the left side of index x.
        if (l != x) {
            groups.put(l, x - 1);
            addGroup(l, x - 1);
        } else {
            if (x > 0 && colors[x] != colors[x - 1]) {
                it = groups.floorEntry(x - 1);
                if (it != null) {
                    ml = it.getKey();
                    removeGroup(it.getKey(), it.getValue());
                    groups.remove(it.getKey());
                }
            }
        }
        // Process the right side of index x.
        if (r != x) {
            groups.put(x + 1, r);
            addGroup(x + 1, r);
        } else {
            if (x + 1 < colors.length && colors[x + 1] != colors[x]) {
                it = groups.ceilingEntry(x + 1);
                if (it != null) {
                    mr = it.getValue();
                    removeGroup(it.getKey(), it.getValue());
                    groups.remove(it.getKey());
                }
            }
        }

        // Merge the affected groups into one new group.
        groups.put(ml, mr);
        addGroup(ml, mr);
    }

    // Clears both BITs. This is done after processing all queries.
    private void clearAllBITs(int n) {
        for (int i = 0; i <= n + 2; ++i) {
            BITS[0].clear(i);
            BITS[1].clear(i);
        }
    }

    // Main function to handle queries on alternating groups.
    public List<Integer> numberOfAlternatingGroups(int[] colors, int[][] queries) {
        TreeMap<Integer, Integer> groups = new TreeMap<>();
        int n = colors.length;
        List<Integer> results = new ArrayList<>();
        // Initialize alternating groups.
        initializeGroups(colors, groups);
        // Process each query.
        for (int[] query : queries) {
            if (query[0] == 1) {
                // Type 1 query: count alternating groups of at least a given size.
                int groupSize = query[1];
                int ans = processQueryType1(colors, groups, groupSize);
                results.add(ans);
            } else {
                // Type 2 query: update the color at a given index.
                int index = query[1];
                int newColor = query[2];
                processQueryType2(colors, groups, index, newColor);
            }
        }
        // Clear BITs after processing all queries.
        clearAllBITs(n);
        return results;
    }
}
