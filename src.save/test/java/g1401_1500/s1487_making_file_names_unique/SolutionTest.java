package g1401_1500.s1487_making_file_names_unique;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getFolderNames() {
        assertThat(
                new Solution().getFolderNames(new String[] {"pes", "fifa", "gta", "pes(2019)"}),
                equalTo(new String[] {"pes", "fifa", "gta", "pes(2019)"}));
    }

    @Test
    void getFolderNames2() {
        assertThat(
                new Solution().getFolderNames(new String[] {"gta", "gta(1)", "gta", "avalon"}),
                equalTo(new String[] {"gta", "gta(1)", "gta(2)", "avalon"}));
    }

    @Test
    void getFolderNames3() {
        assertThat(
                new Solution()
                        .getFolderNames(
                                new String[] {
                                    "onepiece",
                                    "onepiece(1)",
                                    "onepiece(2)",
                                    "onepiece(3)",
                                    "onepiece"
                                }),
                equalTo(
                        new String[] {
                            "onepiece", "onepiece(1)", "onepiece(2)", "onepiece(3)", "onepiece(4)"
                        }));
    }
}
