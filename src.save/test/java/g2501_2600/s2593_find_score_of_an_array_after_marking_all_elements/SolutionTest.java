package g2501_2600.s2593_find_score_of_an_array_after_marking_all_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findScore() {
        assertThat(new Solution().findScore(new int[] {2, 1, 3, 4, 5, 2}), equalTo(7L));
    }

    @Test
    void findScore2() {
        assertThat(new Solution().findScore(new int[] {2, 3, 5, 1, 3, 2}), equalTo(5L));
    }
}
