// #Easy #2023_09_19_Time_124_ms_(86.52%)_Space_57_MB_(53.08%)

type JSONValue = null | boolean | number | string | JSONValue[] | { [key: string]: JSONValue }
type Fn = (value: JSONValue) => number

const sortBy = (arr: JSONValue[], fn: Fn): JSONValue[] => [...arr].sort((a, b) => (fn(a) > fn(b) ? 1 : -1))

export { sortBy }
