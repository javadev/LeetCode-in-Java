package g2601_2700.s2659_make_array_empty;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countOperationsToEmptyArray() {
        assertThat(new Solution().countOperationsToEmptyArray(new int[] {3, 4, -1}), equalTo(5L));
    }

    @Test
    void countOperationsToEmptyArray2() {
        assertThat(new Solution().countOperationsToEmptyArray(new int[] {1, 2, 3}), equalTo(3L));
    }
}
