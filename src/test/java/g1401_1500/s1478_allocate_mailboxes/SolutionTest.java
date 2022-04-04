package g1401_1500.s1478_allocate_mailboxes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDistance() {
        assertThat(new Solution().minDistance(new int[] {1, 4, 8, 10, 20}, 3), equalTo(5));
    }

    @Test
    void minDistance2() {
        assertThat(new Solution().minDistance(new int[] {2, 3, 5, 12, 18}, 2), equalTo(9));
    }
}
