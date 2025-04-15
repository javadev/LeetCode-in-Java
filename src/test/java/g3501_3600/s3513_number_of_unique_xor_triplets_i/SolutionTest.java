package g3501_3600.s3513_number_of_unique_xor_triplets_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void uniqueXorTriplets() {
        assertThat(new Solution().uniqueXorTriplets(new int[] {1, 2}), equalTo(2));
    }

    @Test
    void uniqueXorTriplets2() {
        assertThat(new Solution().uniqueXorTriplets(new int[] {3, 1, 2}), equalTo(4));
    }
}
