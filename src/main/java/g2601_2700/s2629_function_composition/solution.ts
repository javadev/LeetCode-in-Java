// #Easy #2023_08_31_Time_58_ms_(95.63%)_Space_45.3_MB_(73.06%)

type F = (x: number) => number

function compose(functions: F[]): F {
    return function (x) {
        if (functions.length == 0) return x
        for (let ind = functions.length - 1; ind >= 0; ind--) {
            x = functions[ind](x)
        }
        return x
    }
}

/*
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */

export { compose }
