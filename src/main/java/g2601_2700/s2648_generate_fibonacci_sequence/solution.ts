// #Easy #2023_09_06_Time_42_ms_(98.08%)_Space_43.1_MB_(44.95%)

function* fibGenerator(): Generator<number, any, number> {
    let first = 0
    let second = 1
    let value = 0
    let count = 0
    while (true) {
        if (count <= 1) {
            count++
            yield value++
        } else {
            value = first + second
            first = second
            second = value
            yield value
        }
    }
}

/*
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */

export { fibGenerator }
