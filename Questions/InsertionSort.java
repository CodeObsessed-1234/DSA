/*
*
* {10,5,20,2}
* {5,10,20,2} -> first occurence
* {5,10,20,2} -> second occurence
* {2,5,10,20} -> third occurence
*
*/
class InsertionSort{
    public static void main(String[] args) {
        int[] arr = {10,5,20,2};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}