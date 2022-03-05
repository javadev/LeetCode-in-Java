package g1101_1200.s1169_invalid_transactions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void invalidTransactions() {
        assertThat(
                new Solution()
                        .invalidTransactions(
                                new String[] {"alice,20,800,mtv", "alice,50,100,beijing"}),
                equalTo(Arrays.asList("alice,20,800,mtv", "alice,50,100,beijing")));
    }

    @Test
    void invalidTransactions2() {
        assertThat(
                new Solution()
                        .invalidTransactions(
                                new String[] {"alice,20,800,mtv", "alice,50,1200,mtv"}),
                equalTo(Collections.singletonList("alice,50,1200,mtv")));
    }

    @Test
    void invalidTransactions3() {
        assertThat(
                new Solution()
                        .invalidTransactions(new String[] {"alice,20,800,mtv", "bob,50,1200,mtv"}),
                equalTo(Collections.singletonList("bob,50,1200,mtv")));
    }
}
