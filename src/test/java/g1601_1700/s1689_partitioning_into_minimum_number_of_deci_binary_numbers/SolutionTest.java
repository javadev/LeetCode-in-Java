package g1601_1700.s1689_partitioning_into_minimum_number_of_deci_binary_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minPartitions() {
        assertThat(new Solution().minPartitions("32"), equalTo(3));
    }

    @Test
    void minPartitions2() {
        assertThat(new Solution().minPartitions("82734"), equalTo(8));
    }

    @Test
    void minPartitions3() {
        assertThat(new Solution().minPartitions("27346209830709182346"), equalTo(9));
    }
}
