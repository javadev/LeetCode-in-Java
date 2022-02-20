package g0901_1000.s0946_validate_stack_sequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void validateStackSequences() {
        assertThat(
                new Solution()
                        .validateStackSequences(
                                new int[] {1, 2, 3, 4, 5}, new int[] {4, 5, 3, 2, 1}),
                equalTo(true));
    }

    @Test
    void validateStackSequences2() {
        assertThat(
                new Solution()
                        .validateStackSequences(
                                new int[] {1, 2, 3, 4, 5}, new int[] {4, 3, 5, 1, 2}),
                equalTo(false));
    }
}
