package g2101_2200.s2115_find_all_possible_recipes_from_given_supplies;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findAllRecipes() {
        assertThat(
                new Solution()
                        .findAllRecipes(
                                new String[] {"bread"},
                                Collections.singletonList(Arrays.asList("yeast", "flour")),
                                new String[] {"yeast", "flour", "corn"}),
                equalTo(Collections.singletonList("bread")));
    }

    @Test
    void findAllRecipes2() {
        assertThat(
                new Solution()
                        .findAllRecipes(
                                new String[] {"bread", "sandwich"},
                                Arrays.asList(
                                        Arrays.asList("yeast", "flour"),
                                        Arrays.asList("bread", "meat")),
                                new String[] {"yeast", "flour", "meat"}),
                equalTo(Arrays.asList("bread", "sandwich")));
    }

    @Test
    void findAllRecipes3() {
        assertThat(
                new Solution()
                        .findAllRecipes(
                                new String[] {"bread", "sandwich", "burger"},
                                Arrays.asList(
                                        Arrays.asList("yeast", "flour"),
                                        Arrays.asList("bread", "meat"),
                                        Arrays.asList("sandwich", "meat", "bread")),
                                new String[] {"yeast", "flour", "meat"}),
                equalTo(Arrays.asList("bread", "sandwich", "burger")));
    }
}
