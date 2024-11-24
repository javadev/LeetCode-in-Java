package g3301_3400.s3361_shift_distance_between_two_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shiftDistance() {
        assertThat(
                new Solution()
                        .shiftDistance(
                                "abab",
                                "baba",
                                new int[] {
                                    100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                    0, 0, 0, 0, 0
                                },
                                new int[] {
                                    1, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                    0, 0, 0, 0, 0
                                }),
                equalTo(2L));
    }

    @Test
    void shiftDistance2() {
        assertThat(
                new Solution()
                        .shiftDistance(
                                "leet",
                                "code",
                                new int[] {
                                    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                    1, 1, 1, 1, 1
                                },
                                new int[] {
                                    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                    1, 1, 1, 1, 1
                                }),
                equalTo(31L));
    }
}
