// #Easy #2023_08_31_Time_40_ms_(99.59%)_Space_42.3_MB_(77.98%)

async function sleep(millis: number): Promise<void> {
    await new Promise((resolve) => setTimeout(resolve, millis))
}

/*
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */

export { sleep }
