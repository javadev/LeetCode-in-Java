2725\. Interval Cancellation

Easy

Given a function `fn`, an array of arguments `args`, and an interval time `t`, return a cancel function `cancelFn`.

The function `fn` should be called with `args` immediately and then called again every `t` milliseconds until `cancelFn` is called at `cancelT` ms.

**Example 1:**

**Input:** fn = (x) => x * 2, args = [4], t = 20, cancelT = 110

**Output:** 

    [ 
        {"time": 0, "returned": 8}, 
        {"time": 20, "returned": 8}, 
        {"time": 40, "returned": 8}, 
        {"time": 60, "returned": 8}, 
        {"time": 80, "returned": 8}, 
        {"time": 100, "returned": 8} 
    ]

**Explanation:** 

    const cancel = cancellable(x => x * 2, [4], 20); 
    setTimeout(cancel, 110); 

Every 20ms, fn(4) is called. Until t=110ms, then it is cancelled. 

1st fn call is at 0ms. fn(4) returns 8. 

2nd fn call is at 20ms. fn(4) returns 8. 

3rd fn call is at 40ms. fn(4) returns 8. 

4th fn call is at 60ms. fn(4) returns 8. 

5th fn call is at 80ms. fn(4) returns 8. 

6th fn call is at 100ms. fn(4) returns 8. 

Cancelled at 110ms

**Example 2:**

**Input:** fn = (x1, x2) => (x1 * x2), args = [2, 5], t = 25, cancelT = 140

**Output:** 

    [ 
        {"time": 0, "returned": 10}, 
        {"time": 25, "returned": 10}, 
        {"time": 50, "returned": 10}, 
        {"time": 75, "returned": 10}, 
        {"time": 100, "returned": 10}, 
        {"time": 125, "returned": 10} 
    ]

**Explanation:** 

    const cancel = cancellable((x1, x2) => (x1 * x2), [2, 5], 25);
    setTimeout(cancel, 140); 

Every 25ms, fn(2, 5) is called. Until t=140ms, then it is cancelled. 

1st fn call is at 0ms 

2nd fn call is at 25ms 

3rd fn call is at 50ms 

4th fn call is at 75ms 

5th fn call is at 100ms 

6th fn call is at 125ms 

Cancelled at 140ms

**Example 3:**

**Input:** fn = (x1, x2, x3) => (x1 + x2 + x3), args = [5, 1, 3], t = 50, cancelT = 180

**Output:** 

    [ 
        {"time": 0, "returned": 9}, 
        {"time": 50, "returned": 9}, 
        {"time": 100, "returned": 9}, 
        {"time": 150, "returned": 9} 
    ]

**Explanation:** 

    const cancel = cancellable((x1, x2, x3) => (x1 + x2 + x3), [5, 1, 3], 50); 
    setTimeout(cancel, 180); 

Every 50ms, fn(5, 1, 3) is called. Until t=180ms, then it is cancelled. 

1st fn call is at 0ms 

2nd fn call is at 50ms 

3rd fn call is at 100ms 

4th fn call is at 150ms 

Cancelled at 180ms

**Constraints:**

*   `fn is a function`
*   `args is a valid JSON array`
*   `1 <= args.length <= 10`
*   `20 <= t <= 1000`
*   `10 <= cancelT <= 1000`