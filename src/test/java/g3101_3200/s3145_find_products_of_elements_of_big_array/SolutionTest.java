package g3101_3200.s3145_find_products_of_elements_of_big_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findProductsOfElements() {
        assertThat(
                new Solution().findProductsOfElements(new long[][] {{1, 3, 7}}),
                equalTo(new int[] {4}));
    }

    @Test
    void findProductsOfElements2() {
        assertThat(
                new Solution().findProductsOfElements(new long[][] {{2, 5, 3}, {7, 7, 4}}),
                equalTo(new int[] {2, 2}));
    }
}
