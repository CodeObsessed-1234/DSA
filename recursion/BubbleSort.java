public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 4, 2 };
        sort(arr, arr.length - 1, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void sort(int arr[], int end, int i) {
        if (end == 0) {
            return;
        }
        if (i < end) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            sort(arr, end, i + 1);
        }
        else sort(arr, end-1, 0);
    }
}
