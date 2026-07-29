package g3801_3900.s3862_find_the_smallest_balanced_index;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestBalancedIndex() {
        assertThat(new Solution().smallestBalancedIndex(new int[] {2, 1, 2}), equalTo(1));
    }

    @Test
    void smallestBalancedIndex2() {
        assertThat(new Solution().smallestBalancedIndex(new int[] {2, 8, 2, 2, 5}), equalTo(2));
    }

    @Test
    void smallestBalancedIndex3() {
        assertThat(new Solution().smallestBalancedIndex(new int[] {1}), equalTo(-1));
    }
}
