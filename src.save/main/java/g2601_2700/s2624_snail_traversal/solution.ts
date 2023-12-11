// #Medium #2023_08_31_Time_175_ms_(92.96%)_Space_64.2_MB_(32.75%)

declare global {
    interface Array<T> {
        snail(rowsCount: number, colsCount: number): number[][]
    }
}

Array.prototype.snail = function (rowsCount: number, colsCount: number): number[][] { //NOSONAR
    if (rowsCount * colsCount !== this.length) return []
    let res: number[][] = []
    for (let i = 0; i < this.length; i++) {
        let col = Math.floor(i / rowsCount)
        let row = i % rowsCount
        row = col % 2 === 0 ? row : rowsCount - row - 1
        if (res[row] === undefined) res[row] = []
        res[row].push(this[i])
    }
    return res
}

/*
 * const arr = [1,2,3,4];
 * arr.snail(1,4); // [[1,2,3,4]]
 */

export {}
