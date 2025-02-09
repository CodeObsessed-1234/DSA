import java.util.*;

class MazePath {
    public static void main(String[] args) {
//        int arr[2][2] = {{1,2},{3,4}};
        System.out.println(mazePaths(0, 0, 2, 2));
    }

    public static List<String> mazePaths(int currRow, int currCol, int endRow, int endCol) {
        if (currRow == endRow && currCol == endCol) {
            List<String> br = new ArrayList<String>();
            br.add("");
            return br;
        }
        if (currRow > endRow || currCol > endCol) {
            return new ArrayList<String>();
        }
        List<String> mr = new ArrayList<String>();
        List<String> vertical = mazePaths(currRow + 1, currCol, endRow, endCol);
        for (int i = 0; i < vertical.size(); i++) {
            mr.add("V" + vertical.get(i));
        }
        List<String> horizontal = mazePaths(currRow, currCol + 1, endRow, endCol);
        for (int i = 0; i < horizontal.size(); i++) {
            mr.add("H" + horizontal.get(i));
        }
        return mr;
    }
}