package g3601_3700.s3629_minimum_jumps_to_reach_end_via_prime_teleportation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minJumps() {
        assertThat(new Solution().minJumps(new int[] {1, 2, 4, 6}), equalTo(2));
    }

    @Test
    void minJumps2() {
        assertThat(new Solution().minJumps(new int[] {2, 3, 4, 7, 9}), equalTo(2));
    }

    @Test
    void minJumps3() {
        assertThat(new Solution().minJumps(new int[] {4, 6, 5, 8}), equalTo(3));
    }
}
