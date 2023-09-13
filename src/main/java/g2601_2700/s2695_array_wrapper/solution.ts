// #Easy #2023_09_13_Time_44_ms_(97.86%)_Space_44.7_MB_(50.13%)

class ArrayWrapper {
    nums: number[]
    constructor(nums: number[]) {
        this.nums = nums
    }

    valueOf() {
        return this.nums.reduce((n, a) => n + a, 0)
    }

    toString() {
        return '[' + this.nums.join(',') + ']'
    }
}

/*
 * const obj1 = new ArrayWrapper([1,2]);
 * const obj2 = new ArrayWrapper([3,4]);
 * obj1 + obj2; // 10
 * String(obj1); // "[1,2]"
 * String(obj2); // "[3,4]"
 */

export { ArrayWrapper }
