import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 *      array = {10,1,2,7,6,1,5} and target = 8
 * 
 *          ans = [[1, 1, 6], [1, 2, 5], [1, 7], [2, 6]]
 *  
 * 
 * 
 */

class CombinationSum {
    static List<List<Integer>> arr = new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        combination(candidates,target,0,0,new ArrayList<>());
        System.out.println(arr);
        return new ArrayList<>();
    }
    public static void combination(int[] can, int target,int index, int sum, ArrayList<Integer> mid){
        if(target==0){
            arr.add(new ArrayList<>(mid));
            // System.out.println(arr);
            return;
        }
        if(target<0){
           return ;
        }
        for(int i=index;i<can.length;i++){
            if(i > index && can[i] == can[i - 1]) continue;
            mid.add(can[i]);
            combination(can,target -can[i],i+1,sum+can[i],mid);
            mid.remove(mid.size()-1);
        }
    } 
    public static void main(String[] args) {
        int[] can = {10,1,2,7,6,1,5};
        System.out.println(combinationSum(can,8));
    }
}