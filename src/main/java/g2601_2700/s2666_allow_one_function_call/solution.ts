// #Easy #2023_09_09_Time_50_ms_(88.35%)_Space_43.1_MB_(19.45%)

type Fn = (...args: any[]) => any

function once(fn: Fn): Fn {
    let wasCalled = false
    return function (...args) {
        if (!wasCalled) {
            wasCalled = true
            return fn(...args)
        }
    }
}

export { once }
