import { promiseAll } from 'src/main/java/g2701_2800/s2721_execute_asynchronous_functions_in_parallel/solution'
import { expect, test } from 'vitest'

test('promiseAll', () => {
    const functions = [() => new Promise((resolve) => setTimeout(() => resolve(5), 200))]
    promiseAll(functions).then((e) => expect(e).toEqual({ t: 200, resolved: [5] }))
})

test('promiseAll2', () => {
    const functions = [
        () => new Promise((resolve) => setTimeout(() => resolve(1), 200)),
        () => new Promise((resolve, reject) => setTimeout(() => reject('Error'), 100)),
    ]
    promiseAll(functions).then((e) => expect(e).toEqual({ t: 100, rejected: 'Error' }))
})

test('promiseAll3', () => {
    const functions = [
        () => new Promise((resolve) => setTimeout(() => resolve(4), 50)),
        () => new Promise((resolve) => setTimeout(() => resolve(10), 150)),
        () => new Promise((resolve) => setTimeout(() => resolve(16), 100)),
    ]
    promiseAll(functions).then((e) => expect(e).toEqual({ t: 150, resolved: [4, 10, 16] }))
})
