// tslint:disable:no-magic-numbers
import { inorderTraversal } from 'src/main/java/g2601_2700/s2649_nested_array_generator/solution'
import { expect, test } from 'vitest'

test('inorderTraversal', () => {
    const gen = inorderTraversal([[[6]], [1, 3], []])
    expect(gen.next().value).toEqual(6)
    expect(gen.next().value).toEqual(1)
    expect(gen.next().value).toEqual(3)
    expect(gen.next().value).toEqual(undefined)
})

test('inorderTraversal2', () => {
    const gen = inorderTraversal([])
    expect(gen.next().value).toEqual(undefined)
})
