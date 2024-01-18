// #Easy #2023_08_31_Time_52_ms_(91.40%)_Space_44.2_MB_(82.03%)

type Fn = (accum: number, curr: number) => number

function reduce(nums: number[], fn: Fn, init: number): number {
    let accumulator = init
    nums.forEach((num) => {
        accumulator = fn(accumulator, num)
    })
    return accumulator
}

export { reduce }
