package g1901_2000.s1936_add_minimum_number_of_rungs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void addRungs() {
        assertThat(new Solution().addRungs(new int[] {3, 6, 8, 10}, 3), equalTo(0));
    }

    @Test
    void addRungs2() {
        assertThat(new Solution().addRungs(new int[] {3, 4, 6, 7}, 2), equalTo(1));
    }
}
