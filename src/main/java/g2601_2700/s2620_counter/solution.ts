// #Easy #2023_08_31_Time_43_ms_(98.60%)_Space_42.2_MB_(91.27%)

function createCounter(n: number): () => number {
    const fun = function () {
        n++
        return n - 1
    }
    return fun
}

/*
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */

export { createCounter }
