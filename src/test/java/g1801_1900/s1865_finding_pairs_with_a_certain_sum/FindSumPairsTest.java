package g1801_1900.s1865_finding_pairs_with_a_certain_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class FindSumPairsTest {
    @Test
    void findSumPairsTest() {
        FindSumPairs findSumPairs =
                new FindSumPairs(new int[] {1, 1, 2, 2, 2, 3}, new int[] {1, 4, 5, 2, 5, 4});
        assertThat(findSumPairs.count(7), equalTo(8));
        findSumPairs.add(3, 2);
        assertThat(findSumPairs.count(8), equalTo(2));
        assertThat(findSumPairs.count(4), equalTo(1));
        findSumPairs.add(0, 1);
        findSumPairs.add(1, 1);
        assertThat(findSumPairs.count(7), equalTo(11));
    }
}
