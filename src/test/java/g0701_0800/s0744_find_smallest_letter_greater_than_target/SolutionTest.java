package g0701_0800.s0744_find_smallest_letter_greater_than_target;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void nextGreatestLetter() {
        assertThat(
                new Solution().nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'a'), equalTo('c'));
    }

    @Test
    void nextGreatestLetter2() {
        assertThat(
                new Solution().nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'c'), equalTo('f'));
    }

    @Test
    void nextGreatestLetter3() {
        assertThat(
                new Solution().nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'd'), equalTo('f'));
    }

    @Test
    void nextGreatestLetter4() {
        assertThat(
                new Solution().nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'k'), equalTo('c'));
    }
}
