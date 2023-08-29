package g0301_0400.s0386_lexicographical_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lexicalOrder() {
        assertThat(
                new Solution().lexicalOrder(13),
                equalTo(new ArrayList<>(Arrays.asList(1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9))));
    }

    @Test
    void lexicalOrder2() {
        assertThat(new Solution().lexicalOrder(2), equalTo(new ArrayList<>(Arrays.asList(1, 2))));
    }
}
