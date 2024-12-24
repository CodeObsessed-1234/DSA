class FindFirstOccurence{
    public static void main(String[] args) {
        int [] arr = {6,8,1,1,8,3,4};
        System.out.println(findIndex(arr, 1, 0));   
    }
    private static int findIndex(int[] arr, int k, int i){
        if (i>=arr.length) {
            return -1;
        }
        if(arr[i]==k) return i;
        return findIndex(arr, k, i+1);
    }
}