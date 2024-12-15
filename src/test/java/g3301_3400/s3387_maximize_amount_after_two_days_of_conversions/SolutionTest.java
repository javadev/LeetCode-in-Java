package g3301_3400.s3387_maximize_amount_after_two_days_of_conversions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxAmount() {
        assertThat(
                new Solution()
                        .maxAmount(
                                "EUR",
                                List.of(List.of("EUR", "USD"), List.of("USD", "JPY")),
                                new double[] {2.0, 3.0},
                                List.of(
                                        List.of("JPY", "USD"),
                                        List.of("USD", "CHF"),
                                        List.of("CHF", "EUR")),
                                new double[] {4.0, 5.0, 6.0}),
                equalTo(720.0));
    }

    @Test
    void maxAmount2() {
        assertThat(
                new Solution()
                        .maxAmount(
                                "NGN",
                                List.of(List.of("NGN", "EUR")),
                                new double[] {9.0},
                                List.of(List.of("NGN", "EUR")),
                                new double[] {6.0}),
                equalTo(1.5));
    }

    @Test
    void maxAmount3() {
        assertThat(
                new Solution()
                        .maxAmount(
                                "USD",
                                List.of(List.of("USD", "EUR")),
                                new double[] {1.0},
                                List.of(List.of("EUR", "JPY")),
                                new double[] {10.0}),
                equalTo(1.0));
    }
}
