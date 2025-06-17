package g3501_3600.s3582_generate_tag_for_video_caption;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void generateTag() {
        assertThat(
                new Solution().generateTag("Leetcode daily streak achieved"),
                equalTo("#leetcodeDailyStreakAchieved"));
    }

    @Test
    void generateTag2() {
        assertThat(new Solution().generateTag("can I Go There"), equalTo("#canIGoThere"));
    }

    @Test
    void generateTag3() {
        assertThat(
                new Solution()
                        .generateTag(
                                "hhhhhhhhhhhhhhhhhhhhh"
                                        + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"
                                        + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"),
                equalTo(
                        "#hhhhhhhhhhhhhhhhhhh"
                                + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"
                                + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));
    }
}
