package g3501_3600.s3539_find_sum_of_array_product_of_magical_sequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void magicalSum() {
        assertThat(
                new Solution().magicalSum(5, 5, new int[] {1, 10, 100, 10000, 1000000}),
                equalTo(991600007));
    }

    @Test
    void magicalSum2() {
        assertThat(new Solution().magicalSum(2, 2, new int[] {5, 4, 3, 2, 1}), equalTo(170));
    }

    @Test
    void magicalSum3() {
        assertThat(new Solution().magicalSum(1, 1, new int[] {28}), equalTo(28));
    }
}
