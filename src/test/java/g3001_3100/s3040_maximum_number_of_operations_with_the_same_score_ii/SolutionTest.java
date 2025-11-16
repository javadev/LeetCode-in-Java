package g3001_3100.s3040_maximum_number_of_operations_with_the_same_score_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxOperations() {
        assertThat(new Solution().maxOperations(new int[] {3, 2, 1, 2, 3, 4}), equalTo(3));
    }

    @Test
    void maxOperations2() {
        assertThat(new Solution().maxOperations(new int[] {3, 2, 6, 1, 4}), equalTo(2));
    }

    @Test
    void maxOperations3() {
        assertThat(new Solution().maxOperations(new int[] {1, 2}), equalTo(1));
    }

    @Test
    void maxOperations4() {
        assertThat(new Solution().maxOperations(new int[] {1, 1, 1}), equalTo(1));
    }

    @Test
    void maxOperations5() {
        assertThat(new Solution().maxOperations(new int[] {2, 2, 2, 2, 2, 2}), equalTo(3));
    }

    @Test
    void maxOperations6() {
        assertThat(new Solution().maxOperations(new int[] {1, 2, 3, 4, 5, 6}), equalTo(3));
    }

    @Test
    void maxOperations7() {
        assertThat(new Solution().maxOperations(new int[] {6, 5, 4, 3, 2, 1}), equalTo(3));
    }

    @Test
    void maxOperations8() {
        assertThat(new Solution().maxOperations(new int[] {1, 3, 2, 4, 1, 3}), equalTo(2));
    }

    @Test
    void maxOperations9() {
        assertThat(new Solution().maxOperations(new int[] {1, 2, 4, 5}), equalTo(2));
    }

    @Test
    void maxOperations10() {
        assertThat(new Solution().maxOperations(new int[] {5, 5}), equalTo(1));
    }
}
