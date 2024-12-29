package g3401_3500.s3405_count_the_number_of_arrays_with_k_matching_adjacent_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countGoodArrays() {
        assertThat(new Solution().countGoodArrays(3, 2, 1), equalTo(4));
    }

    @Test
    void countGoodArrays2() {
        assertThat(new Solution().countGoodArrays(4, 2, 2), equalTo(6));
    }

    @Test
    void countGoodArrays3() {
        assertThat(new Solution().countGoodArrays(5, 2, 0), equalTo(2));
    }
}
