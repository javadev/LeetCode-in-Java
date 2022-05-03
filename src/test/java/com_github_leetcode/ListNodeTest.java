package com_github_leetcode;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class ListNodeTest {
    @Test
    void constructor() {
        ListNode listNode = new ListNode();
        assertThat(listNode.toString(), equalTo("0"));
    }

    @Test
    void constructor2() {
        ListNode listNode = new ListNode(1);
        assertThat(listNode.toString(), equalTo("1"));
    }

    @Test
    void constructor3() {
        ListNode listNode = new ListNode(3, new ListNode(4));
        assertThat(listNode.toString(), equalTo("3, 4"));
    }

    @Test
    void constructor4() {
        ListNode listNode = new ListNode(3, new ListNode(4, new ListNode(5)));
        assertThat(listNode.toString(), equalTo("3, 4, 5"));
    }
}
