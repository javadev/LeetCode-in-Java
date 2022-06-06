package g2101_2200.s2195_append_k_integers_with_minimal_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimalKSum() {
        assertThat(new Solution().minimalKSum(new int[] {1, 4, 25, 10, 25}, 2), equalTo(5L));
    }

    @Test
    void minimalKSum2() {
        assertThat(new Solution().minimalKSum(new int[] {5, 6}, 6), equalTo(25L));
    }
}
