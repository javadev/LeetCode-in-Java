package g1201_1300.s1239_maximum_length_of_a_concatenated_string_with_unique_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxLength() {
        assertThat(new Solution().maxLength(Arrays.asList("un", "iq", "ue")), equalTo(4));
    }

    @Test
    void maxLength2() {
        assertThat(new Solution().maxLength(Arrays.asList("cha", "r", "act", "ers")), equalTo(6));
    }

    @Test
    void maxLength3() {
        assertThat(
                new Solution().maxLength(Collections.singletonList("abcdefghijklmnopqrstuvwxyz")),
                equalTo(26));
    }
}
