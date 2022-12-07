2363\. Merge Similar Items

Easy

You are given two 2D integer arrays, `items1` and `items2`, representing two sets of items. Each array `items` has the following properties:

*   <code>items[i] = [value<sub>i</sub>, weight<sub>i</sub>]</code> where <code>value<sub>i</sub></code> represents the **value** and <code>weight<sub>i</sub></code> represents the **weight** of the <code>i<sup>th</sup></code> item.
*   The value of each item in `items` is **unique**.

Return _a 2D integer array_ `ret` _where_ <code>ret[i] = [value<sub>i</sub>, weight<sub>i</sub>]</code>_,_ _with_ <code>weight<sub>i</sub></code> _being the **sum of weights** of all items with value_ <code>value<sub>i</sub></code>.

**Note:** `ret` should be returned in **ascending** order by value.

**Example 1:**

**Input:** items1 = [[1,1],[4,5],[3,8]], items2 = [[3,1],[1,5]]

**Output:** [[1,6],[3,9],[4,5]]

**Explanation:** 
The item with value = 1 occurs in items1 with weight = 1 and in items2 with weight = 5, total weight = 1 + 5 = 6. 

The item with value = 3 occurs in items1 with weight = 8 and in items2 with weight = 1, total weight = 8 + 1 = 9. 

The item with value = 4 occurs in items1 with weight = 5, total weight = 5. 

Therefore, we return [[1,6],[3,9],[4,5]].

**Example 2:**

**Input:** items1 = [[1,1],[3,2],[2,3]], items2 = [[2,1],[3,2],[1,3]]

**Output:** [[1,4],[2,4],[3,4]]

**Explanation:** 
The item with value = 1 occurs in items1 with weight = 1 and in items2 with weight = 3, total weight = 1 + 3 = 4. 

The item with value = 2 occurs in items1 with weight = 3 and in items2 with weight = 1, total weight = 3 + 1 = 4. 

The item with value = 3 occurs in items1 with weight = 2 and in items2 with weight = 2, total weight = 2 + 2 = 4. Therefore, we return [[1,4],[2,4],[3,4]].

**Example 3:**

**Input:** items1 = [[1,3],[2,2]], items2 = [[7,1],[2,2],[1,4]]

**Output:** [[1,7],[2,4],[7,1]]

**Explanation:** 

The item with value = 1 occurs in items1 with weight = 3 and in items2 with weight = 4, total weight = 3 + 4 = 7. 

The item with value = 2 occurs in items1 with weight = 2 and in items2 with weight = 2, total weight = 2 + 2 = 4. 

The item with value = 7 occurs in items2 with weight = 1, total weight = 1. 

Therefore, we return [[1,7],[2,4],[7,1]].

**Constraints:**

*   `1 <= items1.length, items2.length <= 1000`
*   `items1[i].length == items2[i].length == 2`
*   <code>1 <= value<sub>i</sub>, weight<sub>i</sub> <= 1000</code>
*   Each <code>value<sub>i</sub></code> in `items1` is **unique**.
*   Each <code>value<sub>i</sub></code> in `items2` is **unique**.