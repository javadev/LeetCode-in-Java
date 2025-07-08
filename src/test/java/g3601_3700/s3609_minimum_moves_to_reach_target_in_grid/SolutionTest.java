package g3601_3700.s3609_minimum_moves_to_reach_target_in_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMoves() {
        assertThat(new Solution().minMoves(1, 2, 5, 4), equalTo(2));
    }

    @Test
    void minMoves2() {
        assertThat(new Solution().minMoves(0, 1, 2, 3), equalTo(3));
    }

    @Test
    void minMoves3() {
        assertThat(new Solution().minMoves(1, 1, 2, 2), equalTo(-1));
    }

    @Test
    void minMoves4() {
        assertThat(new Solution().minMoves(0, 0, 0, 0), equalTo(0));
    }

    @Test
    void minMoves5() {
        assertThat(new Solution().minMoves(0, 0, 1, 0), equalTo(-1));
        assertThat(new Solution().minMoves(0, 0, 0, 1), equalTo(-1));
    }

    @Test
    void minMoves6() {
        assertThat(new Solution().minMoves(2, 0, 1, 0), equalTo(-1));
    }

    @Test
    void minMoves7() {
        assertThat(new Solution().minMoves(0, 2, 0, 1), equalTo(-1));
    }

    @Test
    void minMoves8() {
        assertThat(new Solution().minMoves(1, 1, 9, 4), equalTo(-1));
    }

    @Test
    void minMoves9() {
        int result = new Solution().minMoves(1, 1, 8, 3);
        assertThat(result, equalTo(-1));
    }

    @Test
    void minMoves10() {
        int result = new Solution().minMoves(1, 1, 6, 4);
        assertThat(result, equalTo(-1));
    }

    @Test
    void minMoves11() {
        assertThat(new Solution().minMoves(1, 1, 4, 9), equalTo(-1));
    }

    @Test
    void minMoves12() {
        int result = new Solution().minMoves(1, 1, 3, 8);
        assertThat(result, equalTo(-1));
    }

    @Test
    void minMoves13() {
        int result = new Solution().minMoves(1, 1, 4, 6);
        assertThat(result, equalTo(-1));
    }

    @Test
    void minMoves14() {
        int result = new Solution().minMoves(0, 2, 5, 5);
        assertThat(result, equalTo(-1));
    }

    @Test
    void minMoves15() {
        int result = new Solution().minMoves(2, 0, 5, 5);
        assertThat(result, equalTo(-1));
    }

    @Test
    void minMoves16() {
        assertThat(new Solution().minMoves(2, 2, 5, 5), equalTo(-1));
    }

    @Test
    void minMoves17() {
        int result = new Solution().minMoves(1, 1, 5, 2);
        assertThat(result, equalTo(-1));
    }
}
