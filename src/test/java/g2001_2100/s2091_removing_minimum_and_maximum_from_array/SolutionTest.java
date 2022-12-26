package g2001_2100.s2091_removing_minimum_and_maximum_from_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumDeletions() {
        assertThat(
                new Solution().minimumDeletions(new int[] {2, 10, 7, 5, 4, 1, 8, 6}), equalTo(5));
    }

    @Test
    void minimumDeletions2() {
        assertThat(
                new Solution().minimumDeletions(new int[] {0, -4, 19, 1, 8, -2, -3, 5}),
                equalTo(3));
    }

    @Test
    void minimumDeletions3() {
        assertThat(new Solution().minimumDeletions(new int[] {101}), equalTo(1));
    }
}
