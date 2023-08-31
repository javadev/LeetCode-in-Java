// tslint:disable:no-magic-numbers
import { filter } from 'src/main/java/g2601_2700/s2634_filter_elements_from_array/solution'
import { expect, test } from 'vitest'

test('filter', () => {
    let arr = [0, 10, 20, 30]
    let fn = function greaterThan10(n) {
        return n > 10
    }
    expect(filter(arr, fn)).toEqual([20, 30])
})

test('filter2', () => {
    let arr = [-2, -1, 0, 1, 2]
    let fn = function plusOne(n) {
        return n + 1
    }
    expect(filter(arr, fn)).toEqual([-2, 0, 1, 2])
})

test('filter3', () => {
    let arr = [1, 2, 3]
    let fn = function firstIndex(n, i) {
        return i === 0
    }
    expect(filter(arr, fn)).toEqual([1])
})
