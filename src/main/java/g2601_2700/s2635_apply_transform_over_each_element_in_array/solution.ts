// #Easy #2023_08_31_Time_43_ms_(98.46%)_Space_42.2_MB_(92.83%)

function map(arr: number[], fn: (n: number, i: number) => number): number[] {
    const res: number[] = []
    for (let i = 0; i < arr.length; i++) {
        res.push(fn(arr[i], i))
    }
    return res
}

export { map }
