package g3301_3400.s3335_total_characters_in_string_after_transformations_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lengthAfterTransformations() {
        assertThat(new Solution().lengthAfterTransformations("abcyy", 2), equalTo(7));
    }

    @Test
    void lengthAfterTransformations2() {
        assertThat(new Solution().lengthAfterTransformations("azbk", 1), equalTo(5));
    }
}
