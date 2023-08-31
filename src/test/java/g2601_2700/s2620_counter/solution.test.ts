// tslint:disable:no-magic-numbers
import { createCounter } from 'src/main/java/g2601_2700/s2620_counter/solution'
import { expect, test } from 'vitest'

test('createCounter', () => {
    const counter = createCounter(10)
    expect(counter()).toEqual(10)
    expect(counter()).toEqual(11)
    expect(counter()).toEqual(12)
})

test('createCounter2', () => {
    const counter = createCounter(-2)
    expect(counter()).toEqual(-2)
    expect(counter()).toEqual(-1)
    expect(counter()).toEqual(0)
    expect(counter()).toEqual(1)
    expect(counter()).toEqual(2)
})
