package g2301_2400.s2312_selling_pieces_of_wood;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sellingWood() {
        assertThat(
                new Solution().sellingWood(3, 5, new int[][] {{1, 4, 2}, {2, 2, 7}, {2, 1, 3}}),
                equalTo(19L));
    }

    @Test
    void sellingWood2() {
        assertThat(
                new Solution().sellingWood(4, 6, new int[][] {{3, 2, 10}, {1, 4, 2}, {4, 1, 3}}),
                equalTo(32L));
    }
}
