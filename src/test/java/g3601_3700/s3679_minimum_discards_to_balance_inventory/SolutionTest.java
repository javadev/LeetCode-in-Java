package g3601_3700.s3679_minimum_discards_to_balance_inventory;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minArrivalsToDiscard() {
        assertThat(
                new Solution().minArrivalsToDiscard(new int[] {1, 2, 1, 3, 1}, 4, 2), equalTo(0));
    }

    @Test
    void minArrivalsToDiscard2() {
        assertThat(
                new Solution().minArrivalsToDiscard(new int[] {1, 2, 3, 3, 3, 4}, 3, 2),
                equalTo(1));
    }
}
