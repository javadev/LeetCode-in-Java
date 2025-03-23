package g3401_3500.s3492_maximum_containers_on_a_ship;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxContainers() {
        assertThat(new Solution().maxContainers(2, 3, 15), equalTo(4));
    }

    @Test
    void maxContainers2() {
        assertThat(new Solution().maxContainers(3, 5, 20), equalTo(4));
    }
}
