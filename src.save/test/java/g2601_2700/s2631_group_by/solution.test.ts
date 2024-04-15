// tslint:disable:no-magic-numbers
import 'src/main/java/g2601_2700/s2631_group_by/solution'
import { expect, test } from 'vitest'

test('groupBy', () => {
    let fn = function (item) {
        return item.id
    }
    let array = [{ id: '1' }, { id: '1' }, { id: '2' }].groupBy(fn)
    let result = {
        '1': [{ id: '1' }, { id: '1' }],
        '2': [{ id: '2' }],
    }
    expect(array).toEqual(result)
})

test('groupBy2', () => {
    let fn = function (list) {
        return String(list[0])
    }
    let array = [
        [1, 2, 3],
        [1, 3, 5],
        [1, 5, 9],
    ].groupBy(fn)
    let result = {
        '1': [
            [1, 2, 3],
            [1, 3, 5],
            [1, 5, 9],
        ],
    }
    expect(array).toEqual(result)
})

test('groupBy3', () => {
    let fn = function (n) {
        return String(n > 5)
    }
    let array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].groupBy(fn)
    let result = {
        true: [6, 7, 8, 9, 10],
        false: [1, 2, 3, 4, 5],
    }
    expect(array).toEqual(result)
})
