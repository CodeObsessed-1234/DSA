import java.util.*;
class PushZeroesToEnd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int k=0;k<size;k++){
            arr[k] = sc.nextInt();
        }
        sc.close();
        int i=0,j=i+1;
        while(i<j && j<=size-1){
            if(arr[i]==0 && arr[j]>0){
                swap(arr,i,j);
                ++i;
                ++j;
            }
            else if(arr[i]==0 && arr[j]==0){
                ++j;
            }
            else{
                ++i;
                ++j;
            }
        }
        for(int k=0;k<size;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}