// #Easy #2023_08_31_Time_41_ms_(98.99%)_Space_42_MB_(96.92%)

declare global {
    interface Array<T> {
        last(): T | -1
    }
}

Array.prototype.last = function () { //NOSONAR
    return this.length !== 0 ? this[this.length - 1] : -1
}

/*
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */

export {}
