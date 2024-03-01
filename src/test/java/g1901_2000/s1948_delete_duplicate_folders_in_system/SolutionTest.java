package g1901_2000.s1948_delete_duplicate_folders_in_system;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void deleteDuplicateFolder() {
        assertThat(
                new Solution()
                        .deleteDuplicateFolder(
                                Arrays.asList(
                                        Collections.singletonList("a"),
                                        Collections.singletonList("c"),
                                        Collections.singletonList("d"),
                                        Arrays.asList("a", "b"),
                                        Arrays.asList("c", "b"),
                                        Arrays.asList("d", "a"))),
                equalTo(Arrays.asList(Collections.singletonList("d"), Arrays.asList("d", "a"))));
    }

    @Test
    void deleteDuplicateFolder2() {
        assertThat(
                new Solution()
                        .deleteDuplicateFolder(
                                Arrays.asList(
                                        Collections.singletonList("a"),
                                        Collections.singletonList("c"),
                                        Arrays.asList("a", "b"),
                                        Arrays.asList("c", "b"),
                                        Arrays.asList("a", "b", "x"),
                                        Arrays.asList("a", "b", "x", "y"),
                                        Collections.singletonList("w"),
                                        Arrays.asList("w", "y"))),
                equalTo(
                        Arrays.asList(
                                Collections.singletonList("a"),
                                Arrays.asList("a", "b"),
                                Collections.singletonList("c"),
                                Arrays.asList("c", "b"))));
    }

    @Test
    void deleteDuplicateFolder3() {
        assertThat(
                new Solution()
                        .deleteDuplicateFolder(
                                Arrays.asList(
                                        Arrays.asList("a", "b"),
                                        Arrays.asList("c", "d"),
                                        Collections.singletonList("c"),
                                        Collections.singletonList("a"))),
                equalTo(
                        Arrays.asList(
                                Collections.singletonList("a"),
                                Arrays.asList("a", "b"),
                                Collections.singletonList("c"),
                                Arrays.asList("c", "d"))));
    }
}
