// tslint:disable:no-magic-numbers
import { once } from 'src/main/java/g2601_2700/s2666_allow_one_function_call/solution'
import { expect, test } from 'vitest'

test('once', () => {
    const fn = (a, b, c) => a + b + c
    const onceFn = once(fn)
    expect(onceFn(1, 2, 3)).toEqual(6)
    expect(onceFn(2, 3, 6)).toEqual(undefined)
})

test('once2', () => {
    const fn = (a, b, c) => a * b * c
    const onceFn = once(fn)
    expect(onceFn(5, 7, 4)).toEqual(140)
    expect(onceFn(2, 3, 6)).toEqual(undefined)
    expect(onceFn(4, 6, 8)).toEqual(undefined)
})
