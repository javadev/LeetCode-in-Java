// tslint:disable:no-magic-numbers
import { checkIfInstanceOf } from 'src/main/java/g2601_2700/s2618_check_if_object_instance_of_class/solution'
import { expect, test } from 'vitest'

test('checkIfInstanceOf', () => {
    let func = () => checkIfInstanceOf(new Date(), Date)
    expect(func()).toEqual(true)
})

test('checkIfInstanceOf2', () => {
    let func = () => {
        class Animal {}
        class Dog extends Animal {}
        return checkIfInstanceOf(new Dog(), Animal)
    }
    expect(func()).toEqual(true)
})

test('checkIfInstanceOf3', () => {
    let func = () => checkIfInstanceOf(Date, Date)
    expect(func()).toEqual(false)
})
