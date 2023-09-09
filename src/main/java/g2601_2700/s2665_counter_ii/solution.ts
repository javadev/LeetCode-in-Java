// #Easy #2023_09_09_Time_54_ms_(94.09%)_Space_45.6_MB_(18.33%)

type ReturnObj = {
    increment: () => number
    decrement: () => number
    reset: () => number
}

function createCounter(init: number): ReturnObj {
    let n = init
    return {
        increment: () => {
            n = n + 1
            return n
        },
        decrement: () => {
            n = n - 1
            return n
        },
        reset: () => {
            n = init
            return n
        },
    }
}

/*
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */

export { createCounter }
