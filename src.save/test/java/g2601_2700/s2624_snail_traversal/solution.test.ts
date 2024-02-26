// tslint:disable:no-magic-numbers
import 'src/main/java/g2601_2700/s2624_snail_traversal/solution'
import { expect, test } from 'vitest'

test('snail', () => {
    let nums = [19, 10, 3, 7, 9, 8, 5, 2, 1, 17, 16, 14, 12, 18, 6, 13, 11, 20, 4, 15].snail(5, 4)
    let result = [
        [19, 17, 16, 15],
        [10, 1, 14, 4],
        [3, 2, 12, 20],
        [7, 5, 18, 11],
        [9, 8, 6, 13],
    ]
    expect(nums).toEqual(result)
})

test('snail2', () => {
    let nums = [1, 2, 3, 4].snail(1, 4)
    let result = [[1, 2, 3, 4]]
    expect(nums).toEqual(result)
})

test('snail3', () => {
    let nums = [1, 3].snail(2, 2)
    let result = []
    expect(nums).toEqual(result)
})
