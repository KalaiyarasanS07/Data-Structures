public class BinarySearchImplementation {
    private int target;
    private int[] arr;
    BinarySearchImplementation(int[] arr,int t){
        this.arr=arr;
        this.target = t;
    }
    public int BinarySearch(){
        int start = 0;
        int end = arr.length-1;
        boolean asc = false;
        int mid=0;
        if(arr[start]<arr[end]){
            asc=true;
        }else{
            asc=false;
        }
        while(start<=end){
            mid = (start+end)/2;
            if(asc){
                if(target>arr[mid]){
                    start = mid+1;
                }else if(target<arr[mid]){
                    end=mid-1;
                }else{
                    return mid;
                }
            }else{
                if(target<arr[mid]){
                    start = mid+1;
                }else if(target>arr[mid]){
                    end = mid-1;
                }else{
                    return mid;
                }
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        BinarySearchImplementation obj = new BinarySearchImplementation(new int[]{20,15,12,11,8},11);
        System.out.println("Target Element index: "+obj.BinarySearch());
    }
}
