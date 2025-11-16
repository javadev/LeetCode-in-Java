package g0901_1000.s0925_long_pressed_name;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isLongPressedName() {
        assertThat(new Solution().isLongPressedName("alex", "aaleex"), equalTo(true));
    }

    @Test
    void isLongPressedName2() {
        assertThat(new Solution().isLongPressedName("saeed", "ssaaedd"), equalTo(false));
    }

    @Test
    void isLongPressedName3() {
        assertThat(new Solution().isLongPressedName("alex", "ale"), equalTo(false));
    }

    @Test
    void isLongPressedName4() {
        assertThat(new Solution().isLongPressedName("alex", "alex"), equalTo(true));
    }

    @Test
    void isLongPressedName5() {
        assertThat(new Solution().isLongPressedName("alex", "alexxxxx"), equalTo(true));
    }

    @Test
    void isLongPressedName6() {
        assertThat(new Solution().isLongPressedName("alex", "alexy"), equalTo(false));
    }

    @Test
    void isLongPressedName7() {
        assertThat(new Solution().isLongPressedName("aabb", "aaabbb"), equalTo(true));
    }

    @Test
    void isLongPressedName8() {
        assertThat(new Solution().isLongPressedName("alex", "paalex"), equalTo(false));
    }

    @Test
    void isLongPressedName9() {
        assertThat(new Solution().isLongPressedName("alex", "allez"), equalTo(false));
    }

    @Test
    void isLongPressedName10() {
        assertThat(new Solution().isLongPressedName("a", "aaaaaa"), equalTo(true));
    }

    @Test
    void isLongPressedName11() {
        assertThat(new Solution().isLongPressedName("a", "b"), equalTo(false));
    }

    @Test
    void isLongPressedName12() {
        assertThat(new Solution().isLongPressedName("le", "leeex"), equalTo(false));
    }

    @Test
    void isLongPressedName13() {
        assertThat(new Solution().isLongPressedName("n", "nnnnn"), equalTo(true));
    }

    @Test
    void isLongPressedName14() {
        assertThat(new Solution().isLongPressedName("vtkgn", "vttkgnn"), equalTo(true));
    }

    @Test
    void isLongPressedName15() {
        assertThat(new Solution().isLongPressedName("ab", "aabb"), equalTo(true));
    }

    @Test
    void isLongPressedName16() {
        assertThat(new Solution().isLongPressedName("ab", "aa"), equalTo(false));
    }

    @Test
    void isLongPressedName17() {
        assertThat(new Solution().isLongPressedName("abc", "aab"), equalTo(false));
    }
}
