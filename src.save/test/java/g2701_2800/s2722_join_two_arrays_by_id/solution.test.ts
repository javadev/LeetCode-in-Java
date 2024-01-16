import { join } from 'src/main/java/g2701_2800/s2722_join_two_arrays_by_id/solution'
import { expect, test } from 'vitest'

test('join', () => {
    const arr1 = [
        { id: 1, x: 1 },
        { id: 2, x: 9 },
    ]
    const arr2 = [{ id: 3, x: 5 }]

    const result = [
        { id: 1, x: 1 },
        { id: 2, x: 9 },
        { id: 3, x: 5 },
    ]
    expect(join(arr1, arr2)).toEqual(result)
})

test('join2', () => {
    const arr1 = [
        { id: 1, x: 2, y: 3 },
        { id: 2, x: 3, y: 6 },
    ]
    const arr2 = [
        { id: 2, x: 10, y: 20 },
        { id: 3, x: 0, y: 0 },
    ]

    const result = [
        { id: 1, x: 2, y: 3 },
        { id: 2, x: 10, y: 20 },
        { id: 3, x: 0, y: 0 },
    ]
    expect(join(arr1, arr2)).toEqual(result)
})

test('join3', () => {
    const arr1 = [{ id: 1, b: { b: 94 }, v: [4, 3], y: 48 }]
    const arr2 = [{ id: 1, b: { c: 84 }, v: [1, 3] }]

    const result = [{ id: 1, b: { c: 84 }, v: [1, 3], y: 48 }]
    expect(join(arr1, arr2)).toEqual(result)
})
