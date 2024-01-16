// #Medium #2023_09_18_Time_246_ms_(96.81%)_Space_106_MB_(70.44%)

function join(arr1: any[], arr2: any[]): any[] {
    const result: any = {}
    for (let obj of arr1) {
        result[obj.id] = obj
    }
    for (let obj of arr2) {
        if (result[obj.id]) {
            for (let key in obj) {
                result[obj.id][key] = obj[key]
            }
        } else {
            result[obj.id] = obj
        }
    }
    return Object.values(result)
}

export { join }
