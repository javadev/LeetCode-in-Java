// #Medium #2023_08_31_Time_84_ms_(98.71%)_Space_61.8_MB_(94.52%)

type MultiDimensionalArray = (number | MultiDimensionalArray)[]

const flat = (arr: MultiDimensionalArray, depth: number): MultiDimensionalArray => {
    const result: MultiDimensionalArray = []

    const flatten = (nestedArray: MultiDimensionalArray, currentDepth: number) => {
        for (const element of nestedArray) {
            if (Array.isArray(element) && currentDepth > 0 && currentDepth <= depth) {
                flatten(element, currentDepth - 1)
            } else {
                result.push(element)
            }
        }
    }

    flatten(arr, depth)
    return result
}

export { flat }
