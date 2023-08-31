// tslint:disable:no-magic-numbers
import { memoize } from 'src/main/java/g2601_2700/s2630_memoize_ii/solution'
import { expect, test } from 'vitest'

test('memoize', () => {
    let getInputs = () => [
        [2, 2],
        [2, 2],
        [1, 2],
    ]
    let results = [4, 4, 3]
    let fn = function (a, b) {
        return a + b
    }
    let memorized = memoize(fn)
    let inputs = getInputs()
    for (let i = 0; i < inputs.length; i++) {
        expect(memorized(...inputs[i])).toEqual(results[i])
    }
})

test('memoize2', () => {
    let getInputs = () => [
        [{}, {}],
        [{}, {}],
        [{}, {}],
    ]
    let results = [{}, {}, {}]
    let fn = function (a, b) {
        return { ...a, ...b }
    }
    let memorized = memoize(fn)
    let inputs = getInputs()
    for (let i = 0; i < inputs.length; i++) {
        expect(memorized(...inputs[i])).toEqual(results[i])
    }
})

test('memoize3', () => {
    let getInputs = () => {
        const o = {}
        return [
            [o, o],
            [o, o],
            [o, o],
        ]
    }
    let results = [{}, {}, {}]
    let fn = function (a, b) {
        return { ...a, ...b }
    }
    let memorized = memoize(fn)
    let inputs = getInputs()
    for (let i = 0; i < inputs.length; i++) {
        expect(memorized(...inputs[i])).toEqual(results[i])
    }
})
