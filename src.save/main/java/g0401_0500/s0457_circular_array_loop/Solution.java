package g0401_0500.s0457_circular_array_loop;

// #Medium #Array #Hash_Table #Two_Pointers #2022_07_18_Time_1_ms_(83.72%)_Space_40.1_MB_(85.66%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean circularArrayLoop(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        // arr[i]%n==0 (cycle)
        for (int start = 0; start < n; start++) {
            if (map.containsKey(start)) {
                // check if already visited
                continue;
            }
            int curr = start;
            // Check if the current index is valid
            while (isValidCycle(start, curr, arr)) {
                // marking current index visited and set value as start of loop
                map.put(curr, start);
                // steps to jump;
                int jump = arr[curr] % n;
                // Jumping x steps backwards is same as jumping (n-x) steps forward
                // going to next index;
                curr = (curr + jump + n) % n;
                if (map.containsKey(curr)) {
                    // value already processed
                    if (map.get(curr) == start) {
                        // If equal to start then we have found a loop
                        return true;
                    }
                    // Else we can break since this has already been visited hence we will get the
                    // same result as before
                    break;
                }
            }
        }
        return false;
    }

    private boolean isValidCycle(int start, int curr, int[] arr) {
        return (arr[start] <= 0 || arr[curr] >= 0)
                && (arr[start] >= 0 || arr[curr] <= 0)
                && (arr[curr] % arr.length != 0);
    }
}
