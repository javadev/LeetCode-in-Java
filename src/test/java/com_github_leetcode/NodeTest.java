package com_github_leetcode;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Collections;
import org.junit.jupiter.api.Test;

class NodeTest {
    @Test
    void constructor() {
        Node node = new Node();
        assertThat(node.val, equalTo(0));
        assertThat(node.toString(), equalTo("[]"));
    }

    @Test
    void constructor2() {
        Node node = new Node(1);
        assertThat(node.val, equalTo(1));
        assertThat(node.toString(), equalTo("[]"));
    }

    @Test
    void constructor3() {
        Node node = new Node(1, Collections.singletonList(new Node(2)));
        assertThat(node.val, equalTo(1));
        assertThat(node.toString(), equalTo("[2]"));
    }

    @Test
    void constructor4() {
        Node node =
                new Node(
                        1,
                        Collections.singletonList(
                                new Node(2, Collections.singletonList(new Node(3)))));
        assertThat(node.val, equalTo(1));
        assertThat(node.toString(), equalTo("[[3]]"));
    }
}
