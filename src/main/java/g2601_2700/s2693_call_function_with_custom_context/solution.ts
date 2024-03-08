// #Medium #Array #Dynamic_Programming #Matrix #2023_07_28_Time_51_ms_(97.92%)_Space_43_MB_(91.84%)

declare global {
    interface Function {
        callPolyfill(context: Record<any, any>, ...args: any[]): any
    }
}

Function.prototype.callPolyfill = function (context, ...args): any { //NOSONAR
    let fn = this.bind(context)
    return fn(...args)
}

/*
 * function increment() { this.count++; return this.count; }
 * increment.callPolyfill({count: 1}); // 2
 */

export {}
