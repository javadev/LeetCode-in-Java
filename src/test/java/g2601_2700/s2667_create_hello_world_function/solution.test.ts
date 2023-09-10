// tslint:disable:no-magic-numbers
import { createHelloWorld } from 'src/main/java/g2601_2700/s2667_create_hello_world_function/solution'
import { expect, test } from 'vitest'

test('createHelloWorld', () => {
    const counter = createHelloWorld()
    expect(counter()).toEqual('Hello World')
})

test('createHelloWorld2', () => {
    const counter = createHelloWorld()
    expect(counter({}, null, 42)).toEqual('Hello World')
})
