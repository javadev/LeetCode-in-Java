package g1701_1800.s1766_tree_of_coprimes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getCoprimes() {
        assertThat(
                new Solution()
                        .getCoprimes(new int[] {2, 3, 3, 2}, new int[][] {{0, 1}, {1, 2}, {1, 3}}),
                equalTo(new int[] {-1, 0, 0, 1}));
    }

    @Test
    void getCoprimes2() {
        assertThat(
                new Solution()
                        .getCoprimes(
                                new int[] {5, 6, 10, 2, 3, 6, 15},
                                new int[][] {{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {2, 6}}),
                equalTo(new int[] {-1, 0, -1, 0, 0, 0, -1}));
    }
}
