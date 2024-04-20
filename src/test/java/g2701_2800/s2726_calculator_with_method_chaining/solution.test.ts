import { Calculator } from 'src/main/java/g2701_2800/s2726_calculator_with_method_chaining/solution'
import { expect, test } from 'vitest'

test('calculator', () => {
    const result = new Calculator(10).add(5).subtract(7).getResult()
    expect(result).toEqual(8)
})

test('calculator2', () => {
    const result = new Calculator(2).multiply(5).power(2).getResult()
    expect(result).toEqual(100)
})
