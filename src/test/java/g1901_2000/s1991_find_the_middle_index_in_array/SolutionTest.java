package g1901_2000.s1991_find_the_middle_index_in_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMiddleIndex() {
        assertThat(new Solution().findMiddleIndex(new int[] {2, 3, -1, 8, 4}), equalTo(3));
    }

    @Test
    void findMiddleIndex2() {
        assertThat(new Solution().findMiddleIndex(new int[] {1, -1, 4}), equalTo(2));
    }

    @Test
    void findMiddleIndex3() {
        assertThat(new Solution().findMiddleIndex(new int[] {2, 5}), equalTo(-1));
    }
}
