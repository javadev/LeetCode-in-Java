package com_github_leetcode;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class EmployeeTest {
    @Test
    void constructor() {
        Employee employee = new Employee(1, 2, null);
        assertThat(employee.id, equalTo(1));
        assertThat(employee.importance, equalTo(2));
        assertThat(employee.subordinates, equalTo(null));
    }
}
