**Time Complexity (Big O Time):**

The time complexity of this program is O(n), where n is the length of the input array `nums`. Here's why:

1. The program iterates through the `nums` array once in a loop that runs from 2 to `n - 1`, where n is the length of the array. This loop computes the maximum profit that can be obtained up to each house.

2. In each iteration of the loop, the program calculates `profit[i]` based on the previous two values: `profit[i - 1]` and `profit[i - 2]`. These calculations are done in constant time for each house.

3. Therefore, the total number of operations in the loop is proportional to the length of the `nums` array, resulting in a time complexity of O(n).

**Space Complexity (Big O Space):**

The space complexity of this program is O(n), where n is the length of the input array `nums`. Here's why:

1. The program creates an integer array `profit` of the same length as `nums` to store the maximum profit at each house. Therefore, the space required for the `profit` array is O(n).

2. In addition to the `profit` array, the program uses a constant amount of space for other variables and calculations. These additional space requirements are independent of the size of the input and can be considered O(1).

3. Overall, the dominant factor in space complexity is the `profit` array, resulting in a space complexity of O(n).

In summary, the time complexity of the program is O(n) because it iterates through the input array once, and the space complexity is also O(n) due to the `profit` array used to store intermediate results.
