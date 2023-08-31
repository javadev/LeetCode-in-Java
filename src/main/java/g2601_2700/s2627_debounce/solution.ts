// #Medium #2023_08_31_Time_50_ms_(98.23%)_Space_42.5_MB_(83.54%)

type F = (...p: any[]) => any

function debounce(fn: F, t: number): F {
    let ref = null
    return function (...args) {
        if (ref !== null) {
            clearTimeout(ref)
        }
        ref = setTimeout(() => fn(...args), t)
    }
}

/*
 * const log = debounce(console.log, 100);
 * log('Hello'); // cancelled
 * log('Hello'); // cancelled
 * log('Hello'); // Logged at t=100ms
 */

export { debounce }
