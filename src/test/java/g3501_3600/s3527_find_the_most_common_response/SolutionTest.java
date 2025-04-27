package g3501_3600.s3527_find_the_most_common_response;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findCommonResponse() {
        assertThat(
                new Solution()
                        .findCommonResponse(
                                List.of(
                                        List.of("good", "ok", "good", "ok"),
                                        List.of("ok", "bad", "good", "ok", "ok"),
                                        List.of("good"),
                                        List.of("bad"))),
                equalTo("good"));
    }

    @Test
    void findCommonResponse2() {
        assertThat(
                new Solution()
                        .findCommonResponse(
                                List.of(
                                        List.of("good", "ok", "good"),
                                        List.of("ok", "bad"),
                                        List.of("bad", "notsure"),
                                        List.of("great", "good"))),
                equalTo("bad"));
    }

    @Test
    void findCommonResponse3() {
        assertThat(
                new Solution()
                        .findCommonResponse(
                                List.of(
                                        List.of("fed", "vgdb", "w", "zs", "fed"),
                                        List.of("f", "cz", "pah", "gj", "rpxr", "ugyi"),
                                        List.of("t", "oja", "c"),
                                        List.of("ni", "fed", "mcox", "a", "f", "ni", "g"),
                                        List.of("ybk", "xght", "jje"))),
                equalTo("f"));
    }
}
