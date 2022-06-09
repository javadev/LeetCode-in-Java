package g2101_2200.s2171_removing_minimum_number_of_magic_beans;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumRemoval() {
        assertThat(new Solution().minimumRemoval(new int[] {4, 1, 6, 5}), equalTo(4L));
    }

    @Test
    void minimumRemoval2() {
        assertThat(new Solution().minimumRemoval(new int[] {2, 10, 3, 2}), equalTo(7L));
    }
}
