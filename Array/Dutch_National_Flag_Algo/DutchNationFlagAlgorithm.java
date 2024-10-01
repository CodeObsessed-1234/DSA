/*
    Q-> Sort Array 0s,1s,2s
        A[] = {0,1,2,1,0,2}
        sorted -> {0,0,1,1,2,2}
 */

class DutchNationalFlagAlgorithm{

    private void sort(int[] arr){
        int low=0,mid=0,high = arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                ++mid;
                ++low;
            }
            else if(arr[mid]==1) ++mid;
            else {
                swap(arr,mid,high);
                --high;
            }
        }
    }

    private void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

}