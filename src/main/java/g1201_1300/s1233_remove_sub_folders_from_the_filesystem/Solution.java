package g1201_1300.s1233_remove_sub_folders_from_the_filesystem;

// #Medium #Array #String #Trie #2022_03_12_Time_32_ms_(96.54%)_Space_51.8_MB_(87.12%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Set<String> paths = new HashSet<>();
        Collections.addAll(paths, folder);

        List<String> res = new ArrayList<>();
        for (String f : folder) {
            int lastSlash = f.lastIndexOf("/");
            boolean isSub = false;
            while (lastSlash > 0) {
                String upperDir = f.substring(0, lastSlash);
                if (paths.contains(upperDir)) {
                    isSub = true;
                    break;
                }
                lastSlash = upperDir.lastIndexOf("/");
            }
            if (!isSub) {
                res.add(f);
            }
        }

        return res;
    }
}
