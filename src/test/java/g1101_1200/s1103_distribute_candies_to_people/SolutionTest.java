package g1101_1200.s1103_distribute_candies_to_people;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distributeCandies() {
        assertThat(new Solution().distributeCandies(7, 4), equalTo(new int[] {1, 2, 3, 1}));
    }

    @Test
    void distributeCandies2() {
        assertThat(new Solution().distributeCandies(10, 3), equalTo(new int[] {5, 2, 3}));
    }
}
