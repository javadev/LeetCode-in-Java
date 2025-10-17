// #Easy #2023_09_19_Time_39_ms_(99.67%)_Space_42.1_MB_(95.49%)

class Calculator {
    init: number

    constructor(value: number) {
        this.init = value
    }

    add(value: number): Calculator { //NOSONAR
        this.init += value
        return this
    }

    subtract(value: number): Calculator { //NOSONAR
        this.init -= value
        return this
    }

    multiply(value: number): Calculator { //NOSONAR
        this.init *= value
        return this
    }

    divide(value: number): Calculator { //NOSONAR
        if (value === 0) throw new Error('Division by zero is not allowed')
        this.init /= value
        return this
    }

    power(value: number): Calculator { //NOSONAR
        this.init = this.init ** value
        return this
    }

    getResult(): number {
        return this.init
    }
}

export { Calculator }
