// tslint:disable:no-magic-numbers
import 'src/main/java/g2601_2700/s2619_array_prototype_last/solution'
import { expect, test } from 'vitest'

test('last', () => {
    let nums = [null, {}, 3].last()
    expect(nums).toEqual(3)
})

test('last2', () => {
    let nums = [].last()
    expect(nums).toEqual(-1)
})
