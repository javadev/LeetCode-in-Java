// #Easy #2023_09_11_Time_49_ms_(96.15%)_Space_44.4_MB_(96.63%)

function chunk(arr: any[], size: number): any[][] {
    if (arr.length === 0) return []
    if (size >= arr.length) return [arr]
    let i: number = 0
    let res: Array<Array<number>> = []
    while (i < arr.length) {
        res.push(arr.slice(i, i + size))
        i += size
    }
    return res
}

export { chunk }
