// tslint:disable:no-magic-numbers
import { expect as expectFunc } from 'src/main/java/g2701_2800/s2704_to_be_or_not_to_be/solution'
import { expect, test } from 'vitest'

test('expect', () => {
    expect(expectFunc(5).toBe(5)).toEqual(true)
})

test('expect2', () => {
    expect(expectFunc(5).notToBe(null)).toEqual(true)
})
