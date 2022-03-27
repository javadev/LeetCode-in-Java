package g1401_1500.s1410_html_entity_parser;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void entityParser() {
        assertThat(
                new Solution().entityParser("&amp; is an HTML entity but &ambassador; is not."),
                equalTo("& is an HTML entity but &ambassador; is not."));
    }

    @Test
    void entityParser2() {
        assertThat(
                new Solution().entityParser("and I quote: &quot;...&quot;"),
                equalTo("and I quote: \"...\""));
    }

    @Test
    void entityParser3() {
        assertThat(new Solution().entityParser("&frasl;&apos;&gt;&lt;&lt"), equalTo("/'><&lt"));
    }
}
