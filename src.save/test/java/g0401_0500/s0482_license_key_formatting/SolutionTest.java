package g0401_0500.s0482_license_key_formatting;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void licenseKeyFormatting() {
        assertThat(new Solution().licenseKeyFormatting("5F3Z-2e-9-w", 4), equalTo("5F3Z-2E9W"));
    }

    @Test
    void licenseKeyFormatting2() {
        assertThat(new Solution().licenseKeyFormatting("2-5g-3-J", 2), equalTo("2-5G-3J"));
    }
}
