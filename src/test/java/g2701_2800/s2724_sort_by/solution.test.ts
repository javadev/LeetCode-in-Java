import { sortBy } from 'src/main/java/g2701_2800/s2724_sort_by/solution'
import { expect, test } from 'vitest'

test('sortBy', () => {
    expect(sortBy([5, 4, 1, 2, 3], (x) => x)).toEqual([1, 2, 3, 4, 5])
})

test('sortBy2', () => {
    expect(sortBy([{ x: 1 }, { x: 0 }, { x: -1 }], (d) => d.x)).toEqual([{ x: -1 }, { x: 0 }, { x: 1 }])
})

test('sortBy3', () => {
    expect(
        sortBy(
            [
                [3, 4],
                [5, 2],
                [10, 1],
            ],
            (x) => x[1],
        ),
    ).toEqual([
        [10, 1],
        [5, 2],
        [3, 4],
    ])
})
