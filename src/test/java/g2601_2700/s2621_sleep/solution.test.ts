// tslint:disable:no-magic-numbers
import { sleep } from 'src/main/java/g2601_2700/s2621_sleep/solution'
import { expect, test } from 'vitest'

test('sleep', () => {
    let t = Date.now()
    sleep(100).then(() => {
        expect(Date.now() - t).toEqual(100)
    })
})

test('sleep2', () => {
    let t = Date.now()
    sleep(200).then(() => {
        expect(Date.now() - t).toEqual(200)
    })
})
