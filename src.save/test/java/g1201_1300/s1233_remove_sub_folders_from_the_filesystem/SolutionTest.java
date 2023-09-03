package g1201_1300.s1233_remove_sub_folders_from_the_filesystem;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeSubfolders() {
        assertThat(
                new Solution()
                        .removeSubfolders(new String[] {"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"}),
                equalTo(Arrays.asList("/a", "/c/d", "/c/f")));
    }

    @Test
    void removeSubfolders2() {
        assertThat(
                new Solution().removeSubfolders(new String[] {"/a", "/a/b/c", "/a/b/d"}),
                equalTo(Collections.singletonList("/a")));
    }

    @Test
    void removeSubfolders3() {
        assertThat(
                new Solution().removeSubfolders(new String[] {"/a/b/c", "/a/b/ca", "/a/b/d"}),
                equalTo(Arrays.asList("/a/b/c", "/a/b/ca", "/a/b/d")));
    }
}
