2648\. Generate Fibonacci Sequence

Easy

Write a generator function that returns a generator object which yields the **fibonacci sequence**.

The **fibonacci sequence** is defined by the relation <code>X<sub>n</sub> = X<sub>n-1</sub> + X<sub>n-2</sub></code>.

The first few numbers of the series are `0, 1, 1, 2, 3, 5, 8, 13`.

**Example 1:**

**Input:** callCount = 5

**Output:** [0,1,1,2,3]

**Explanation:** 

    const gen = fibGenerator(); 
    gen.next().value; // 0 
    gen.next().value; // 1 
    gen.next().value; // 1 
    gen.next().value; // 2 
    gen.next().value; // 3

**Example 2:**

**Input:** callCount = 0

**Output:** []

**Explanation:** gen.next() is never called so nothing is outputted

**Constraints:**

*   `0 <= callCount <= 50`