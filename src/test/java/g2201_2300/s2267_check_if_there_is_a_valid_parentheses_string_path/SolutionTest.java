package g2201_2300.s2267_check_if_there_is_a_valid_parentheses_string_path;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void hasValidPath() {
        assertThat(
                new Solution()
                        .hasValidPath(
                                new char[][] {
                                    {'(', '(', '('},
                                    {')', '(', ')'},
                                    {'(', '(', ')'},
                                    {'(', '(', ')'}
                                }),
                equalTo(true));
    }

    @Test
    void hasValidPath2() {
        assertThat(
                new Solution().hasValidPath(new char[][] {{')', ')'}, {'(', '('}}), equalTo(false));
    }
}
