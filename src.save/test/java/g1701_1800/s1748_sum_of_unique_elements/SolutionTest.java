package g1701_1800.s1748_sum_of_unique_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOfUnique() {
        assertThat(new Solution().sumOfUnique(new int[] {1, 2, 3, 2}), equalTo(4));
    }

    @Test
    void sumOfUnique2() {
        assertThat(new Solution().sumOfUnique(new int[] {1, 1, 1, 1, 1}), equalTo(0));
    }

    @Test
    void sumOfUnique3() {
        assertThat(new Solution().sumOfUnique(new int[] {1, 2, 3, 4, 5}), equalTo(15));
    }
}
