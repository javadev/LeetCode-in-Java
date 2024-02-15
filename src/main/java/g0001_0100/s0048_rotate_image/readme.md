48\. Rotate Image

Medium

You are given an `n x n` 2D `matrix` representing an image, rotate the image by **90** degrees (clockwise).

You have to rotate the image [**in-place**](https://en.wikipedia.org/wiki/In-place_algorithm), which means you have to modify the input 2D matrix directly. **DO NOT** allocate another 2D matrix and do the rotation.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/08/28/mat1.jpg)

**Input:** matrix = [[1,2,3],[4,5,6],[7,8,9]]

**Output:** [[7,4,1],[8,5,2],[9,6,3]] 

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/08/28/mat2.jpg)

**Input:** matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]

**Output:** [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]] 

**Example 3:**

**Input:** matrix = [[1]]

**Output:** [[1]] 

**Example 4:**

**Input:** matrix = [[1,2],[3,4]]

**Output:** [[3,1],[4,2]] 

**Constraints:**

*   `matrix.length == n`
*   `matrix[i].length == n`
*   `1 <= n <= 20`
*   `-1000 <= matrix[i][j] <= 1000`

To solve the task of rotating an `n x n` 2D matrix by 90 degrees clockwise in Java, you can follow these steps. The approach taken here modifies the matrix in-place, adhering to the problem's constraints.

### Steps to Rotate an Image by 90 Degrees Clockwise:

1. **Transpose the Matrix:** Transposing a matrix involves swapping the matrix's rows with its columns. For a square matrix, you iterate through elements and swap `matrix[i][j]` with `matrix[j][i]` where `i < j`.

2. **Reverse Each Row:** After transposing, the image is rotated 90 degrees anticlockwise. To achieve a clockwise rotation, you then reverse the elements of each row.

### Example Code:

Here's how you can implement these steps in Java:

```java
public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Swap matrix[i][j] with matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            reverseRow(matrix, i);
        }
    }
    
    private void reverseRow(int[][] matrix, int row) {
        int left = 0;
        int right = matrix.length - 1;
        
        while (left < right) {
            // Swap the elements
            int temp = matrix[row][left];
            matrix[row][left] = matrix[row][right];
            matrix[row][right] = temp;
            
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        solution.rotate(matrix);
        
        // Print the rotated matrix to verify the result
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
```

### Explanation:

- The `rotate` method first transposes the matrix by swapping elements across the diagonal.
- Then, it calls the `reverseRow` method for each row to reverse the order of elements, achieving the desired 90 degrees clockwise rotation.
- The `reverseRow` method uses two pointers (`left` and `right`) to swap elements in a row until the row is reversed.
- Finally, the main method demonstrates how to use the `rotate` method and prints the rotated matrix.

This implementation modifies the matrix in-place without using additional memory for another matrix, fulfilling the problem's in-place requirement.
