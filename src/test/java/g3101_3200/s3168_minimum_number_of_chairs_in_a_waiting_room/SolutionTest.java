package g3101_3200.s3168_minimum_number_of_chairs_in_a_waiting_room;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumChairs() {
        assertThat(new Solution().minimumChairs("EEEEEEE"), equalTo(7));
    }

    @Test
    void minimumChairs2() {
        assertThat(new Solution().minimumChairs("ELELEEL"), equalTo(2));
    }

    @Test
    void minimumChairs3() {
        assertThat(new Solution().minimumChairs("ELEELEELLL"), equalTo(3));
    }
}
