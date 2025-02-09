// public class CountNumBadPairs {
//     public static long countBadPairs(int[] nums) {
//         // 4 1 3 3 -> {4,1} ,{4,3} and so on..
//         int i=0,j=i+1;
//         long count=0;
//         while(i<j && i<nums.length){
//             if(j==nums.length){
//                 ++i;
//                 j=i+1;
//                 continue;
//             }
//             if(j-i!=nums[j]-nums[i]) ++count;
//             ++j;
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5}; 
//         System.out.println(countBadPairs(arr));
//     }
// }

public class CountNumBadPairs {
    int count = 0;
    public static long countBadPairs(int[] nums) {
        // 4 1 3 3 -> {4,1} ,{4,3} and so on..
        return getAns(nums, i, j);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5}; 
        System.out.println(countBadPairs(arr));
    }
}
