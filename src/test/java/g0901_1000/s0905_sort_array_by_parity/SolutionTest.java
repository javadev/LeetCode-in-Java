package g0901_1000.s0905_sort_array_by_parity;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sortArrayByParity() {
        assertThat(
                compareArray(
                        new Solution().sortArrayByParity(new int[] {3, 1, 2, 4}),
                        new int[] {2, 4, 3, 1}),
                equalTo(true));
    }

    @Test
    void sortArrayByParity2() {
        assertThat(new Solution().sortArrayByParity(new int[] {0}), equalTo(new int[] {0}));
    }

    private boolean compareArray(int[] arr1, int[] arr2) {
        for (int i : arr1) {
            boolean include = false;
            for (int j : arr2) {
                if (i == j) {
                    include = true;
                    break;
                }
            }
            if (!include) {
                return false;
            }
        }
        return true;
    }
}
