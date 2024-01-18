import { addTwoPromises } from 'src/main/java/g2701_2800/s2723_add_two_promises/solution'
import { expect, test } from 'vitest'

test('addTwoPromises', () => {
    const promise1 = new Promise((resolve) => setTimeout(() => resolve(2), 20))
    const promise2 = new Promise((resolve) => setTimeout(() => resolve(5), 60))
    addTwoPromises(promise1, promise2).then((e) => expect(e).toEqual(7))
})

test('addTwoPromises2', () => {
    const promise1 = new Promise((resolve) => setTimeout(() => resolve(10), 50))
    const promise2 = new Promise((resolve) => setTimeout(() => resolve(-12), 30))
    addTwoPromises(promise1, promise2).then((e) => expect(e).toEqual(-2))
})
