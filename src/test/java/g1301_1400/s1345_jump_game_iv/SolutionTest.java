package g1301_1400.s1345_jump_game_iv;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minJumps() {
        assertThat(
                new Solution().minJumps(new int[] {100, -23, -23, 404, 100, 23, 23, 23, 3, 404}),
                equalTo(3));
    }

    @Test
    void minJumps2() {
        assertThat(new Solution().minJumps(new int[] {7}), equalTo(0));
    }

    @Test
    void minJumps3() {
        assertThat(new Solution().minJumps(new int[] {7, 6, 9, 6, 9, 6, 9, 7}), equalTo(1));
    }
}
