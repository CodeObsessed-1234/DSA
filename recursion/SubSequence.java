import java.util.*;

/*
 *  str = "abc"
 *  {"","a","b","c","ab","bc","ac","abc"}
 */

public class SubSequence {
    public static void main(String[] args) {
        System.out.println(getSS("abcdkndkgndkgnvdkngdkgsnvkcnbknfg"));
    }

    private static ArrayList<String> getSS(String s) {
        if (s.length() == 0) {
            ArrayList<String> last = new ArrayList<>();
            last.add("");
            return last;
        }
        char firstChar = s.charAt(0);
        String remanString = s.substring(1);
        ArrayList<String> mainRes = new ArrayList<>();
        ArrayList<String> res = getSS(remanString);
        for (String str : res) {
            mainRes.add(str);
            mainRes.add(firstChar + str);
        }
        return mainRes;
    }
}
