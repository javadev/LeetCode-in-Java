package g0701_0800.s0726_number_of_atoms;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countOfAtoms() {
        assertThat(new Solution().countOfAtoms("H2O"), equalTo("H2O"));
    }

    @Test
    void countOfAtoms2() {
        assertThat(new Solution().countOfAtoms("Mg(OH)2"), equalTo("H2MgO2"));
    }

    @Test
    void countOfAtoms3() {
        assertThat(new Solution().countOfAtoms("K4(ON(SO3)2)2"), equalTo("K4N2O14S4"));
    }
}
