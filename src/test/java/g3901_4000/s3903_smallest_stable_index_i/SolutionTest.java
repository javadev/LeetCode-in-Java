package g3901_4000.s3903_smallest_stable_index_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void firstStableIndex() {
        assertThat(new Solution().firstStableIndex(new int[] {5, 0, 1, 4}, 3), equalTo(3));
    }

    @Test
    void firstStableIndex2() {
        assertThat(new Solution().firstStableIndex(new int[] {3, 2, 1}, 1), equalTo(-1));
    }

    @Test
    void firstStableIndex3() {
        assertThat(new Solution().firstStableIndex(new int[] {0}, 0), equalTo(0));
    }

    @Test
    void firstStableIndex4() {
        assertThat(new Solution().firstStableIndex(new int[] {1, 2, 3}, 0), equalTo(0));
    }

    @Test
    void firstStableIndex5() {
        assertThat(new Solution().firstStableIndex(new int[] {5, 0, 1, 4}, 4), equalTo(2));
    }

    @Test
    void firstStableIndex6() {
        assertThat(
                new Solution().firstStableIndex(new int[] {1000000000, 0}, 1000000000), equalTo(0));
    }
}
