package g1701_1800.s1718_construct_the_lexicographically_largest_valid_sequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void constructDistancedSequence() {
        assertThat(
                new Solution().constructDistancedSequence(3), equalTo(new int[] {3, 1, 2, 3, 2}));
    }

    @Test
    void constructDistancedSequence2() {
        assertThat(
                new Solution().constructDistancedSequence(5),
                equalTo(new int[] {5, 3, 1, 4, 3, 5, 2, 4, 2}));
    }
}
