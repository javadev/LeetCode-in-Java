package g0601_0700.s0638_shopping_offers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shoppingOffers() {
        assertThat(
                new Solution()
                        .shoppingOffers(
                                Arrays.asList(2, 5),
                                Arrays.asList(Arrays.asList(3, 0, 5), Arrays.asList(1, 2, 10)),
                                Arrays.asList(3, 2)),
                equalTo(14));
    }

    @Test
    void shoppingOffers2() {
        assertThat(
                new Solution()
                        .shoppingOffers(
                                Arrays.asList(2, 3, 4),
                                Arrays.asList(Arrays.asList(1, 1, 0, 4), Arrays.asList(2, 2, 1, 9)),
                                Arrays.asList(1, 2, 1)),
                equalTo(11));
    }
}
