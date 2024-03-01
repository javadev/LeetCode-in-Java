package g2201_2300.s2234_maximum_total_beauty_of_the_gardens;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumBeauty() {
        assertThat(new Solution().maximumBeauty(new int[] {1, 3, 1, 1}, 7, 6, 12, 1), equalTo(14L));
    }

    @Test
    void maximumBeauty2() {
        assertThat(new Solution().maximumBeauty(new int[] {2, 4, 5, 3}, 10, 5, 2, 6), equalTo(30L));
    }
}
