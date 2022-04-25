package g1701_1800.s1797_design_authentication_manager;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class AuthenticationManagerTest {
    @Test
    void authenticationManager() {
        // Constructs the AuthenticationManager with timeToLive = 5 seconds.
        AuthenticationManager authenticationManager = new AuthenticationManager(5);
        // No token exists with tokenId "aaa" at time 1, so nothing happens.
        authenticationManager.renew("aaa", 1);
        // Generates a new token with tokenId "aaa" at time 2.
        authenticationManager.generate("aaa", 2);
        // The token with tokenId "aaa" is the only unexpired one at time 6, so return 1.
        assertThat(authenticationManager.countUnexpiredTokens(6), equalTo(1));
        // Generates a new token with tokenId "bbb" at time 7.
        authenticationManager.generate("bbb", 7);
        // The token with tokenId "aaa" expired at time 7, and 8 >= 7, so at time 8 the renew
        // request is ignored, and nothing happens.
        authenticationManager.renew("aaa", 8);
        // The token with tokenId "bbb" is unexpired at time 10, so the renew request is fulfilled
        // and now the token will expire at time 15.
        authenticationManager.renew("bbb", 10);
        // The token with tokenId "bbb" expires at time 15, and the token with tokenId "aaa" expired
        // at time 7, so currently no token is unexpired, so return 0.
        assertThat(authenticationManager.countUnexpiredTokens(15), equalTo(0));
    }
}
