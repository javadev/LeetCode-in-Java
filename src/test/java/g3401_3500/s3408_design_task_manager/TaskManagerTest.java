package g3401_3500.s3408_design_task_manager;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class TaskManagerTest {
    @Test
    void test() {
        // Initializes with three tasks for Users 1, 2, and 3.
        TaskManager taskManager =
                new TaskManager(
                        List.of(List.of(1, 101, 10), List.of(2, 102, 20), List.of(3, 103, 15)));
        // Adds task 104 with priority 5 for User 4.
        taskManager.add(4, 104, 5);
        // Updates priority of task 102 to 8.
        taskManager.edit(102, 8);
        // return 3. Executes task 103 for User 3.
        assertThat(taskManager.execTop(), equalTo(3));
        // Removes task 101 from the system.
        taskManager.rmv(101);
        // Adds task 105 with priority 15 for User 5.
        taskManager.add(5, 105, 15);
        // return 5. Executes task 105 for User 5.
        assertThat(taskManager.execTop(), equalTo(5));
    }
}
