package g3301_3400.s3337_total_characters_in_string_after_transformations_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lengthAfterTransformations() {
        assertThat(
                new Solution()
                        .lengthAfterTransformations(
                                "abcyy",
                                2,
                                List.of(
                                        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                        1, 1, 1, 1, 1, 2)),
                equalTo(7));
    }

    @Test
    void lengthAfterTransformations2() {
        assertThat(
                new Solution()
                        .lengthAfterTransformations(
                                "azbk",
                                1,
                                List.of(
                                        2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                                        2, 2, 2, 2, 2, 2)),
                equalTo(8));
    }
}
