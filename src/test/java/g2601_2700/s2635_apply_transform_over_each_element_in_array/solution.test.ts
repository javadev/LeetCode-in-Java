// tslint:disable:no-magic-numbers
import { map } from 'src/main/java/g2601_2700/s2635_apply_transform_over_each_element_in_array/solution'
import { expect, test } from 'vitest'

test('map', () => {
    let arr = [1, 2, 3]
    let fn = function plusone(n) {
        return n + 1
    }
    expect(map(arr, fn)).toEqual([2, 3, 4])
})

test('map2', () => {
    let arr = [1, 2, 3]
    let fn = function plusI(n, i) {
        return n + i
    }
    expect(map(arr, fn)).toEqual([1, 3, 5])
})

test('map3', () => {
    let arr = [10, 20, 30]
    let fn = function constant() {
        return 42
    }
    expect(map(arr, fn)).toEqual([42, 42, 42])
})
