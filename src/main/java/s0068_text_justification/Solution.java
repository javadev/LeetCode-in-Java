package s0068_text_justification;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        // Trying to gauge the number of lines so the ArrayList doesn't need to resize
        List<String> output = new ArrayList<>((words.length + 1) / (1 + maxWidth / 7));
        StringBuilder sb = new StringBuilder(maxWidth); // Setting StringBuilder capacity also
        int lineTotal = 0;
        int numWordsOnLine = 0;
        int startWord = 0;

        // looping until the 2nd last word, since we're checking words[i + 1] for
        // overflows
        for (int i = 0; i < words.length - 1; i++) {
            lineTotal += words[i].length();
            numWordsOnLine++; // tracking line length + #words

            // checking if the next word causes an overflow
            if (lineTotal + numWordsOnLine + words[i + 1].length() > maxWidth) {
                if (numWordsOnLine == 1) { // if only one word fits on the line...
                    sb.append(words[i]); // append word
                    while (lineTotal++ < maxWidth) sb.append(' '); // pad right with spaces
                } else {
                    int extraSp =
                            (maxWidth - lineTotal) % (numWordsOnLine - 1); // # of extra spaces

                    // Creating the line
                    for (int j = startWord; j < (startWord + numWordsOnLine - 1); j++) {
                        sb.append(words[j]); // appending the word
                        if (extraSp-- > 0) sb.append(' '); // appending an extra space, if required
                        // appending the rest of the required spaces
                        for (int k = 0; k < (maxWidth - lineTotal) / (numWordsOnLine - 1); k++)
                            sb.append(' ');
                    }
                    sb.append(
                            words[
                                    startWord
                                            + numWordsOnLine
                                            - 1]); // appending the last word of the line
                }
                output.add(sb.toString()); // adding to output list
                // reset everything for next line
                startWord = i + 1; // keeping track of the first word for next line
                numWordsOnLine = lineTotal = 0; // resetting these to 0 for processing next line
                sb = new StringBuilder(maxWidth); // need a new StringBuilder for the next line
            }
        }
        // handling the final line (no justification, right padded with spaces)
        lineTotal = 0;
        for (int i = startWord; i < words.length; i++) {
            lineTotal += words[i].length();
            sb.append(words[i]);
            if (lineTotal++ < maxWidth) sb.append(' ');
        }
        while (lineTotal++ < maxWidth) sb.append(' '); // padding right side with spaces
        output.add(sb.toString()); // add the final line to output list
        return output;
    }
}
