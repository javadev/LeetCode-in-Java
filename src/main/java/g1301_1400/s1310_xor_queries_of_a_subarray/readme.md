1310\. XOR Queries of a Subarray

Medium

You are given an array `arr` of positive integers. You are also given the array `queries` where <code>queries[i] = [left<sub>i,</sub> right<sub>i</sub>]</code>.

For each query `i` compute the **XOR** of elements from <code>left<sub>i</sub></code> to <code>right<sub>i</sub></code> (that is, <code>arr[left<sub>i</sub>] XOR arr[left<sub>i</sub> + 1] XOR ... XOR arr[right<sub>i</sub>]</code> ).

Return an array `answer` where `answer[i]` is the answer to the <code>i<sup>th</sup></code> query.

**Example 1:**

**Input:** arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]

**Output:** [2,7,14,8]

**Explanation:** 

The binary representation of the elements in the array are: 

1 = 0001 

3 = 0011 

4 = 0100 

8 = 1000 

The XOR values for queries are: 

[0,1] = 1 xor 3 = 2 

[1,2] = 3 xor 4 = 7 

[0,3] = 1 xor 3 xor 4 xor 8 = 14 

[3,3] = 8

**Example 2:**

**Input:** arr = [4,8,2,10], queries = [[2,3],[1,3],[0,0],[0,3]]

**Output:** [8,0,4,4]

**Constraints:**

*   <code>1 <= arr.length, queries.length <= 3 * 10<sup>4</sup></code>
*   <code>1 <= arr[i] <= 10<sup>9</sup></code>
*   `queries[i].length == 2`
*   <code>0 <= left<sub>i</sub> <= right<sub>i</sub> < arr.length</code>