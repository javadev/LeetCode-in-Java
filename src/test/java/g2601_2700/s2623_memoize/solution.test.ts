// tslint:disable:no-magic-numbers
import { memoize } from 'src/main/java/g2601_2700/s2623_memoize/solution'
import { expect, test } from 'vitest'

test('memoize', () => {
    const sum = (a, b) => a + b
    const memoizedSum = memoize(sum)
    expect(memoizedSum(2, 2)).toEqual(4)
    // Returns 4. sum() was called as (2, 2) was not seen before.
    expect(memoizedSum(2, 2)).toEqual(4)
    // Returns 4. However sum() was not called because the same inputs were seen before.
    // Total call count: 1
    expect(memoizedSum(1, 2)).toEqual(3)
    // Returns 3. sum() was called as (1, 2) was not seen before.
    // Total call count: 2
})

test('memoize2', () => {
    const factorial = (n) => (n <= 1 ? 1 : n * factorial(n - 1))
    const memoFactorial = memoize(factorial)
    expect(memoFactorial(2)).toEqual(2)
    // Returns 2.
    expect(memoFactorial(3)).toEqual(6)
    // Returns 6.
    expect(memoFactorial(2)).toEqual(2)
    // Returns 2. However factorial was not called because 2 was seen before.
    // Total call count: 2
    expect(memoFactorial(3)).toEqual(6)
    // Returns 6. However factorial was not called because 3 was seen before.
    // Total call count: 2
})
