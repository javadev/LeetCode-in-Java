package g3801_3900.s3838_weighted_word_mapping;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mapWordWeights() {
        assertThat(
                new Solution()
                        .mapWordWeights(
                                new String[] {"abcd", "def", "xyz"},
                                new int[] {
                                    5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9,
                                    9, 8, 3, 7, 7, 2
                                }),
                equalTo("rij"));
    }

    @Test
    void mapWordWeights2() {
        assertThat(
                new Solution()
                        .mapWordWeights(
                                new String[] {"a", "b", "c"},
                                new int[] {
                                    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                    1, 1, 1, 1, 1
                                }),
                equalTo("yyy"));
    }

    @Test
    void mapWordWeights3() {
        assertThat(
                new Solution()
                        .mapWordWeights(
                                new String[] {"abcd"},
                                new int[] {
                                    7, 5, 3, 4, 3, 5, 4, 9, 4, 2, 2, 7, 10, 2, 5, 10, 6, 1, 2, 2, 4,
                                    1, 3, 4, 4, 5
                                }),
                equalTo("g"));
    }
}
