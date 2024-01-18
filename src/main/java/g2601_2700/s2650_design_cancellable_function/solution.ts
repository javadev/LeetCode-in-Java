// #Hard #2023_09_06_Time_58_ms_(93.15%)_Space_43.5_MB_(17.81%)

function cancellable<T>(generator: Generator<Promise<any>, T, unknown>): [() => void, Promise<T>] {
    let isCancelled = false

    function cancel() {
        isCancelled = true
    }

    const promise = new Promise<T>(async (resolve, reject) => { //NOSONAR
        try {
            let lastYielded = generator.next()
            while (!lastYielded.done) {
                try {
                    const res = await lastYielded.value
                    lastYielded = isCancelled ? generator.throw('Cancelled') : generator.next(res)
                } catch (err) {
                    lastYielded = generator.throw(err)
                }
            }
            resolve(lastYielded.value)
        } catch (err) {
            reject(err)
        }
    })

    return [cancel, promise]
}

/*
 * function* tasks() {
 *   const val = yield new Promise(resolve => resolve(2 + 2));
 *   yield new Promise(resolve => setTimeout(resolve, 100));
 *   return val + 1;
 * }
 * const [cancel, promise] = cancellable(tasks());
 * setTimeout(cancel, 50);
 * promise.catch(console.log); // logs "Cancelled" at t=50ms
 */

export { cancellable }
