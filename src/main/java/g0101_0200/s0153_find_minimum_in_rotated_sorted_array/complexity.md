**Time Complexity (Big O Time):**

The time complexity of this program is O(log N), where N is the number of elements in the `nums` array. The reason for this is that the program performs a binary search to find the minimum element in the rotated sorted array.

In each recursive call to `findMinUtil`, the program divides the search range in half by calculating the midpoint (`mid`) and then recursively searches either the left half or the right half based on certain conditions. This binary search process reduces the search range by half in each step. Therefore, the time complexity is logarithmic, specifically O(log N).

**Space Complexity (Big O Space):**

The space complexity of this program is O(log N) as well. This is because the program uses the call stack to keep track of recursive function calls. In the worst case, when the array is divided in half in each recursive call, the maximum depth of the call stack will be logarithmic in terms of the number of elements in the `nums` array.

So, both the time and space complexity of this program are O(log N), where N is the number of elements in the `nums` array.
