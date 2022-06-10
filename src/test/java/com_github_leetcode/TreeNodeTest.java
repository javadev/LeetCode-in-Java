package com_github_leetcode;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class TreeNodeTest {
    @Test
    void create() {
        TreeNode treeNode = TreeNode.create(Collections.singletonList(1));
        assertThat(treeNode.val, equalTo(1));
        assertThat(treeNode.toString(), equalTo("1"));
    }

    @Test
    void create2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 2));
        assertThat(treeNode.val, equalTo(1));
        assertThat(treeNode.toString(), equalTo("1,2,null"));
    }

    @Test
    void create3() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 2, 3));
        assertThat(treeNode.val, equalTo(1));
        assertThat(treeNode.toString(), equalTo("1,2,3"));
    }

    @Test
    void create4() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, null, 2, 3));
        assertThat(treeNode.val, equalTo(1));
        assertThat(treeNode.toString(), equalTo("1,null,2,3,null"));
    }

    @Test
    void create5() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 2, null, 3));
        assertThat(treeNode.val, equalTo(1));
        assertThat(treeNode.toString(), equalTo("1,2,3,null,null"));
    }

    @Test
    void create6() {
        TreeNode treeNode = TreeNode.create(Collections.emptyList());
        assertThat(treeNode, equalTo(null));
    }

    @Test
    void constructor() {
        TreeNode treeNode = new TreeNode(1, null, null);
        assertThat(treeNode.val, equalTo(1));
        assertThat(treeNode.toString(), equalTo("1"));
    }
}
