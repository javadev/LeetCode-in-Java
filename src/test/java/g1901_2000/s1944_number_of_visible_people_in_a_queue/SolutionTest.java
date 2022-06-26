package g1901_2000.s1944_number_of_visible_people_in_a_queue;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canSeePersonsCount() {
        assertThat(
                new Solution().canSeePersonsCount(new int[] {10, 6, 8, 5, 11, 9}),
                equalTo(new int[] {3, 1, 2, 1, 1, 0}));
    }

    @Test
    void canSeePersonsCount2() {
        assertThat(
                new Solution().canSeePersonsCount(new int[] {5, 1, 2, 3, 10}),
                equalTo(new int[] {4, 1, 1, 1, 0}));
    }
}
