package g1701_1800.s1737_change_minimum_characters_to_satisfy_one_of_three_conditions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCharacters() {
        assertThat(new Solution().minCharacters("aba", "caa"), equalTo(2));
    }

    @Test
    void minCharacters2() {
        assertThat(new Solution().minCharacters("dabadd", "cda"), equalTo(3));
    }
}
