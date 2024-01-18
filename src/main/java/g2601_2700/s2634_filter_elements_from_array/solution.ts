// #Easy #2023_08_31_Time_44_ms_(98.04%)_Space_42.7_MB_(69.67%)

function filter(arr: number[], fn: (n: number, i: number) => boolean): number[] {
    const filteredArr: number[] = []

    for (let i = 0; i < arr.length; i++) {
        if (fn(arr[i], i)) filteredArr.push(arr[i])
    }

    return filteredArr
}

export { filter }
