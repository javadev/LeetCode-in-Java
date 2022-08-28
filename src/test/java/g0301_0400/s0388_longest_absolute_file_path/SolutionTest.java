package g0301_0400.s0388_longest_absolute_file_path;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lengthLongestPath() {
        String input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        assertThat(new Solution().lengthLongestPath(input), equalTo(20));
    }

    @Test
    void lengthLongestPath2() {
        String intput =
                "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        assertThat(new Solution().lengthLongestPath(intput), equalTo(32));
    }

    @Test
    void lengthLongestPath3() {
        String intput = "a";
        assertThat(new Solution().lengthLongestPath(intput), equalTo(0));
    }

    @Test
    void lengthLongestPath4() {
        String intput = "file1.txt\nfile2.txt\nlongfile.txt";
        assertThat(new Solution().lengthLongestPath(intput), equalTo(12));
    }
}
