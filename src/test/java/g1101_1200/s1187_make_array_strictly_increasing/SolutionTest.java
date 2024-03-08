package g1101_1200.s1187_make_array_strictly_increasing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void makeArrayIncreasing() {
        assertThat(
                new Solution()
                        .makeArrayIncreasing(new int[] {1, 5, 3, 6, 7}, new int[] {1, 3, 2, 4}),
                equalTo(1));
    }

    @Test
    void makeArrayIncreasing2() {
        assertThat(
                new Solution().makeArrayIncreasing(new int[] {1, 5, 3, 6, 7}, new int[] {4, 3, 1}),
                equalTo(2));
    }

    @Test
    void makeArrayIncreasing3() {
        assertThat(
                new Solution()
                        .makeArrayIncreasing(new int[] {1, 5, 3, 6, 7}, new int[] {1, 6, 3, 3}),
                equalTo(-1));
    }
}
