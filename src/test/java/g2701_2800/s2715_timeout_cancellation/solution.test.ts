// tslint:disable:no-magic-numbers
import { cancellable } from 'src/main/java/g2701_2800/s2715_timeout_cancellation/solution'
import { expect, test } from 'vitest'

test('cancellable', () => {
    const result = []
    const fn = (x) => x * 5
    const t = 20
    const cancelT = 50
    const start = Date.now()
    const log = (...argsArr) => {
        const diff = Math.floor(Date.now() - start)
        result.push({ time: diff, returned: fn(...argsArr) })
    }
    const cancel = cancellable(log, [2], 20)
    const maxT = Math.max(t, 50)
    setTimeout(cancel, cancelT)
    setTimeout(() => {
        expect(result).toEqual([{ time: 20, returned: 10 }])
    }, 65)
})

test('cancellable2', () => {
    const result = []
    const fn = (x) => x ** 2
    const t = 100
    const cancelT = 50
    const start = Date.now()
    const log = (...argsArr) => {
        const diff = Math.floor(Date.now() - start)
        result.push({ time: diff, returned: fn(...argsArr) })
    }
    const cancel = cancellable(log, [2], 20)
    const maxT = Math.max(t, 50)
    setTimeout(cancel, cancelT)
    setTimeout(() => {
        expect(result).toEqual([])
    }, 65)
})

test('cancellable3', () => {
    const result = []
    const fn = (x1, x2) => x1 * x2
    const t = 30
    const cancelT = 100
    const start = Date.now()
    const log = (...argsArr) => {
        const diff = Math.floor(Date.now() - start)
        result.push({ time: diff, returned: fn(...argsArr) })
    }
    const cancel = cancellable(log, [2, 4], 20)
    const maxT = Math.max(t, 50)
    setTimeout(cancel, cancelT)
    setTimeout(() => {
        expect(result).toEqual([{ time: 30, returned: 8 }])
    }, 65)
})
