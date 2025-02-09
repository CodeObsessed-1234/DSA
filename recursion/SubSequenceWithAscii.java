import java.util.ArrayList;


/*
 *  str = "ab"
 *  {"","a","b","ab","97","98","97b","a98","9798"}
 */

public class SubSequenceWithAscii {
    public static void main(String[] args) {
        System.out.println(getSSWithAscii("abcdkndkgndkgnvdkngdkgsnvkcnbknfg"));
    }

    private static ArrayList<String> getSSWithAscii(String s) {
        if (s.length() == 0) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add("");
            return arr;
        }
        char firstChar = s.charAt(0);
        String remaninString = s.substring(1);
        ArrayList<String> myRes = new ArrayList<>();
        ArrayList<String> res = getSSWithAscii(remaninString);
        for (String str : res) {
            myRes.add(str);
            myRes.add(firstChar + str);
            myRes.add(String.valueOf((int) (firstChar)) + str);
        }
        return myRes;
    }
}
