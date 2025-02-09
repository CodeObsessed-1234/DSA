import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        permu(arr,0);
    }
    private static void permu(int[] arr, int r){
        if(r==arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i=0;i<arr.length;i++){
            swap(arr,i,r);
            permu(arr,r+1);
            swap(arr,r,i);
        }
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
