package g2201_2300.s2296_design_a_text_editor;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class TextEditorTest {
    @Test
    void textEditor() {
        // The current text is "|". (The '|' character represents the cursor)
        TextEditor textEditor = new TextEditor();
        // The current text is "leetcode|".
        textEditor.addText("leetcode");
        assertThat(textEditor.deleteText(4), equalTo(4));
        // The current text is "leet|".
        // 4 characters were deleted.
        // The current text is "leetpractice|".
        textEditor.addText("practice");
        assertThat(textEditor.cursorRight(3), equalTo("etpractice"));
        // The current text is "leetpractice|".
        // The cursor cannot be moved beyond the actual text and thus did not move.
        // "etpractice" is the last 10 characters to the left of the cursor.
        assertThat(textEditor.cursorLeft(8), equalTo("leet"));
        // The current text is "leet|practice".
        // "leet" is the last min(10, 4) = 4 characters to the left of the cursor.
        assertThat(textEditor.deleteText(10), equalTo(4));
        // The current text is "|practice".
        // Only 4 characters were deleted.
        assertThat(textEditor.cursorLeft(2), equalTo(""));
        // The current text is "|practice".
        // The cursor cannot be moved beyond the actual text and thus did not move.
        // "" is the last min(10, 0) = 0 characters to the left of the cursor.
        assertThat(textEditor.cursorRight(6), equalTo("practi"));
        // The current text is "practi|ce".
        // "practi" is the last min(10, 6) = 6 characters to the left of the cursor.
    }
}
