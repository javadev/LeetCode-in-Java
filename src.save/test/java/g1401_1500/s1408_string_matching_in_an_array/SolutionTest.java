package g1401_1500.s1408_string_matching_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void stringMatching() {
        assertThat(
                new Solution().stringMatching(new String[] {"mass", "as", "hero", "superhero"}),
                equalTo(Arrays.asList("as", "hero")));
    }

    @Test
    void stringMatching2() {
        assertThat(
                new Solution().stringMatching(new String[] {"leetcode", "et", "code"}),
                equalTo(Arrays.asList("code", "et")));
    }

    @Test
    void stringMatching3() {
        assertThat(
                new Solution().stringMatching(new String[] {"blue", "green", "bu"}),
                equalTo(Collections.emptyList()));
    }
}
