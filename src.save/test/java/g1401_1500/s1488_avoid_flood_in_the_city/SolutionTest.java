package g1401_1500.s1488_avoid_flood_in_the_city;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void avoidFlood() {
        assertThat(
                new Solution().avoidFlood(new int[] {1, 2, 3, 4}),
                equalTo(new int[] {-1, -1, -1, -1}));
    }

    @Test
    void avoidFlood2() {
        assertThat(
                new Solution().avoidFlood(new int[] {1, 2, 0, 0, 2, 1}),
                equalTo(new int[] {-1, -1, 2, 1, -1, -1}));
    }

    @Test
    void avoidFlood3() {
        assertThat(new Solution().avoidFlood(new int[] {1, 2, 0, 1, 2}), equalTo(new int[] {}));
    }
}
