// tslint:disable:no-magic-numbers
import { argumentsLength } from 'src/main/java/g2701_2800/s2703_return_length_of_arguments_passed/solution'
import { expect, test } from 'vitest'

test('argumentsLength', () => {
    expect(argumentsLength(5)).toEqual(1)
})

test('argumentsLength2', () => {
    expect(argumentsLength({}, null, '3')).toEqual(3)
})
