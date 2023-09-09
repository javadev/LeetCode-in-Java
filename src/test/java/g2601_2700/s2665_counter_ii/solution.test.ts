// tslint:disable:no-magic-numbers
import { createCounter } from 'src/main/java/g2601_2700/s2665_counter_ii/solution'
import { expect, test } from 'vitest'

test('createCounter', () => {
    const counter = createCounter(5)
    expect(counter.increment()).toEqual(6)
    expect(counter.reset()).toEqual(5)
    expect(counter.decrement()).toEqual(4)
})

test('createCounter2', () => {
    const counter = createCounter(0)
    expect(counter.increment()).toEqual(1)
    expect(counter.increment()).toEqual(2)
    expect(counter.decrement()).toEqual(1)
    expect(counter.reset()).toEqual(0)
    expect(counter.reset()).toEqual(0)
})
