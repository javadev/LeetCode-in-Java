package g0601_0700.s0630_course_schedule_iii;

// #Hard #Array #Greedy #Heap_Priority_Queue

import java.util.Arrays;

public class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a, b) -> a[1] - b[1]);
        int course = 0;
        int time = 0;
        MaxHeap heap = new MaxHeap(courses.length);
        for (int[] cours : courses) {
            if (cours[1] - time >= cours[0]) {
                time += cours[0];
                course++;
                heap.add(cours[0]);
            } else if (cours[0] < heap.getHeap()[0]) {
                int t = heap.pop();
                heap.add(cours[0]);
                time = time - t + cours[0];
            }
        }
        return course;
    }

    static class MaxHeap {
        private final int[] heap;
        private int pin;

        public MaxHeap(int mexLen) {
            this.heap = new int[mexLen];
            this.pin = 0;
        }

        public int[] getHeap() {
            return heap;
        }

        public int getPin() {
            return pin;
        }

        public void setPin(int pin) {
            this.pin = pin;
        }

        public void add(int e) {
            heap[pin] = e;
            int temp = pin;
            pin++;
            while (temp > 0 && heap[(temp - 1) / 2] < e) {
                heap[temp] = heap[(temp - 1) / 2];
                temp = (temp - 1) / 2;
                heap[temp] = e;
            }
        }

        public int pop() {
            int res = heap[0];
            pin--;
            heap[0] = heap[pin];
            int h0 = heap[0];
            int temp = 0;
            while (temp * 2 + 1 < pin) {
                if (temp * 2 + 2 == pin) {
                    if (heap[temp * 2 + 1] > h0) {
                        heap[temp] = heap[temp * 2 + 1];
                        temp = temp * 2 + 1;
                        heap[temp] = h0;
                    } else {
                        break;
                    }
                } else {
                    if (h0 < heap[temp * 2 + 1] || h0 < heap[temp * 2 + 2]) {
                        if (heap[temp * 2 + 1] > heap[temp * 2 + 2]) {
                            heap[temp] = heap[temp * 2 + 1];
                            temp = temp * 2 + 1;
                            heap[temp] = h0;
                        } else {
                            heap[temp] = heap[temp * 2 + 2];
                            temp = temp * 2 + 2;
                            heap[temp] = h0;
                        }
                    } else {
                        break;
                    }
                }
            }
            return res;
        }
    }
}
