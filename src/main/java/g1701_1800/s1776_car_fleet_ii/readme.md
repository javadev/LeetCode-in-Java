1776\. Car Fleet II

Hard

There are `n` cars traveling at different speeds in the same direction along a one-lane road. You are given an array `cars` of length `n`, where <code>cars[i] = [position<sub>i</sub>, speed<sub>i</sub>]</code> represents:

*   <code>position<sub>i</sub></code> is the distance between the <code>i<sup>th</sup></code> car and the beginning of the road in meters. It is guaranteed that <code>position<sub>i</sub> < position<sub>i+1</sub></code>.
*   <code>speed<sub>i</sub></code> is the initial speed of the <code>i<sup>th</sup></code> car in meters per second.

For simplicity, cars can be considered as points moving along the number line. Two cars collide when they occupy the same position. Once a car collides with another car, they unite and form a single car fleet. The cars in the formed fleet will have the same position and the same speed, which is the initial speed of the **slowest** car in the fleet.

Return an array `answer`, where `answer[i]` is the time, in seconds, at which the <code>i<sup>th</sup></code> car collides with the next car, or `-1` if the car does not collide with the next car. Answers within <code>10<sup>-5</sup></code> of the actual answers are accepted.

**Example 1:**

**Input:** cars = [[1,2],[2,1],[4,3],[7,2]]

**Output:** [1.00000,-1.00000,3.00000,-1.00000]

**Explanation:** After exactly one second, the first car will collide with the second car, and form a car fleet with speed 1 m/s. After exactly 3 seconds, the third car will collide with the fourth car, and form a car fleet with speed 2 m/s.

**Example 2:**

**Input:** cars = [[3,4],[5,4],[6,3],[9,1]]

**Output:** [2.00000,1.00000,1.50000,-1.00000]

**Constraints:**

*   <code>1 <= cars.length <= 10<sup>5</sup></code>
*   <code>1 <= position<sub>i</sub>, speed<sub>i</sub> <= 10<sup>6</sup></code>
*   <code>position<sub>i</sub> < position<sub>i+1</sub></code>