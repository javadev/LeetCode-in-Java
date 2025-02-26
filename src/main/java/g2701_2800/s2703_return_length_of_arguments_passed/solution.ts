// #Easy #2025_02_26_Time_50_ms_(82.03%)_Space_54.95_MB_(7.19%)

type JSONValue = null | boolean | number | string | JSONValue[] | { [key: string]: JSONValue };

function argumentsLength(...args: JSONValue[]): number {
    return args.length
}

export { argumentsLength }
