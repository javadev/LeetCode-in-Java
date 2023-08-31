// tslint:disable:no-magic-numbers
import { TimeLimitedCache } from 'src/main/java/g2601_2700/s2622_cache_with_time_limit/solution'
import { expect, test } from 'vitest'

test('TimeLimitedCache', async () => {
    var obj = new TimeLimitedCache()
    obj.set(1, 42, 100)
    expect(obj.get(1)).toEqual(42)
    expect(obj.count()).toEqual(1)
    const sleep = (ms) => new Promise((resolve) => setTimeout(() => resolve(), ms))
    await sleep(50)
    expect(obj.get(1)).toEqual(42)
    expect(obj.count()).toEqual(1)
    await sleep(100)
    expect(obj.get(1)).toEqual(-1)
    expect(obj.count()).toEqual(0)
})
