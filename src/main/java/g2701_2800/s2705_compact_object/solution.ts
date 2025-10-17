// #Medium #2023_09_14_Time_80_ms_(88.30%)_Space_53.2_MB_(70.41%)

type Obj = Record<any, any>

function compactObject(obj: Obj): Obj {
    if (Array.isArray(obj)) {
        let retArr = []
        obj.forEach((e, idx) => { //NOSONAR
            if (e) {
                retArr.push(compactObject(e))
            }
        })
        return retArr
    } else if (obj !== null && typeof obj === 'object') {
        let retObj = {}
        for (const key of Object.keys(obj)) {
            if (obj[key]) {
                retObj[key] = compactObject(obj[key])
            }
        }
        return retObj
    }
    return obj
}

export { compactObject }
