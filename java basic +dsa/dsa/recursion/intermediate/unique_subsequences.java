import java.util.HashSet;

public class unique_subsequences {
    public static void unique_sub(String str, int idx, String newstr, HashSet<String> set) {
        // base case
        if (str.length() == idx) {
            if (set.contains(newstr)) {
                return;
            }
            System.out.println(newstr);
            set.add(newstr);
            return;
        }
        char c = str.charAt(idx);
        // to be
        unique_sub(str, idx + 1, newstr + c, set);
        // not to be
        unique_sub(str, idx + 1, newstr, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<String>();
        unique_sub(str, 0, "", set);
    }

}
