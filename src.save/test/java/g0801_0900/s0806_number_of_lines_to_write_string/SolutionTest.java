package g0801_0900.s0806_number_of_lines_to_write_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfLines() {
        assertThat(
                new Solution()
                        .numberOfLines(
                                new int[] {
                                    10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                                    10, 10, 10, 10, 10, 10, 10, 10, 10, 10
                                },
                                "abcdefghijklmnopqrstuvwxyz"),
                equalTo(new int[] {3, 60}));
    }

    @Test
    void numberOfLines2() {
        assertThat(
                new Solution()
                        .numberOfLines(
                                new int[] {
                                    4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                                    10, 10, 10, 10, 10, 10, 10, 10, 10, 10
                                },
                                "bbbcccdddaaa"),
                equalTo(new int[] {2, 4}));
    }
}
