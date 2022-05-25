package g1001_1100.s1032_stream_of_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class StreamCheckerTest {
    @Test
    void streamChecker() {
        StreamChecker streamChecker = new StreamChecker(new String[] {"cd", "f", "kl"});
        assertThat(streamChecker.query('a'), equalTo(false));
        assertThat(streamChecker.query('b'), equalTo(false));
        assertThat(streamChecker.query('c'), equalTo(false));
        assertThat(streamChecker.query('d'), equalTo(true));
        assertThat(streamChecker.query('e'), equalTo(false));
        assertThat(streamChecker.query('f'), equalTo(true));
        assertThat(streamChecker.query('g'), equalTo(false));
        assertThat(streamChecker.query('h'), equalTo(false));
        assertThat(streamChecker.query('i'), equalTo(false));
        assertThat(streamChecker.query('j'), equalTo(false));
        assertThat(streamChecker.query('k'), equalTo(false));
        assertThat(streamChecker.query('l'), equalTo(true));
    }
}
