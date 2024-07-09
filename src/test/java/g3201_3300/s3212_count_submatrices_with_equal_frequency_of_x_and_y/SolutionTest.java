package g3201_3300.s3212_count_submatrices_with_equal_frequency_of_x_and_y;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfSubmatrices() {
        assertThat(
                new Solution().numberOfSubmatrices(new char[][] {{'X', 'Y', '.'}, {'Y', '.', '.'}}),
                equalTo(3));
    }

    @Test
    void numberOfSubmatrices2() {
        assertThat(
                new Solution().numberOfSubmatrices(new char[][] {{'X', 'X'}, {'X', 'Y'}}),
                equalTo(0));
    }

    @Test
    void numberOfSubmatrices3() {
        assertThat(
                new Solution().numberOfSubmatrices(new char[][] {{'.', '.'}, {'.', '.'}}),
                equalTo(0));
    }
}
