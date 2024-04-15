// #Medium #2023_09_06_Time_138_ms_(86.92%)_Space_74.9_MB_(73.36%)

type MultidimensionalArray = (MultidimensionalArray | number)[]

function* inorderTraversal(arr: MultidimensionalArray): Generator<number, void, unknown> {
    for (const item of arr)
        if (Array.isArray(item)) yield* inorderTraversal(item)
        else yield item
}

/*
 * const gen = inorderTraversal([1, [2, 3]]);
 * gen.next().value; // 1
 * gen.next().value; // 2
 * gen.next().value; // 3
 */

export { inorderTraversal }
