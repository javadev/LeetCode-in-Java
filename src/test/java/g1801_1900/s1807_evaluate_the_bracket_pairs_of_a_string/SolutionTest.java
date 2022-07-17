package g1801_1900.s1807_evaluate_the_bracket_pairs_of_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void evaluate() {
        assertThat(
                new Solution()
                        .evaluate(
                                "(name)is(age)yearsold",
                                Arrays.asList(
                                        Arrays.asList("name", "bob"), Arrays.asList("age", "two"))),
                equalTo("bobistwoyearsold"));
    }

    @Test
    void evaluate2() {
        assertThat(
                new Solution()
                        .evaluate("hi(name)", Collections.singletonList(Arrays.asList("a", "b"))),
                equalTo("hi?"));
    }

    @Test
    void evaluate3() {
        assertThat(
                new Solution()
                        .evaluate(
                                "(a)(a)(a)aaa",
                                Arrays.asList(
                                        Arrays.asList("a", "yes"), Arrays.asList("age", "two"))),
                equalTo("yesyesyesaaa"));
    }
}
