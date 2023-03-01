package g1601_1700.s1687_delivering_boxes_from_storage_to_ports;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void boxDelivering() {
        assertThat(
                new Solution().boxDelivering(new int[][] {{1, 1}, {2, 1}, {1, 1}}, 2, 3, 3),
                equalTo(4));
    }

    @Test
    void boxDelivering2() {
        assertThat(
                new Solution()
                        .boxDelivering(
                                new int[][] {{1, 2}, {3, 3}, {3, 1}, {3, 1}, {2, 4}}, 3, 3, 6),
                equalTo(6));
    }

    @Test
    void boxDelivering3() {
        assertThat(
                new Solution()
                        .boxDelivering(
                                new int[][] {{1, 4}, {1, 2}, {2, 1}, {2, 1}, {3, 2}, {3, 4}},
                                3,
                                6,
                                7),
                equalTo(6));
    }
}
