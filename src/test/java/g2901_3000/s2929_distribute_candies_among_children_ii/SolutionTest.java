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
}
