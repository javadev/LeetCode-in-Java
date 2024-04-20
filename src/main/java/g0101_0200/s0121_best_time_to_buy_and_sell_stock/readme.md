121\. Best Time to Buy and Sell Stock

Easy

You are given an array `prices` where `prices[i]` is the price of a given stock on the `ith` day.

You want to maximize your profit by choosing a **single day** to buy one stock and choosing a **different day in the future** to sell that stock.

Return _the maximum profit you can achieve from this transaction_. If you cannot achieve any profit, return `0`.

**Example 1:**

**Input:** prices = [7,1,5,3,6,4]

**Output:** 5

**Explanation:** Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell. 

**Example 2:**

**Input:** prices = [7,6,4,3,1]

**Output:** 0

**Explanation:** In this case, no transactions are done and the max profit = 0. 

**Constraints:**

*   <code>1 <= prices.length <= 10<sup>5</sup></code>
*   <code>0 <= prices[i] <= 10<sup>4</sup></code>

To solve the "Best Time to Buy and Sell Stock" problem in Java with a `Solution` class, we'll use a greedy algorithm. Below are the steps:

1. **Create a `Solution` class**: Define a class named `Solution` to encapsulate our solution methods.

2. **Create a `maxProfit` method**: This method takes an array `prices` as input and returns the maximum profit that can be achieved by buying and selling the stock.

3. **Initialize variables**: Initialize two variables, `minPrice` to store the minimum price seen so far and `maxProfit` to store the maximum profit seen so far. Initialize `maxProfit` to 0.

4. **Iterate through the prices array**:
   - For each price in the array:
     - Update `minPrice` to the minimum of the current price and `minPrice`.
     - Update `maxProfit` to the maximum of the current profit (price - `minPrice`) and `maxProfit`.

5. **Return the maximum profit**: After iterating through the entire array, return `maxProfit`.

Here's the Java implementation:

```java
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) return 0; // Check for empty array or single element
        
        int minPrice = prices[0]; // Initialize minPrice to the first price
        int maxProfit = 0; // Initialize maxProfit to 0
        
        // Iterate through the prices array
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]); // Update minPrice
            maxProfit = Math.max(maxProfit, prices[i] - minPrice); // Update maxProfit
        }
        
        return maxProfit; // Return the maximum profit
    }
}
```

This implementation follows the steps outlined above and efficiently calculates the maximum profit that can be achieved by buying and selling the stock in Java.