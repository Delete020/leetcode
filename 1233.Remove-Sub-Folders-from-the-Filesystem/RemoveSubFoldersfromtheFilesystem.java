import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author Delete020
 * @since 02/09/23 21:30 PM
 */
public class RemoveSubFoldersfromtheFilesystem {
    public List<String> removeSubfolders(String[] folder) {
        ArrayList<String> res = new ArrayList<>();
        HashSet<String> set = new HashSet<>(Arrays.asList(folder));
        for (String s : set) {
            int len = s.length();
            boolean tag = true;
            for (int i = len - 1; i >= 0; --i) {
                if (s.charAt(i) == '/' && set.contains(s.substring(0, i))) {
                    tag = false;
                    break;
                }
            }
            if (tag) res.add(s);
        }
        return res;
    }
}