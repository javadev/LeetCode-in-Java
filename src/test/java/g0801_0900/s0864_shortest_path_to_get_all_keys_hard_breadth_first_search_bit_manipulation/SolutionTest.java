package g0801_0900.s0864_shortest_path_to_get_all_keys_hard_breadth_first_search_bit_manipulation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void shortestPathAllKeys() {
        Solution solution = new Solution();
        assertThat(
                solution.shortestPathAllKeys(new String[] {"@.a.#", "###.#", "b.A.B"}), equalTo(8));
        assertThat(
                solution.shortestPathAllKeys(new String[] {"@..aA", "..B#.", "....b"}), equalTo(6));
        assertThat(solution.shortestPathAllKeys(new String[] {"@Aa"}), equalTo(-1));
    }
}
