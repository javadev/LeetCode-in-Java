// tslint:disable:no-magic-numbers
import { reduce } from 'src/main/java/g2601_2700/s2626_array_reduce_transformation/solution'
import { expect, test } from 'vitest'

test('reduce', () => {
    let nums = [1, 2, 3, 4]
    let fn = function sum(accum, curr) {
        return accum + curr
    }
    let init = 0
    expect(reduce(nums, fn, init)).toEqual(10)
})

test('reduce2', () => {
    let nums = [1, 2, 3, 4]
    let fn = function sum(accum, curr) {
        return accum + curr * curr
    }
    let init = 100
    expect(reduce(nums, fn, init)).toEqual(130)
})

test('reduce3', () => {
    let nums = []
    let fn = function sum(accum, curr) {
        return 0
    }
    let init = 25
    expect(reduce(nums, fn, init)).toEqual(25)
})
