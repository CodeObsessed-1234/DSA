import java.util.*;

class MazeDiagonalPath {
    public static void main(String[] args) {
        System.out.println(mazeDiagonalPaths(0, 0, 2, 2));
    }

    public static List<String> mazeDiagonalPaths(int currRow, int currCol, int endRow, int endCol) {

        if (currRow == endRow && currCol == endCol) {
            List<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        if (currRow > endRow || currCol > endCol) {
            return new ArrayList<String>();
        }

        List<String> mr = new ArrayList<>();

        List<String> vr = mazeDiagonalPaths(currRow + 1, currCol, endRow, endCol);
        for (String v : vr) {
            mr.add("V" + v);
        }

        List<String> hr = mazeDiagonalPaths(currRow, currCol + 1, endRow, endCol);
        for (String h : hr) {
            mr.add("H" + h);
        }

        List<String> dr = mazeDiagonalPaths(currRow + 1, currCol + 1, endRow, endCol);
        for (String d : dr) {
            mr.add("D" + d);
        }
        return mr;
    }
}