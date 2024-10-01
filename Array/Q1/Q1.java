/*
 * Move all negative numbers to beginning and positive to end with constant extra space
 * */

class Q1 {

    private void movePositiveNegative(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            if (arr[low] > 0 && arr[high] < 0) {
                swap(arr, low, high);
                low++;
                high--;
            }
            if (arr[low] < 0 && arr[high] > 0) {
                ++low;
                --high;
            }
            if (arr[low] < 0 && arr[high] < 0) ++low;
            if (arr[low] > 0 && arr[high] > 0) --high;
        }

        //print array or answer
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        Q1 q1 = new Q1();
        q1.movePositiveNegative(arr);
    }
}