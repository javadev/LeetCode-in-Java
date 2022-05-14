package g1901_2000.s1921_eliminate_maximum_number_of_monsters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void eliminateMaximum() {
        assertThat(
                new Solution().eliminateMaximum(new int[] {1, 3, 4}, new int[] {1, 1, 1}),
                equalTo(3));
    }

    @Test
    void eliminateMaximum2() {
        assertThat(
                new Solution().eliminateMaximum(new int[] {1, 1, 2, 3}, new int[] {1, 1, 1, 1}),
                equalTo(1));
    }

    @Test
    void eliminateMaximum3() {
        assertThat(
                new Solution().eliminateMaximum(new int[] {3, 2, 4}, new int[] {5, 3, 2}),
                equalTo(1));
    }
}
