// tslint:disable:no-magic-numbers
import { compose } from 'src/main/java/g2601_2700/s2629_function_composition/solution'
import { expect, test } from 'vitest'

test('compose', () => {
    let functions = [(x) => x + 1, (x) => x * x, (x) => 2 * x]
    let x = 4
    const fn = compose(functions)
    expect(fn(x)).toEqual(65)
})

test('compose2', () => {
    let functions = [(x) => 10 * x, (x) => 10 * x, (x) => 10 * x]
    let x = 1
    const fn = compose(functions)
    expect(fn(x)).toEqual(1000)
})

test('compose3', () => {
    let functions = []
    let x = 42
    const fn = compose(functions)
    expect(fn(x)).toEqual(42)
})
