// tslint:disable:no-magic-numbers
import { timeLimit } from 'src/main/java/g2601_2700/s2637_promise_time_limit/solution'
import { expect, test } from 'vitest'

test('timeLimit', async () => {
    let fn = async (n) => {
        await new Promise((res) => setTimeout(res, 100))
        return n * n
    }
    let inputs = [5]
    let t = 50

    const limited = timeLimit(fn, t)
    const start = Date.now()
    let result
    try {
        const res = await limited(...inputs)
        result = { resolved: res }
    } catch (err) {
        result = { rejected: err }
    }
    expect(result).toEqual({ rejected: 'Time Limit Exceeded' })
})

test('timeLimit2', async () => {
    let fn = async (n) => {
        await new Promise((res) => setTimeout(res, 100))
        return n * n
    }
    let inputs = [5]
    let t = 150

    const limited = timeLimit(fn, t)
    const start = Date.now()
    let result
    try {
        const res = await limited(...inputs)
        result = { resolved: res }
    } catch (err) {
        result = { rejected: err }
    }
    expect(result).toEqual({ resolved: 25 })
})

test('timeLimit3', async () => {
    let fn = async (a, b) => {
        await new Promise((res) => setTimeout(res, 120))
        return a + b
    }
    let inputs = [5, 10]
    let t = 150

    const limited = timeLimit(fn, t)
    const start = Date.now()
    let result
    try {
        const res = await limited(...inputs)
        result = { resolved: res }
    } catch (err) {
        result = { rejected: err }
    }
    expect(result).toEqual({ resolved: 15 })
})

test('timeLimit4', async () => {
    let fn = async () => {
        throw 'Error'
    }
    let inputs = []
    let t = 1000

    const limited = timeLimit(fn, t)
    const start = Date.now()
    let result
    try {
        const res = await limited(...inputs)
        result = { resolved: res, time: Math.floor(Date.now() - start) }
    } catch (err) {
        result = { rejected: err, time: Math.floor(Date.now() - start) }
    }
    expect(result).toEqual({ rejected: 'Error', time: 0 })
})
