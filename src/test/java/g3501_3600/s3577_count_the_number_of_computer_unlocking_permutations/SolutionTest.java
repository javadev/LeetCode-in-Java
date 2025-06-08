package g3501_3600.s3577_count_the_number_of_computer_unlocking_permutations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPermutations() {
        assertThat(new Solution().countPermutations(new int[] {1, 2, 3}), equalTo(2));
    }

    @Test
    void countPermutations2() {
        assertThat(new Solution().countPermutations(new int[] {3, 3, 3, 4, 4, 4}), equalTo(0));
    }
}
