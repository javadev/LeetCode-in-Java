package g1401_1500.s1417_reformat_the_string;

// #Easy #String #2022_03_26_Time_4_ms_(88.39%)_Space_42.7_MB_(84.19%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String reformat(String s) {
        List<Character> characterList = new ArrayList<>();
        List<Character> numberList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                characterList.add(c);
            } else {
                numberList.add(c);
            }
        }
        if (Math.abs(characterList.size() - numberList.size()) > 1) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            if (characterList.size() > numberList.size()) {
                for (int i = 0; i < characterList.size() - 1; i++) {
                    sb.append(characterList.get(i));
                    sb.append(numberList.get(i));
                }
                sb.append(characterList.get(characterList.size() - 1));
            } else if (characterList.size() == numberList.size()) {
                for (int i = 0; i < numberList.size(); i++) {
                    sb.append(numberList.get(i));
                    sb.append(characterList.get(i));
                }
            } else {
                for (int i = 0; i < numberList.size() - 1; i++) {
                    sb.append(numberList.get(i));
                    sb.append(characterList.get(i));
                }
                sb.append(numberList.get(numberList.size() - 1));
            }
            return sb.toString();
        }
    }
}
