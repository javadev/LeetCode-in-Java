package g2401_2500.s2478_number_of_beautiful_partitions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void beautifulPartitions() {
        assertThat(new Solution().beautifulPartitions("23542185131", 3, 3), equalTo(1));
    }

    @Test
    void beautifulPartitions2() {
        assertThat(new Solution().beautifulPartitions("23542185131", 3, 2), equalTo(3));
    }

    @Test
    void beautifulPartitions3() {
        assertThat(new Solution().beautifulPartitions("3312958", 3, 1), equalTo(1));
    }
}
