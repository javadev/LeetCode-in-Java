// #Easy #2023_09_19_Time_52_ms_(79.26%)_Space_44.6_MB_(77.05%)

function isEmpty(obj: Record<string, any> | any[]): boolean {
    return Object.keys(obj).length === 0
}

export { isEmpty }
