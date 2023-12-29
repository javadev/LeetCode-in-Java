package g2901_3000.s2923_find_champion_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findChampion() {
        assertThat(
                new Solution()
                        .findChampion(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1],[0,0]")),
                equalTo(0));
    }

    @Test
    void findChampion2() {
        assertThat(
                new Solution()
                        .findChampion(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,0,1],[1,0,1],[0,0,0]")),
                equalTo(1));
    }

    @Test
    void findChampion3() {
        assertThat(
                new Solution()
                        .findChampion(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,0,0],[1,0,0],[1,1,0]")),
                equalTo(2));
    }
}
