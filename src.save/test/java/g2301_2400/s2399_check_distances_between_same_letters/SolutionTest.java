package g2301_2400.s2399_check_distances_between_same_letters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkDistances() {
        assertThat(
                new Solution()
                        .checkDistances(
                                "abaccb",
                                new int[] {
                                    1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                    0, 0, 0, 0, 0
                                }),
                equalTo(true));
    }

    @Test
    void checkDistances2() {
        assertThat(
                new Solution()
                        .checkDistances(
                                "aa",
                                new int[] {
                                    1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                    0, 0, 0, 0, 0
                                }),
                equalTo(false));
    }
}
