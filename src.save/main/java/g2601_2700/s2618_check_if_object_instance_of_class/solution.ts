// #Medium #2023_08_30_Time_82_ms_(99.55%)_Space_52.1_MB_(79.46%)

function checkIfInstanceOf(obj: any, classFunction: any): boolean {
    if (obj === null || obj === undefined || typeof classFunction !== 'function') return false

    let proto = Object.getPrototypeOf(obj)
    while (proto !== null) {
        if (proto === classFunction.prototype) return true
        proto = Object.getPrototypeOf(proto)
    }
    return false
}

export { checkIfInstanceOf }
