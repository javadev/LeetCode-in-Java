package g3901_4000.s3926_count_valid_word_occurrences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countWordOccurrences() {
        assertThat(
                new Solution()
                        .countWordOccurrences(
                                new String[] {"hello wor", "ld hello"},
                                new String[] {"hello", "world", "wor"}),
                equalTo(new int[] {2, 1, 0}));
    }

    @Test
    void countWordOccurrences2() {
        assertThat(
                new Solution()
                        .countWordOccurrences(
                                new String[] {"a-b a--b ", "a-", "b"},
                                new String[] {"a-b", "a", "b"}),
                equalTo(new int[] {2, 1, 1}));
    }

    @Test
    void countWordOccurrences3() {
        assertThat(
                new Solution()
                        .countWordOccurrences(
                                new String[] {"-cat dog- mouse"},
                                new String[] {"cat", "dog", "mouse", "cat-dog"}),
                equalTo(new int[] {1, 1, 1, 0}));
    }

    @Test
    void countWordOccurrences4() {
        assertThat(
                new Solution()
                        .countWordOccurrences(
                                new String[] {" -- ", "-"}, new String[] {"a", "a-b"}),
                equalTo(new int[] {0, 0}));
    }

    @Test
    void countWordOccurrences5() {
        assertThat(
                new Solution()
                        .countWordOccurrences(
                                new String[] {"a", "-", "b a", "-b-"},
                                new String[] {"a-b", "a", "b", "a-b"}),
                equalTo(new int[] {2, 0, 0, 2}));
    }

    @Test
    void countWordOccurrences6() {
        assertThat(
                new Solution()
                        .countWordOccurrences(
                                new String[] {"a b ab a"}, new String[] {"a", "ab", "abc", "b"}),
                equalTo(new int[] {2, 1, 0, 1}));
    }
}
