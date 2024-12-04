import java.io.*;
import java.util.*;
class Solution{
    public static void main(String[] args) {
        System.out.println(longestSubSequence(new int[]{100,4,200,1,3,2}));
    }
    // Problem-5
    static int longestSubSequence(int arr[])
    {
        int n = arr.length;
        HashSet<Integer> S = new HashSet<Integer>();
        int ans = 0;

        for (int i = 0; i < n; ++i)
            S.add(arr[i]);

        for (int i = 0; i < n; ++i) {
            if (!S.contains(arr[i] - 1)) {
                int j = arr[i];
                while (S.contains(j))
                    j++;
                if (ans < j - arr[i])
                    ans = j - arr[i];
            }
        }
        return ans;
    }

}