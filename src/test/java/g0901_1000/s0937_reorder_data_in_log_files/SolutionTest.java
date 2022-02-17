package g0901_1000.s0937_reorder_data_in_log_files;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reorderLogFiles() {
        assertThat(
                new Solution()
                        .reorderLogFiles(
                                new String[] {
                                    "dig1 8 1 5 1",
                                    "let1 art can",
                                    "dig2 3 6",
                                    "let2 own kit dig",
                                    "let3 art zero"
                                }),
                equalTo(
                        new String[] {
                            "let1 art can",
                            "let3 art zero",
                            "let2 own kit dig",
                            "dig1 8 1 5 1",
                            "dig2 3 6"
                        }));
    }

    @Test
    void reorderLogFiles2() {
        assertThat(
                new Solution()
                        .reorderLogFiles(
                                new String[] {
                                    "a1 9 2 3 1",
                                    "g1 act car",
                                    "zo4 4 7",
                                    "ab1 off key dog",
                                    "a8 act zoo"
                                }),
                equalTo(
                        new String[] {
                            "g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7"
                        }));
    }
}
