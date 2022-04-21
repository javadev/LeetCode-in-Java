package g1601_1700.s1643_kth_smallest_instructions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kthSmallestPath() {
        assertThat(new Solution().kthSmallestPath(new int[] {2, 3}, 1), equalTo("HHHVV"));
    }

    @Test
    void kthSmallestPath2() {
        assertThat(new Solution().kthSmallestPath(new int[] {2, 3}, 2), equalTo("HHVHV"));
    }

    @Test
    void kthSmallestPath3() {
        assertThat(new Solution().kthSmallestPath(new int[] {2, 3}, 3), equalTo("HHVVH"));
    }
}
