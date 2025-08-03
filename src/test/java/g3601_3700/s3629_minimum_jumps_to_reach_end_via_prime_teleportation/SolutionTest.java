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

    @Test
    void minJumps4() {
        assertThat(
                new Solution()
                        .minJumps(
                                new int[] {
                                    893, 786, 607, 137, 69, 381, 790, 233, 15, 42, 7, 764, 890, 269,
                                    84, 262, 870, 514, 514, 650, 269, 485, 760, 181, 489, 107, 585,
                                    428, 862, 563
                                }),
                equalTo(21));
    }

    @Test
    void minJumps5() {
        assertThat(new Solution().minJumps(new int[] {4}), equalTo(0));
    }
}
