package g3901_4000.s3939_count_non_adjacent_subsets_in_a_rooted_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countValidSubsets8() {
        int[] parent = new int[32];
        parent[0] = -1;
        int[] nums = new int[32];
        java.util.Arrays.fill(nums, 1);
        // Any non-empty leaf subset or the root alone: 2^31 subsets modulo 1_000_000_007.
        assertThat(new Solution().countValidSubsets(parent, nums, 1), equalTo(147483634));
    }

    @Test
    void countValidSubsets() {
        assertThat(
                new Solution().countValidSubsets(new int[] {-1, 0, 1}, new int[] {1, 2, 3}, 3),
                equalTo(1));
    }

    @Test
    void countValidSubsets2() {
        assertThat(
                new Solution()
                        .countValidSubsets(new int[] {-1, 0, 0, 0}, new int[] {2, 1, 2, 1}, 3),
                equalTo(2));
    }

    @Test
    void countValidSubsets3() {
        assertThat(new Solution().countValidSubsets(new int[] {-1}, new int[] {6}, 3), equalTo(1));
    }

    @Test
    void countValidSubsets4() {
        assertThat(new Solution().countValidSubsets(new int[] {-1}, new int[] {5}, 3), equalTo(0));
    }

    @Test
    void countValidSubsets5() {
        assertThat(
                new Solution().countValidSubsets(new int[] {-1, 0, 1}, new int[] {1, 1, 1}, 1),
                equalTo(4));
    }

    @Test
    void countValidSubsets6() {
        assertThat(
                new Solution()
                        .countValidSubsets(new int[] {-1, 0, 0, 0}, new int[] {1, 1, 1, 1}, 1),
                equalTo(8));
    }

    @Test
    void countValidSubsets7() {
        assertThat(
                new Solution().countValidSubsets(new int[] {-1, 0}, new int[] {1, 2}, 3),
                equalTo(0));
    }
}
