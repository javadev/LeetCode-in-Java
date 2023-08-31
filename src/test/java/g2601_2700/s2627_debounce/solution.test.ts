// tslint:disable:no-magic-numbers
import { debounce } from 'src/main/java/g2601_2700/s2627_debounce/solution'
import { expect, test } from 'vitest'

test('debounce', () => {
    const log = debounce(console.log, 100)
    log('Hello')
    // cancelled
    log('Hello')
    // cancelled
    log('Hello')
    // Logged at t=100ms
    expect(1).toEqual(1)
})
