package g2501_2600.s2517_maximum_tastiness_of_candy_basket;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumTastiness() {
        assertThat(new Solution().maximumTastiness(new int[] {13, 5, 1, 8, 21, 2}, 3), equalTo(8));
    }

    @Test
    void maximumTastiness2() {
        assertThat(new Solution().maximumTastiness(new int[] {1, 3, 1}, 2), equalTo(2));
    }

    @Test
    void maximumTastiness3() {
        assertThat(new Solution().maximumTastiness(new int[] {7, 7, 7, 7}, 2), equalTo(0));
    }
}
