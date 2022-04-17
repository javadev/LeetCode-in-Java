package com_github_leetcode.left_right;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class NodeTest {
    @Test
    void constructor() {
        Node node = new Node(1);
        assertThat(node.val, equalTo(1));
        assertThat(node.toString(), equalTo("Node{val=1,left=null,right=null,next=null}"));
    }

    @Test
    void constructor2() {
        Node node = new Node(1, new Node(2), new Node(3), new Node(4));
        assertThat(node.val, equalTo(1));
        assertThat(
                node.toString(),
                equalTo(
                        "Node{val=1,left=Node{val=2,left=null,right=null,"
                                + "next=null},right=Node{val=3,left=null,right=null,next=null},next=Node{val=4,"
                                + "left=null,right=null,next=null}}"));
    }
}
