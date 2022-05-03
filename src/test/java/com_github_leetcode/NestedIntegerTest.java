package com_github_leetcode;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class NestedIntegerTest {
    @Test
    void constructor() {
        NestedInteger nestedInteger = new NestedInteger();
        assertThat(nestedInteger.getInteger(), equalTo(null));
        assertThat(nestedInteger.isInteger(), equalTo(false));
    }

    @Test
    void constructor2() {
        List<NestedInteger> list = Arrays.asList(new NestedInteger());
        NestedInteger nestedInteger = new NestedInteger(list);
        assertThat(nestedInteger.getInteger(), equalTo(null));
        assertThat(nestedInteger.getList(), equalTo(list));
    }

    @Test
    void constructor3() {
        NestedInteger nestedInteger = new NestedInteger(1);
        assertThat(nestedInteger.getInteger(), equalTo(1));
        assertThat(nestedInteger.isInteger(), equalTo(true));
    }
}
