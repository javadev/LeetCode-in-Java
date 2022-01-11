package g0601_0700.s0609_find_duplicate_file_in_system;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findDuplicate() {
        assertThat(
                new Solution()
                        .findDuplicate(
                                new String[] {
                                    "root/a 1.txt(abcd) 2.txt(efgh)",
                                    "root/c 3.txt(abcd)",
                                    "root/c/d 4.txt(efgh)",
                                    "root 4.txt(efgh)"
                                }),
                equalTo(
                        Arrays.asList(
                                Arrays.asList("root/a/2.txt", "root/c/d/4.txt", "root/4.txt"),
                                Arrays.asList("root/a/1.txt", "root/c/3.txt"))));
    }

    @Test
    void findDuplicate2() {
        assertThat(
                new Solution()
                        .findDuplicate(
                                new String[] {
                                    "root/a 1.txt(abcd) 2.txt(efgh)",
                                    "root/c 3.txt(abcd)",
                                    "root/c/d 4.txt(efgh)"
                                }),
                equalTo(
                        Arrays.asList(
                                Arrays.asList("root/a/2.txt", "root/c/d/4.txt"),
                                Arrays.asList("root/a/1.txt", "root/c/3.txt"))));
    }
}
