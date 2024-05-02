package g3101_3200.s3134_find_the_median_of_the_uniqueness_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void medianOfUniquenessArray() {
        assertThat(new Solution().medianOfUniquenessArray(new int[] {1, 2, 3}), equalTo(1));
    }

    @Test
    void medianOfUniquenessArray2() {
        assertThat(new Solution().medianOfUniquenessArray(new int[] {3, 4, 3, 4, 5}), equalTo(2));
    }

    @Test
    void medianOfUniquenessArray3() {
        assertThat(new Solution().medianOfUniquenessArray(new int[] {4, 3, 5, 4}), equalTo(2));
    }
}
