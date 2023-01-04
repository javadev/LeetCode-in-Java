package g0701_0800.s0721_accounts_merge;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void accountsMerge() {
        List<List<String>> input =
                Arrays.asList(
                        Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"),
                        Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"),
                        Arrays.asList("Mary", "mary@mail.com"),
                        Arrays.asList("John", "johnnybravo@mail.com"));
        List<List<String>> expected =
                Arrays.asList(
                        Arrays.asList("John", "johnnybravo@mail.com"),
                        Arrays.asList(
                                "John",
                                "john00@mail.com",
                                "john_newyork@mail.com",
                                "johnsmith@mail.com"),
                        Arrays.asList("Mary", "mary@mail.com"));
        assertThat(new Solution().accountsMerge(input).toString(), equalTo(expected.toString()));
    }

    @Test
    void accountsMerge2() {
        List<List<String>> input =
                Arrays.asList(
                        Arrays.asList("Gabe", "Gabe0@m.co", "Gabe3@m.co", "Gabe1@m.co"),
                        Arrays.asList("Kevin", "Kevin3@m.co", "Kevin5@m.co", "Kevin0@m.co"),
                        Arrays.asList("Ethan", "Ethan5@m.co", "Ethan4@m.co", "Ethan0@m.co"),
                        Arrays.asList("Hanzo", "Hanzo3@m.co", "Hanzo1@m.co", "Hanzo0@m.co"),
                        Arrays.asList("Fern", "Fern5@m.co", "Fern1@m.co", "Fern0@m.co"));

        List<List<String>> expected =
                Arrays.asList(
                        Arrays.asList("Hanzo", "Hanzo0@m.co", "Hanzo1@m.co", "Hanzo3@m.co"),
                        Arrays.asList("Fern", "Fern0@m.co", "Fern1@m.co", "Fern5@m.co"),
                        Arrays.asList("Gabe", "Gabe0@m.co", "Gabe1@m.co", "Gabe3@m.co"),
                        Arrays.asList("Kevin", "Kevin0@m.co", "Kevin3@m.co", "Kevin5@m.co"),
                        Arrays.asList("Ethan", "Ethan0@m.co", "Ethan4@m.co", "Ethan5@m.co"));
        assertThat(new Solution().accountsMerge(input), equalTo(expected));
    }
}
