package g3801_3900.s3830_longest_alternating_subarray_after_removing_at_most_one_element;

// #Hard #Array #Dynamic_Programming #Enumeration #Senior_Staff #Weekly_Contest_487
// #2026_07_20_Time_13_ms_(100.00%)_Space_176.55_MB_(93.88%)

public class Solution {

    public int longestAlternating(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        State state = new State();
        while (state.right < nums.length) {
            int direction = Integer.compare(nums[state.right], nums[state.right - 1]);
            processDirection(state, direction);
        }
        return state.maxLength;
    }

    private void processDirection(State state, int direction) {
        if (direction == 0) {
            processEqualValues(state);
            return;
        }
        boolean currentUp = direction > 0;
        if (isRepeatedDirection(state, currentUp)) {
            processRepeatedDirection(state);
        } else {
            processAlternatingDirection(state);
        }
        state.up = currentUp;
    }

    private boolean isRepeatedDirection(State state, boolean currentUp) {
        return state.up != null && state.up == currentUp;
    }

    private void processRepeatedDirection(State state) {
        if (state.used) {
            resetToUsedIndex(state);
            return;
        }
        state.used = true;
        state.usedIndex = state.right - 1;
        updateMax(state, state.right - state.left);
        state.right++;
    }

    private void processAlternatingDirection(State state) {
        int length = state.right - state.left;
        if (!state.used) {
            length++;
        }
        updateMax(state, length);
        state.right++;
    }

    private void processEqualValues(State state) {
        if (state.used) {
            resetToUsedIndex(state);
            return;
        }
        state.used = true;
        state.usedIndex = state.right;
        updateMax(state, state.right - state.left);
        state.right++;
    }

    private void resetToUsedIndex(State state) {
        state.used = false;
        state.left = state.usedIndex;
    }

    private void updateMax(State state, int length) {
        state.maxLength = Math.max(state.maxLength, length);
    }

    private static class State {
        private int left;
        private int right = 1;
        private Boolean up;
        private boolean used;
        private int usedIndex;
        private int maxLength;
    }
}
