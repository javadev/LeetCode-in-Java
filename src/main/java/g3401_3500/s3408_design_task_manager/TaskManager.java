package g3401_3500.s3408_design_task_manager;

// #Medium #Hash_Table #Design #Heap_Priority_Queue #Ordered_Set
// #2025_01_06_Time_349_(100.00%)_Space_152.40_(100.00%)

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class TaskManager {

    private TreeSet<int[]> tasks;
    private Map<Integer, int[]> taskMap;

    public TaskManager(List<List<Integer>> tasks) {
        this.tasks = new TreeSet<>((a, b) -> b[2] == a[2] ? b[1] - a[1] : b[2] - a[2]);
        this.taskMap = new HashMap<>();
        for (List<Integer> task : tasks) {
            int[] t = new int[] {task.get(0), task.get(1), task.get(2)};
            this.tasks.add(t);
            this.taskMap.put(task.get(1), t);
        }
    }

    public void add(int userId, int taskId, int priority) {
        int[] task = new int[] {userId, taskId, priority};
        this.tasks.add(task);
        this.taskMap.put(taskId, task);
    }

    public void edit(int taskId, int newPriority) {
        int[] task = taskMap.get(taskId);
        tasks.remove(task);
        taskMap.remove(taskId);
        int[] newTask = new int[] {task[0], task[1], newPriority};
        tasks.add(newTask);
        taskMap.put(taskId, newTask);
    }

    public void rmv(int taskId) {
        this.tasks.remove(this.taskMap.get(taskId));
        this.taskMap.remove(taskId);
    }

    public int execTop() {
        if (this.tasks.isEmpty()) {
            return -1;
        }
        int[] task = this.tasks.pollFirst();
        this.taskMap.remove(task[1]);
        return task[0];
    }
}

/*
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */
