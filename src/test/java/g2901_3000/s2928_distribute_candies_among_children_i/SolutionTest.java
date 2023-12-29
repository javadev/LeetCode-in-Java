package g2901_3000.s2928_distribute_candies_among_children_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distributeCandies() {
        assertThat(new Solution().distributeCandies(5, 2), equalTo(3));
    }

    @Test
    void distributeCandies2() {
        assertThat(new Solution().distributeCandies(3, 3), equalTo(10));
    }
}
