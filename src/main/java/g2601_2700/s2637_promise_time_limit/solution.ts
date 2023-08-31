// #Easy #Medium #2023_08_31_Time_53_ms_(93.41%)_Space_42.7_MB_(62.71%)

type Fn = (...params: any[]) => Promise<any>

function timeLimit(fn: Fn, t: number): Fn {
    return async function (...args: any[]): Promise<any> {
        const fns = fn(...args)
        const timeLimitPromise = new Promise((_, reject) => {
            setTimeout(() => {
                reject(new Error('Time Limit Exceeded'))
            }, t)
        })

        return Promise.race([fns, timeLimitPromise])
    }
}

/*
 * const limited = timeLimit((t) => new Promise(res => setTimeout(res, t)), 100);
 * limited(150).catch(console.log) // "Time Limit Exceeded" at t=100ms
 */

export { timeLimit }
