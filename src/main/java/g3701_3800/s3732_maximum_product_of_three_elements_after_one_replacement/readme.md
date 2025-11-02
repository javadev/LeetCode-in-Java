3732\. Maximum Product of Three Elements After One Replacement

Medium

You are given an integer array `nums`.

You **must** replace **exactly one** element in the array with **any** integer value in the range <code>[-10<sup>5</sup>, 10<sup>5</sup>]</code> (inclusive).

After performing this single replacement, determine the **maximum possible product** of **any three** elements at **distinct indices** from the modified array.

Return an integer denoting the **maximum product** achievable.

**Example 1:**

**Input:** nums = [-5,7,0]

**Output:** 3500000

**Explanation:**

Replacing 0 with -10<sup>5</sup> gives the array <code>[-5, 7, -10<sup>5</sup>]</code>, which has a product <code>(-5) * 7 * (-10<sup>5</sup>) = 3500000</code>. The maximum product is 3500000.

**Example 2:**

**Input:** nums = [-4,-2,-1,-3]

**Output:** 1200000

**Explanation:**

Two ways to achieve the maximum product include:

*   `[-4, -2, -3]` → replace -2 with 10<sup>5</sup> → product = <code>(-4) * 10<sup>5</sup> * (-3) = 1200000</code>.
*   `[-4, -1, -3]` → replace -1 with 10<sup>5</sup> → product = <code>(-4) * 10<sup>5</sup> * (-3) = 1200000</code>.

The maximum product is 1200000.

**Example 3:**

**Input:** nums = [0,10,0]

**Output:** 0

**Explanation:**

There is no way to replace an element with another integer and not have a 0 in the array. Hence, the product of all three elements will always be 0, and the maximum product is 0.

**Constraints:**

*   <code>3 <= nums.length <= 10<sup>5</sup></code>
*   <code>-10<sup>5</sup> <= nums[i] <= 10<sup>5</sup></code>