// #Medium #2023_09_13_Time_50_ms_(90.72%)_Space_45.2_MB_(5.06%)

type Callback = (...args: any[]) => any
type Subscription = {
    unsubscribe: () => void
}

class EventEmitter {
    eventMap: Map<string, Set<Callback>>

    constructor() {
        this.eventMap = new Map()
    }

    subscribe(eventName: string, callback: Callback): Subscription {
        if (this.eventMap.has(eventName)) {
            const set = this.eventMap.get(eventName)
            set.add(callback)
            this.eventMap.set(eventName, set)
        } else {
            const set = new Set<Callback>()
            set.add(callback)
            this.eventMap.set(eventName, set)
        }

        return {
            unsubscribe: () => {
                this.eventMap.get(eventName).delete(callback)
            },
        }
    }

    emit(eventName: string, args: any[] = []): any[] {
        const res = []
        this.eventMap.get(eventName)?.forEach((cb) => res.push(cb(...args))) //NOSONAR
        return res
    }
}

/*
 * const emitter = new EventEmitter();
 *
 * // Subscribe to the onClick event with onClickCallback
 * function onClickCallback() { return 99 }
 * const sub = emitter.subscribe('onClick', onClickCallback);
 *
 * emitter.emit('onClick'); // [99]
 * sub.unsubscribe(); // undefined
 * emitter.emit('onClick'); // []
 */

export { EventEmitter }
