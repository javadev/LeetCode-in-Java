package g2901_3000.s2929_distribute_candies_among_children_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distributeCandies() {
        assertThat(new Solution().distributeCandies(5, 2), equalTo(3L));
    }

    @Test
    void distributeCandies2() {
        assertThat(new Solution().distributeCandies(3, 3), equalTo(10L));
    }

    @Test
    void distributeCandies3() {
        assertThat(new Solution().distributeCandies(2, 5), equalTo(6L));
    }

    @Test
    void distributeCandies4() {
        assertThat(new Solution().distributeCandies(4, 4), equalTo(15L));
    }

    @Test
    void distributeCandies5() {
        assertThat(new Solution().distributeCandies(7, 5), equalTo(27L));
    }

    @Test
    void distributeCandies6() {
        assertThat(new Solution().distributeCandies(12, 5), equalTo(10L));
    }

    @Test
    void distributeCandies7() {
        assertThat(new Solution().distributeCandies(20, 5), equalTo(0L));
    }

    @Test
    void distributeCandies8() {
        assertThat(new Solution().distributeCandies(10, 5), equalTo(21L));
    }

    @Test
    void distributeCandies9() {
        assertThat(new Solution().distributeCandies(15, 5), equalTo(1L));
    }
}
