package g2501_2600.s2586_count_the_number_of_vowel_strings_in_range;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void vowelStrings() {
        assertThat(new Solution().vowelStrings(new String[] {"are", "amy", "u"}, 0, 2), equalTo(2));
    }

    @Test
    void vowelStrings2() {
        assertThat(
                new Solution()
                        .vowelStrings(new String[] {"hey", "aeo", "mu", "ooo", "artro"}, 1, 4),
                equalTo(3));
    }
}
