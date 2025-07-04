package com_github_leetcode.random;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class NodeTest {
    @Test
    void constructor() {
        Node node = new Node(0);
        assertThat(node.val, equalTo(0));
        assertThat(node.toString(), equalTo("[[0,null]]"));
    }

    @Test
    void constructor2() {
        Node node = new Node(1);
        assertThat(node.val, equalTo(1));
        assertThat(node.toString(), equalTo("[[1,null]]"));
    }

    @Test
    void constructor3() {
        Node node = new Node(1);
        node.next = new Node(2);
        node.random = new Node(3);
        assertThat(node.val, equalTo(1));
        assertThat(node.toString(), equalTo("[[1,3],[2,null]]"));
    }

    @Test
    void constructor4() {
        Node next = new Node(2);
        next.next = new Node(21);
        next.random = new Node(22);
        Node random = new Node(3);
        random.random = new Node(32);
        Node node = new Node(1);
        node.next = next;
        node.random = random;
        assertThat(node.val, equalTo(1));
        assertThat(node.toString(), equalTo("[[1,3],[2,2],[21,null]]"));
    }
}
