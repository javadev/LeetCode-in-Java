// #Medium #2023_09_01_Time_57_ms_(84.99%)_Space_43_MB_(45.71%)

type Fn = (...params: any[]) => Promise<any>

function timeLimit(fn: Fn, t: number): Fn {
    return async function (...args) {
        const timeout = new Promise<any>((_, reject) => {
            setTimeout(() => {
                reject('Time Limit Exceeded') //NOSONAR
            }, t)
        })
        return Promise.race([fn(...args), timeout])
    }
}

/*
 * const limited = timeLimit((t) => new Promise(res => setTimeout(res, t)), 100);
 * limited(150).catch(console.log) // "Time Limit Exceeded" at t=100ms
 */

export { timeLimit }
