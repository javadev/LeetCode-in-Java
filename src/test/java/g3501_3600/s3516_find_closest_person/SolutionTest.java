package g3501_3600.s3516_find_closest_person;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findClosest() {
        assertThat(new Solution().findClosest(2, 7, 4), equalTo(1));
    }

    @Test
    void findClosest2() {
        assertThat(new Solution().findClosest(2, 5, 6), equalTo(2));
    }

    @Test
    void findClosest3() {
        assertThat(new Solution().findClosest(1, 5, 3), equalTo(0));
    }
}
