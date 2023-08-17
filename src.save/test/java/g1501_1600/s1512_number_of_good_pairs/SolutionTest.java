package g1501_1600.s1512_number_of_good_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numIdenticalPairs() {
        assertThat(new Solution().numIdenticalPairs(new int[] {1, 2, 3, 1, 1, 3}), equalTo(4));
    }

    @Test
    void numIdenticalPairs2() {
        assertThat(new Solution().numIdenticalPairs(new int[] {1, 1, 1, 1}), equalTo(6));
    }

    @Test
    void numIdenticalPairs3() {
        assertThat(new Solution().numIdenticalPairs(new int[] {1, 2, 3}), equalTo(0));
    }
}
