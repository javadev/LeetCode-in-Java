package g1401_1500.s1452_people_whose_list_of_favorite_companies_is_not_a_subset_of_another_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void peopleIndexes() {
        List<List<String>> input =
                Arrays.asList(
                        Arrays.asList("leetcode", "google", "facebook"),
                        Arrays.asList("google", "microsoft"),
                        Arrays.asList("google", "facebook"),
                        Collections.singletonList("google"),
                        Collections.singletonList("amazon"));
        assertThat(new Solution().peopleIndexes(input), equalTo(Arrays.asList(0, 1, 4)));
    }

    @Test
    void peopleIndexes2() {
        List<List<String>> input =
                Arrays.asList(
                        Arrays.asList("leetcode", "google", "facebook"),
                        Arrays.asList("leetcode", "amazon"),
                        Arrays.asList("facebook", "google"));
        assertThat(new Solution().peopleIndexes(input), equalTo(Arrays.asList(0, 1)));
    }

    @Test
    void peopleIndexes3() {
        List<List<String>> input =
                Arrays.asList(
                        Collections.singletonList("leetcode"),
                        Collections.singletonList("google"),
                        Collections.singletonList("facebook"),
                        Collections.singletonList("amazon"));
        assertThat(new Solution().peopleIndexes(input), equalTo(Arrays.asList(0, 1, 2, 3)));
    }
}
