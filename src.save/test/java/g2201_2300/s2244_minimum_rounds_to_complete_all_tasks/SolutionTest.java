package g2201_2300.s2244_minimum_rounds_to_complete_all_tasks;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumRounds() {
        assertThat(
                new Solution().minimumRounds(new int[] {2, 2, 3, 3, 2, 4, 4, 4, 4, 4}), equalTo(4));
    }

    @Test
    void minimumRounds2() {
        assertThat(new Solution().minimumRounds(new int[] {2, 3, 3}), equalTo(-1));
    }

    @Test
    void minimumRounds3() {
        assertThat(new Solution().minimumRounds(new int[] {2}), equalTo(-1));
    }

    @Test
    void minimumRounds4() {
        assertThat(new Solution().minimumRounds(new int[] {4, 4, 4}), equalTo(1));
    }
}
