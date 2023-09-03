package g2401_2500.s2418_sort_the_people;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sortPeople() {
        assertThat(
                new Solution()
                        .sortPeople(
                                new String[] {"Mary", "John", "Emma"}, new int[] {180, 165, 170}),
                equalTo(new String[] {"Mary", "Emma", "John"}));
    }

    @Test
    void sortPeople2() {
        assertThat(
                new Solution()
                        .sortPeople(
                                new String[] {"Alice", "Bob", "Bob"}, new int[] {155, 185, 150}),
                equalTo(new String[] {"Bob", "Alice", "Bob"}));
    }
}
