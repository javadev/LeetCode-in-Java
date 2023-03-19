package g0801_0900.s0841_keys_and_rooms;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canVisitAllRooms() {
        assertThat(
                new Solution()
                        .canVisitAllRooms(
                                Arrays.asList(
                                        Collections.singletonList(1),
                                        Collections.singletonList(2),
                                        Collections.singletonList(3),
                                        Collections.emptyList())),
                equalTo(true));
    }

    @Test
    void canVisitAllRooms2() {
        assertThat(
                new Solution()
                        .canVisitAllRooms(
                                Arrays.asList(
                                        Arrays.asList(1, 3),
                                        Arrays.asList(3, 0, 1),
                                        Collections.singletonList(2),
                                        Collections.singletonList(0))),
                equalTo(false));
    }
}
