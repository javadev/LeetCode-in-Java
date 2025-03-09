package g3401_3500.s3479_fruits_into_baskets_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numOfUnplacedFruits() {
        assertThat(
                new Solution().numOfUnplacedFruits(new int[] {4, 2, 5}, new int[] {3, 5, 4}),
                equalTo(1));
    }

    @Test
    void numOfUnplacedFruits2() {
        assertThat(
                new Solution().numOfUnplacedFruits(new int[] {3, 6, 1}, new int[] {6, 4, 7}),
                equalTo(0));
    }

    @Test
    void numOfUnplacedFruits3() {
        assertThat(
                new Solution().numOfUnplacedFruits(new int[] {1, 2, 3}, new int[] {3, 2, 1}),
                equalTo(1));
    }

    @Test
    void numOfUnplacedFruits4() {
        assertThat(
                new Solution().numOfUnplacedFruits(new int[] {4, 5, 6}, new int[] {1, 2, 3}),
                equalTo(3));
    }

    @Test
    void numOfUnplacedFruits5() {
        assertThat(
                new Solution().numOfUnplacedFruits(new int[] {1, 5, 2, 6}, new int[] {2, 3}),
                equalTo(2));
    }
}
