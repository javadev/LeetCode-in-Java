package g2801_2900.s2873_maximum_value_of_an_ordered_triplet_i;

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

    @Test
    void maximumTripletValue4() {
        assertThat(
                new Solution()
                        .maximumTripletValue(
                                new int[] {8, 6, 3, 13, 2, 12, 19, 5, 19, 6, 10, 11, 9}),
                equalTo(266L));
    }
}
