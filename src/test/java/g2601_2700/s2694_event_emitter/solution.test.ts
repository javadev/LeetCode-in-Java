// tslint:disable:no-magic-numbers
import { EventEmitter } from 'src/main/java/g2601_2700/s2694_event_emitter/solution'
import { expect, test } from 'vitest'

test('eventEmitter', () => {
    const emitter = new EventEmitter()
    emitter.emit('firstEvent')
    expect(emitter.emit('firstEvent')).toEqual([])
    emitter.subscribe('firstEvent', function cb1() {
        return 5
    })
    emitter.subscribe('firstEvent', function cb2() {
        return 6
    })
    expect(emitter.emit('firstEvent')).toEqual([5, 6])
})

test('eventEmitter2', () => {
    const emitter = new EventEmitter()
    emitter.emit('firstEvent')
    emitter.subscribe('firstEvent', function cb1(...args) {
        return args.join(',')
    })
    expect(emitter.emit('firstEvent', [1, 2, 3])).toEqual(['1,2,3'])
    expect(emitter.emit('firstEvent', [3, 4, 6])).toEqual(['3,4,6'])
})

test('eventEmitter3', () => {
    const emitter = new EventEmitter()
    const sub = emitter.subscribe('firstEvent', (...args) => args.join(','))
    expect(emitter.emit('firstEvent', [1, 2, 3])).toEqual(['1,2,3'])
    sub.unsubscribe()
    expect(emitter.emit('firstEvent', [4, 5, 6])).toEqual([])
})

test('eventEmitter4', () => {
    const emitter = new EventEmitter()
    const sub1 = emitter.subscribe('firstEvent', (x) => x + 1)
    const sub2 = emitter.subscribe('firstEvent', (x) => x + 2)
    sub1.unsubscribe()
    expect(emitter.emit('firstEvent', [5])).toEqual([7])
})
