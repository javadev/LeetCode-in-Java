package g2801_2900.s2874_maximum_value_of_an_ordered_triplet_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumTripletValue() {
        assertThat(new Solution().maximumTripletValue(new int[] {12, 6, 1, 2, 7}), equalTo(77L));
    }

    @Test
    void maximumTripletValue2() {
        assertThat(new Solution().maximumTripletValue(new int[] {1, 10, 3, 4, 19}), equalTo(133L));
    }

    @Test
    void maximumTripletValue3() {
        assertThat(new Solution().maximumTripletValue(new int[] {1, 2, 3}), equalTo(0L));
    }
}
