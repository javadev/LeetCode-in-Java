import { isEmpty } from 'src/main/java/g2701_2800/s2727_is_object_empty/solution'
import { expect, test } from 'vitest'

test('isEmpty', () => {
    expect(isEmpty({ x: 5, y: 42 })).toEqual(false)
})

test('isEmpty2', () => {
    expect(isEmpty({})).toEqual(true)
})

test('isEmpty3', () => {
    expect(isEmpty([null, false, 0])).toEqual(false)
})
