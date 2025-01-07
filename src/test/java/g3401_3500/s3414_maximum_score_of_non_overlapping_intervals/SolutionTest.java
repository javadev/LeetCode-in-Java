package g3401_3500.s3414_maximum_score_of_non_overlapping_intervals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumWeight() {
        assertThat(
                new Solution()
                        .maximumWeight(
                                List.of(
                                        List.of(1, 3, 2),
                                        List.of(4, 5, 2),
                                        List.of(1, 5, 5),
                                        List.of(6, 9, 3),
                                        List.of(6, 7, 1),
                                        List.of(8, 9, 1))),
                equalTo(new int[] {2, 3}));
    }
}
