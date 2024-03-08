package g1201_1300.s1261_find_elements_in_a_contaminated_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class FindElementsTest {
    @Test
    void findElementsTest() {
        FindElements findElements = new FindElements(TreeNode.create(Arrays.asList(-1, null, -1)));
        assertThat(findElements.find(1), equalTo(false));
        assertThat(findElements.find(2), equalTo(true));
    }

    @Test
    void findElementsTest2() {
        FindElements findElements =
                new FindElements(TreeNode.create(Arrays.asList(-1, -1, -1, -1, -1)));
        assertThat(findElements.find(1), equalTo(true));
        assertThat(findElements.find(3), equalTo(true));
        assertThat(findElements.find(5), equalTo(false));
    }

    @Test
    void findElementsTest3() {
        FindElements findElements =
                new FindElements(TreeNode.create(Arrays.asList(-1, null, -1, -1, null, -1)));
        assertThat(findElements.find(2), equalTo(true));
        assertThat(findElements.find(3), equalTo(false));
        assertThat(findElements.find(4), equalTo(false));
        assertThat(findElements.find(5), equalTo(true));
    }
}
