package g0501_0600.s0556_next_greater_element_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void nextGreaterElement() {
        assertThat(new Solution().nextGreaterElement(12), equalTo(21));
    }

    @Test
    void nextGreaterElement2() {
        assertThat(new Solution().nextGreaterElement(21), equalTo(-1));
    }

    @Test
    void nextGreaterElement3() {
        assertThat(new Solution().nextGreaterElement(1234), equalTo(1243));
    }

    @Test
    void nextGreaterElement4() {
        assertThat(new Solution().nextGreaterElement(4321), equalTo(-1));
    }

    @Test
    void nextGreaterElement5() {
        assertThat(new Solution().nextGreaterElement(115), equalTo(151));
    }

    @Test
    void nextGreaterElement6() {
        assertThat(new Solution().nextGreaterElement(111), equalTo(-1));
    }

    @Test
    void nextGreaterElement7() {
        assertThat(new Solution().nextGreaterElement(12443322), equalTo(13222344));
    }

    @Test
    void nextGreaterElement8() {
        assertThat(new Solution().nextGreaterElement(230241), equalTo(230412));
    }

    @Test
    void nextGreaterElement9() {
        assertThat(new Solution().nextGreaterElement(1999999999), equalTo(-1));
    }

    @Test
    void nextGreaterElement10() {
        assertThat(new Solution().nextGreaterElement(218765), equalTo(251678));
    }

    @Test
    void nextGreaterElement11() {
        assertThat(new Solution().nextGreaterElement(7), equalTo(-1));
    }

    @Test
    void nextGreaterElement12() {
        assertThat(new Solution().nextGreaterElement(132), equalTo(213));
    }

    @Test
    void nextGreaterElement13() {
        assertThat(new Solution().nextGreaterElement(534976), equalTo(536479));
    }

    @Test
    void nextGreaterElement14() {
        assertThat(new Solution().nextGreaterElement(1998), equalTo(8199));
    }

    @Test
    void nextGreaterElement15() {
        assertThat(new Solution().nextGreaterElement(2147483647), equalTo(-1));
    }
}
