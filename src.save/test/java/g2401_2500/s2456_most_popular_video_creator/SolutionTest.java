package g2401_2500.s2456_most_popular_video_creator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mostPopularCreator() {
        assertThat(
                new Solution()
                        .mostPopularCreator(
                                new String[] {"alice", "bob", "alice", "chris"},
                                new String[] {"one", "two", "three", "four"},
                                new int[] {5, 10, 5, 4}),
                equalTo(Arrays.asList(Arrays.asList("bob", "two"), Arrays.asList("alice", "one"))));
    }

    @Test
    void mostPopularCreator2() {
        assertThat(
                new Solution()
                        .mostPopularCreator(
                                new String[] {"alice", "alice", "alice"},
                                new String[] {"a", "b", "c"},
                                new int[] {1, 2, 2}),
                equalTo(Collections.singletonList(Arrays.asList("alice", "b"))));
    }
}
