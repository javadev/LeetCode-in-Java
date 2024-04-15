package g2901_3000.s2917_find_the_k_or_of_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findKOr() {
        assertThat(new Solution().findKOr(new int[] {7, 12, 9, 8, 9, 15}, 4), equalTo(9));
    }

    @Test
    void findKOr2() {
        assertThat(new Solution().findKOr(new int[] {2, 12, 1, 11, 4, 5}, 6), equalTo(0));
    }

    @Test
    void findKOr3() {
        assertThat(new Solution().findKOr(new int[] {10, 8, 5, 9, 11, 6, 8}, 1), equalTo(15));
    }
}
