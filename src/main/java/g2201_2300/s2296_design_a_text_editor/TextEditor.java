package g2201_2300.s2296_design_a_text_editor;

// #Hard #String #Stack #Design #Simulation #Linked_List #Doubly_Linked_List
// #2022_06_17_Time_238_ms_(87.02%)_Space_57.6_MB_(93.83%)

public class TextEditor {
    private final StringBuilder sb;
    private int cursor;

    public TextEditor() {
        sb = new StringBuilder();
        cursor = 0;
    }

    public void addText(String text) {
        sb.insert(cursor, text);
        cursor += text.length();
    }

    public int deleteText(int k) {
        int prevPos = cursor;
        if (cursor - k >= 0) {
            cursor -= k;
            sb.delete(cursor, cursor + k);
        } else {
            sb.delete(0, cursor);
            cursor = 0;
        }
        return prevPos - cursor;
    }

    public String cursorLeft(int k) {
        cursor = Math.max(cursor - k, 0);
        return sb.substring(Math.max(cursor - 10, 0), cursor);
    }

    public String cursorRight(int k) {
        cursor = Math.min(cursor + k, sb.length());
        return sb.substring(Math.max(cursor - 10, 0), cursor);
    }
}

/*
 * Your TextEditor object will be instantiated and called as such:
 * TextEditor obj = new TextEditor();
 * obj.addText(text);
 * int param_2 = obj.deleteText(k);
 * String param_3 = obj.cursorLeft(k);
 * String param_4 = obj.cursorRight(k);
 */
