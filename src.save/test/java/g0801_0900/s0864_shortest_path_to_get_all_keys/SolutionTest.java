package g0801_0900.s0864_shortest_path_to_get_all_keys;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shortestPathAllKeys() {
        assertThat(
                new Solution().shortestPathAllKeys(new String[] {"@.a.#", "###.#", "b.A.B"}),
                equalTo(8));
    }

    @Test
    void shortestPathAllKeys2() {
        assertThat(
                new Solution().shortestPathAllKeys(new String[] {"@..aA", "..B#.", "....b"}),
                equalTo(6));
    }

    @Test
    void shortestPathAllKeys3() {
        assertThat(new Solution().shortestPathAllKeys(new String[] {"@Aa"}), equalTo(-1));
    }
}
