package g1201_1300.s1203_sort_items_by_groups_respecting_dependencies;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sortItems() {
        assertThat(
                new Solution()
                        .sortItems(
                                8,
                                2,
                                new int[] {-1, -1, 1, 0, 0, 1, 0, -1},
                                Arrays.asList(
                                        Collections.emptyList(),
                                        Collections.singletonList(6),
                                        Collections.singletonList(5),
                                        Collections.singletonList(6),
                                        Arrays.asList(3, 6),
                                        Collections.emptyList(),
                                        Collections.emptyList(),
                                        Collections.emptyList())),
                equalTo(new int[] {5, 2, 6, 3, 4, 1, 7, 0}));
    }

    @Test
    void sortItems2() {
        assertThat(
                new Solution()
                        .sortItems(
                                8,
                                2,
                                new int[] {-1, -1, 1, 0, 0, 1, 0, -1},
                                Arrays.asList(
                                        Collections.emptyList(),
                                        Collections.singletonList(6),
                                        Collections.singletonList(5),
                                        Collections.singletonList(6),
                                        Collections.singletonList(3),
                                        Collections.emptyList(),
                                        Collections.singletonList(4),
                                        Collections.emptyList())),
                equalTo(new int[] {}));
    }
}
