// tslint:disable:no-magic-numbers
import { cancellable } from 'src/main/java/g2601_2700/s2650_design_cancellable_function/solution'
import { expect, test } from 'vitest'

test('cancellable', () => {
    const generatorFunction = function* () {
        return 42
    }
    const generator = generatorFunction()
    const [cancel, promise] = cancellable(generator)
    setTimeout(cancel, 100)
    promise.then((e) => expect(e).toEqual(42))
})

test('cancellable2', () => {
    const generatorFunction = function* () {
        let result = 0
        try {
            yield new Promise((res) => setTimeout(res, 100))
            result += yield new Promise((res) => res(1))
            yield new Promise((res) => setTimeout(res, 100))
            result += yield new Promise((res) => res(1))
        } catch (e) { //NOSONAR
            return result
        }
        return result
    }
    const generator = generatorFunction()
    const [cancel, promise] = cancellable(generator)
    setTimeout(cancel, 150)
    promise.then((e) => expect(e).toEqual(1))
})
