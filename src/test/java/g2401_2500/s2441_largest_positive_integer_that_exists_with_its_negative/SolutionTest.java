package g2401_2500.s2441_largest_positive_integer_that_exists_with_its_negative;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMaxK() {
        assertThat(new Solution().findMaxK(new int[] {-1, 2, -3, 3}), equalTo(3));
    }

    @Test
    void findMaxK2() {
        assertThat(new Solution().findMaxK(new int[] {-1, 10, 6, 7, -7, 1}), equalTo(7));
    }

    @Test
    void findMaxK3() {
        assertThat(new Solution().findMaxK(new int[] {-10, 8, 6, 7, -2, -3}), equalTo(-1));
    }
}
