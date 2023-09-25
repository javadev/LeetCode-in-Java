package g1301_1400.s1348_tweet_counts_per_frequency;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class TweetCountsTest {
    @Test
    void tweetCountsTest() {
        TweetCounts tweetCounts = new TweetCounts();
        tweetCounts.recordTweet("tweet3", 0);
        tweetCounts.recordTweet("tweet3", 60);
        tweetCounts.recordTweet("tweet3", 10);
        assertThat(
                tweetCounts.getTweetCountsPerFrequency("minute", "tweet3", 0, 59),
                equalTo(Collections.singletonList(2)));
        assertThat(
                tweetCounts.getTweetCountsPerFrequency("minute", "tweet3", 0, 60),
                equalTo(Arrays.asList(2, 1)));
        tweetCounts.recordTweet("tweet3", 120);
        assertThat(
                tweetCounts.getTweetCountsPerFrequency("hour", "tweet3", 0, 210),
                equalTo(Collections.singletonList(4)));
    }
}
