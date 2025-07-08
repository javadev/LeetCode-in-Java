package g3601_3700.s3606_coupon_code_validator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void validateCoupons() {
        assertThat(
                new Solution()
                        .validateCoupons(
                                new String[] {"SAVE20", "", "PHARMA5", "SAVE@20"},
                                new String[] {"restaurant", "grocery", "pharmacy", "restaurant"},
                                new boolean[] {true, true, true, true}),
                equalTo(List.of("PHARMA5", "SAVE20")));
    }

    @Test
    void validateCoupons2() {
        assertThat(
                new Solution()
                        .validateCoupons(
                                new String[] {"GROCERY15", "ELECTRONICS_50", "DISCOUNT10"},
                                new String[] {"grocery", "electronics", "invalid"},
                                new boolean[] {false, true, true}),
                equalTo(List.of("ELECTRONICS_50")));
    }
}
