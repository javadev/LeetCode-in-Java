1237\. Find Positive Integer Solution for a Given Equation

Medium

Given a callable function `f(x, y)` **with a hidden formula** and a value `z`, reverse engineer the formula and return _all positive integer pairs_ `x` _and_ `y` _where_ `f(x,y) == z`. You may return the pairs in any order.

While the exact formula is hidden, the function is monotonically increasing, i.e.:

*   `f(x, y) < f(x + 1, y)`
*   `f(x, y) < f(x, y + 1)`

The function interface is defined like this:

interface CustomFunction { public: // Returns some positive integer f(x, y) for two positive integers x and y based on a formula. int f(int x, int y); };

We will judge your solution as follows:

*   The judge has a list of `9` hidden implementations of `CustomFunction`, along with a way to generate an **answer key** of all valid pairs for a specific `z`.
*   The judge will receive two inputs: a `function_id` (to determine which implementation to test your code with), and the target `z`.
*   The judge will call your `findSolution` and compare your results with the **answer key**.
*   If your results match the **answer key**, your solution will be `