3815\. Design Auction System

Medium

You are asked to design an auction system that manages bids from multiple users in real time.

Each bid is associated with a `userId`, an `itemId`, and a `bidAmount`.

Implement the `AuctionSystem` class:

*   `AuctionSystem()`: Initializes the `AuctionSystem` object.
*   `void addBid(int userId, int itemId, int bidAmount)`: Adds a new bid for `itemId` by `userId` with `bidAmount`. If the same `userId` **already** has a bid on `itemId`, **replace** it with the new `bidAmount`.
*   `void updateBid(int userId, int itemId, int newAmount)`: Updates the existing bid of `userId` for `itemId` to `newAmount`. It is **guaranteed** that this bid _exists_.
*   `void removeBid(int userId, int itemId)`: Removes the bid of `userId` for `itemId`. It is **guaranteed** that this bid _exists_.
*   `int getHighestBidder(int itemId)`: Returns the `userId` of the **highest** bidder for `itemId`. If multiple users have the **same highest** `bidAmount`, return the user with the **highest** `userId`. If no bids exist for the item, return -1.

**Example 1:**

**Input:**   
["AuctionSystem", "addBid", "addBid", "getHighestBidder", "updateBid", "getHighestBidder", "removeBid", "getHighestBidder", "getHighestBidder"]   
[[], [1, 7, 5], [2, 7, 6], [7], [1, 7, 8], [7], [2, 7], [7], [3]]

**Output:**   
[null, null, null, 2, null, 1, null, 1, -1]

**Explanation**

AuctionSystem auctionSystem = new AuctionSystem(); // Initialize the Auction system   
auctionSystem.addBid(1, 7, 5); // User 1 bids 5 on item 7   
auctionSystem.addBid(2, 7, 6); // User 2 bids 6 on item 7   
auctionSystem.getHighestBidder(7); // return 2 as User 2 has the highest bid   
auctionSystem.updateBid(1, 7, 8); // User 1 updates bid to 8 on item 7   
auctionSystem.getHighestBidder(7); // return 1 as User 1 now has the highest bid   
auctionSystem.removeBid(2, 7); // Remove User 2's bid on item 7   
auctionSystem.getHighestBidder(7); // return 1 as User 1 is the current highest bidder   
auctionSystem.getHighestBidder(3); // return -1 as no bids exist for item 3

**Constraints:**

*   <code>1 <= userId, itemId <= 5 * 10<sup>4</sup></code>
*   <code>1 <= bidAmount, newAmount <= 10<sup>9</sup></code>
*   At most <code>5 * 10<sup>4</sup></code> total calls to `addBid`, `updateBid`, `removeBid`, and `getHighestBidder`.
*   The input is generated such that for `updateBid` and `removeBid`, the bid from the given `userId` for the given `itemId` will be valid.