// #Easy #2023_09_18_Time_53_ms_(95.40%)_Space_43.2_MB_(24.42%)

async function addTwoPromises(promise1: Promise<number>, promise2: Promise<number>): Promise<number> {
    return (await promise1) + (await promise2)
}

/*
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */

export { addTwoPromises }
