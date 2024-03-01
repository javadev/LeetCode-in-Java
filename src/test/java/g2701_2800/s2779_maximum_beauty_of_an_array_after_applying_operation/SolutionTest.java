package g2701_2800.s2779_maximum_beauty_of_an_array_after_applying_operation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumBeauty() {
        assertThat(new Solution().maximumBeauty(new int[] {4, 6, 1, 2}, 2), equalTo(3));
    }

    @Test
    void maximumBeauty2() {
        assertThat(new Solution().maximumBeauty(new int[] {1, 1, 1, 1}, 10), equalTo(4));
    }
}
