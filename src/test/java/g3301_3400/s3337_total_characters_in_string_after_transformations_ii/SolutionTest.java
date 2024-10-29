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

    @Test
    void lengthAfterTransformations3() {
        assertThat(
                new Solution()
                        .lengthAfterTransformations(
                                "sutnqlhkolxwjtrunkmaakgfyitzluklnrglpbnknbpdvxccpyupjzqldm",
                                2826,
                                List.of(
                                        9, 1, 6, 3, 2, 7, 8, 10, 8, 3, 9, 5, 10, 8, 10, 2, 2, 9, 10,
                                        1, 3, 5, 4, 4, 8, 10)),
                equalTo(557232981));
    }

    @Test
    void lengthAfterTransformations4() {
        assertThat(
                new Solution()
                        .lengthAfterTransformations(
                                "mppgvcssluzhipednraxbdfbyn",
                                3719,
                                List.of(
                                        5, 3, 8, 1, 4, 2, 2, 4, 5, 2, 8, 5, 8, 2, 6, 10, 8, 1, 4, 1,
                                        7, 4, 2, 4, 7, 5)),
                equalTo(467065288));
    }
}
