// #Easy #2023_09_14_Time_45_ms_(96.05%)_Space_42.5_MB_(76.36%)

type ToBeOrNotToBe = {
    toBe: (val: any) => boolean
    notToBe: (val: any) => boolean
}

const expect = (val: any): ToBeOrNotToBe => ({
    toBe: (equality: any) => {
        if (val !== equality) {
            throw new Error('Not Equal')
        }
        return true
    },
    notToBe: (equality: any) => {
        if (val === equality) {
            throw new Error('Equal')
        }
        return true
    },
})

/*
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */

export { expect }
