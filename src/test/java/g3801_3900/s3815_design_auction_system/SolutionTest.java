package g3801_3900.s3815_design_auction_system;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void auctionSystem() {
        AuctionSystem auctionSystem = new AuctionSystem();
        auctionSystem.addBid(1, 7, 5);
        auctionSystem.addBid(2, 7, 6);
        assertThat(auctionSystem.getHighestBidder(7), equalTo(2));
        auctionSystem.updateBid(1, 7, 8);
        assertThat(auctionSystem.getHighestBidder(7), equalTo(1));
        auctionSystem.removeBid(2, 7);
        assertThat(auctionSystem.getHighestBidder(7), equalTo(1));
        assertThat(auctionSystem.getHighestBidder(3), equalTo(-1));
    }
}
