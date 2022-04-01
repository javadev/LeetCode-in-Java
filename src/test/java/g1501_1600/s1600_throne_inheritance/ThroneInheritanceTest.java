package g1501_1600.s1600_throne_inheritance;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ThroneInheritanceTest {
    @Test
    void throneInheritance() {
        // order: king
        ThroneInheritance t = new ThroneInheritance("king");
        // order: king > andy
        t.birth("king", "andy");
        // order: king > andy > bob
        t.birth("king", "bob");
        // order: king > andy > bob > catherine
        t.birth("king", "catherine");
        // order: king > andy > matthew > bob > catherine
        t.birth("andy", "matthew");
        // order: king > andy > matthew > bob > alex > catherine
        t.birth("bob", "alex");
        // order: king > andy > matthew > bob > alex > asha > catherine
        t.birth("bob", "asha");
        // return ["king", "andy", "matthew", "bob", "alex", "asha", "catherine"]
        assertThat(
                t.getInheritanceOrder(),
                equalTo(
                        Arrays.asList(
                                "king", "andy", "matthew", "bob", "alex", "asha", "catherine")));
        // order: king > andy > matthew > bob > alex > asha > catherine
        t.death("bob");
        // return ["king", "andy", "matthew", "alex", "asha", "catherine"]
        t.getInheritanceOrder();
        assertThat(
                t.getInheritanceOrder(),
                equalTo(Arrays.asList("king", "andy", "matthew", "alex", "asha", "catherine")));
    }
}
