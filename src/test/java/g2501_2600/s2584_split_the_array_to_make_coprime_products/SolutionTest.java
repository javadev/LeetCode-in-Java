package g2501_2600.s2584_split_the_array_to_make_coprime_products;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findValidSplit() {
        assertThat(new Solution().findValidSplit(new int[] {4, 7, 8, 15, 3, 5}), equalTo(2));
    }

    @Test
    void findValidSplit2() {
        assertThat(new Solution().findValidSplit(new int[] {4, 7, 15, 8, 3, 5}), equalTo(-1));
    }
}
