// tslint:disable:no-magic-numbers
import { ArrayWrapper } from 'src/main/java/g2601_2700/s2695_array_wrapper/solution'
import { expect, test } from 'vitest'

test('arrayWrapper', () => {
    const obj1 = new ArrayWrapper([1, 2])
    const obj2 = new ArrayWrapper([3, 4])
    expect(obj1 + obj2).toEqual(10)
})

test('arrayWrapper2', () => {
    const obj = new ArrayWrapper([23, 98, 42, 70])
    expect(String(obj)).toEqual('[23,98,42,70]')
})

test('arrayWrapper3', () => {
    const obj1 = new ArrayWrapper([])
    const obj2 = new ArrayWrapper([])
    expect(obj1 + obj2).toEqual(0)
})
