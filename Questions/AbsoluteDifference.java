class AbsoluteDifference{
  public static void main(String[] args){
    int[] arr= new int[]{2,4,8,12,13,17,19};
    int ans = abs(1  ,arr);
    System.out.println(ans);
  }
  static int abs(int target, int[] arr){
    int ciel = -1,floor=-1;
    int start = 0,end = arr.length,mid=0;
    while(start<=end){
      mid=start + (end-start)/2;
      if(arr[mid]==target) return 0;
      else if(arr[mid]<target){
        start = mid+1;
        ciel = start;
      }
      else {
        end = mid-1;
        floor = end;
      }
    }
    
    System.out.println(ciel);
    System.out.println(floor);
    if(floor==-1) return arr[ciel]-target;
    if(ciel==-1) return target-arr[floor];
    return Math.min(target-arr[floor],arr[ciel]-target);
  }
}
