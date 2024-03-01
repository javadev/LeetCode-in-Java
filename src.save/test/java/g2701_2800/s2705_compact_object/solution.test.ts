// tslint:disable:no-magic-numbers
import { compactObject } from 'src/main/java/g2701_2800/s2705_compact_object/solution'
import { expect, test } from 'vitest'

test('compactObject', () => {
    expect(compactObject([null, 0, false, 1])).toEqual([1])
})

test('compactObject2', () => {
    expect(compactObject({ a: null, b: [false, 1] })).toEqual({ b: [1] })
})

test('compactObject3', () => {
    expect(compactObject([null, 0, 5, [0], [false, 16]])).toEqual([5, [], [16]])
})
