package g1001_1100.s1002_find_common_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void commonChars() {
        assertThat(
                new Solution().commonChars(new String[] {"bella", "label", "roller"}),
                equalTo(Arrays.asList("e", "l", "l")));
    }

    @Test
    void commonChars2() {
        assertThat(
                new Solution().commonChars(new String[] {"cool", "lock", "cook"}),
                equalTo(Arrays.asList("c", "o")));
    }
}
