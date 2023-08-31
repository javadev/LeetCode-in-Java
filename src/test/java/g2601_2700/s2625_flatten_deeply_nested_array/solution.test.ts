// tslint:disable:no-magic-numbers
import { flat } from 'src/main/java/g2601_2700/s2625_flatten_deeply_nested_array/solution'
import { expect, test } from 'vitest'

test('flat', () => {
    let arr = [1, 2, 3, [4, 5, 6], [7, 8, [9, 10, 11], 12], [13, 14, 15]]
    let n = 0
    let result = [1, 2, 3, [4, 5, 6], [7, 8, [9, 10, 11], 12], [13, 14, 15]]
    expect(flat(arr, n)).toEqual(result)
})

test('flat2', () => {
    let arr = [1, 2, 3, [4, 5, 6], [7, 8, [9, 10, 11], 12], [13, 14, 15]]
    let n = 1
    let result = [1, 2, 3, 4, 5, 6, 7, 8, [9, 10, 11], 12, 13, 14, 15]
    expect(flat(arr, n)).toEqual(result)
})

test('flat3', () => {
    let arr = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, [9, 10, 11], 12],
        [13, 14, 15],
    ]
    let n = 2
    let result = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
    expect(flat(arr, n)).toEqual(result)
})
