package g2201_2300.s2284_sender_with_largest_word_count;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestWordCount() {
        assertThat(
                new Solution()
                        .largestWordCount(
                                new String[] {
                                    "Hello userTwooo",
                                    "Hi userThree",
                                    "Wonderful day Alice",
                                    "Nice day userThree"
                                },
                                new String[] {"Alice", "userTwo", "userThree", "Alice"}),
                equalTo("Alice"));
    }

    @Test
    void largestWordCount2() {
        assertThat(
                new Solution()
                        .largestWordCount(
                                new String[] {
                                    "How is leetcode for everyone",
                                    "Leetcode is useful for practice"
                                },
                                new String[] {"Bob", "Charlie"}),
                equalTo("Charlie"));
    }
}
