// tslint:disable:no-magic-numbers
import 'src/main/java/g2601_2700/s2693_call_function_with_custom_context/solution'
import { expect, test } from 'vitest'

test('callPolyfill', () => {
    const fn = function add(b) {
      return this.a + b
    }
    const args = [{"a": 5}, 7]
    expect(fn.callPolyfill(...args)).toEqual(12)
})

test('callPolyfill2', () => {
    const fn =  function tax(price, taxRate) {
        return `The cost of the ${this.item} is ${price * taxRate}`
    }
    const args = [{"item": "burger"}, 10, 1.1]
    expect(fn.callPolyfill(...args)).toEqual('The cost of the burger is 11')
})
