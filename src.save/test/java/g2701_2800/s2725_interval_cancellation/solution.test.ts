import { cancellable } from 'src/main/java/g2701_2800/s2725_interval_cancellation/solution'
import { expect, test } from 'vitest'

test('cancellable', () => {
    const result = []
    const expected = [
        { time: 0, returned: 8 },
        { time: 35, returned: 8 },
        { time: 70, returned: 8 },
        { time: 105, returned: 8 },
        { time: 140, returned: 8 },
        { time: 175, returned: 8 },
    ]
    const fn = (x) => x * 2
    const args = [4]
    const t = 35
    const cancelT = 190

    const start = Date.now()

    const log = (...argsArr) => {
        const diff = Math.floor(Date.now() - start)
        result.push({ time: diff, returned: fn(...argsArr) })
    }

    const cancel = cancellable(log, args, t)
    setTimeout(cancel, cancelT)

    setTimeout(() => {
        expect(result).toEqual(expected)
    }, cancelT + t + 15)
})

test('cancellable2', () => {
    const result = []
    const expected = [
        { time: 0, returned: 10 },
        { time: 30, returned: 10 },
        { time: 60, returned: 10 },
        { time: 90, returned: 10 },
        { time: 120, returned: 10 },
        { time: 150, returned: 10 },
    ]
    const fn = (x1, x2) => x1 * x2
    const args = [2, 5]
    const t = 30
    const cancelT = 165

    const start = Date.now()

    const log = (...argsArr) => {
        const diff = Math.floor(Date.now() - start)
        result.push({ time: diff, returned: fn(...argsArr) })
    }

    const cancel = cancellable(log, args, t)
    setTimeout(cancel, cancelT)

    setTimeout(() => {
        expect(result).toEqual(expected)
    }, cancelT + t + 15)
})

test('cancellable3', () => {
    const result = []
    const expected = [
        { time: 0, returned: 9 },
        { time: 50, returned: 9 },
        { time: 100, returned: 9 },
        { time: 150, returned: 9 },
    ]
    const fn = (x1, x2, x3) => x1 + x2 + x3
    const args = [5, 1, 3]
    const t = 50
    const cancelT = 180

    const start = Date.now()

    const log = (...argsArr) => {
        const diff = Math.floor(Date.now() - start)
        result.push({ time: diff, returned: fn(...argsArr) })
    }

    const cancel = cancellable(log, args, t)
    setTimeout(cancel, cancelT)

    setTimeout(() => {
        expect(result).toEqual(expected)
    }, cancelT + t + 15)
})
