// #Medium #2023_09_18_Time_67_ms_(84.73%)_Space_43.6_MB_(15.83%)

async function promiseAll<T>(functions: (() => Promise<T>)[]): Promise<T[]> {
    const resolved = []
    let counter = 0

    return new Promise((resolve, reject) => {
        for (let i = 0; i < functions.length; i++) {
            functions[i]()
                .then((res) => {
                    // must specify index of array
                    resolved[i] = res
                    counter++
                    if (counter === functions.length) {
                        resolve(resolved)
                    }
                })
                .catch((err) => {
                    reject(err)
                })
        }
    })
}

/*
 * const promise = promiseAll([() => new Promise(res => res(42))])
 * promise.then(console.log); // [42]
 */

export { promiseAll }
