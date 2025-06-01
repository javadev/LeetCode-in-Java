package g3501_3600.s3568_minimum_moves_to_clean_the_classroom;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMoves() {
        assertThat(new Solution().minMoves(new String[] {"S.", "XL"}, 2), equalTo(2));
    }

    @Test
    void minMoves2() {
        assertThat(new Solution().minMoves(new String[] {"LS", "RL"}, 4), equalTo(3));
    }

    @Test
    void minMoves3() {
        assertThat(new Solution().minMoves(new String[] {"L.S", "RXL"}, 3), equalTo(-1));
    }
}
