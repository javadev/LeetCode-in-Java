package g0901_1000.s0920_number_of_music_playlists;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numMusicPlaylists() {
        assertThat(new Solution().numMusicPlaylists(3, 3, 1), equalTo(6));
    }

    @Test
    void numMusicPlaylists2() {
        assertThat(new Solution().numMusicPlaylists(2, 3, 0), equalTo(6));
    }

    @Test
    void numMusicPlaylists3() {
        assertThat(new Solution().numMusicPlaylists(2, 3, 1), equalTo(2));
    }
}
