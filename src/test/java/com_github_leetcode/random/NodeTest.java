package com_github_leetcode.random;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class NodeTest {
    @Test
    void constructor() {
        Node node = new Node();
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
        Node node = new Node(1, new Node(2), new Node(3));
        assertThat(node.val, equalTo(1));
        assertThat(node.toString(), equalTo("[[1,3],[2,null]]"));
    }

    @Test
    void constructor4() {
        Node node =
                new Node(
                        1,
                        new Node(2, new Node(21), new Node(22)),
                        new Node(3, null, new Node(32)));
        assertThat(node.val, equalTo(1));
        assertThat(node.toString(), equalTo("[[1,3],[2,2],[21,null]]"));
    }
}
