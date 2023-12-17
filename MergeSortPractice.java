import java.util.Arrays;

public class MergeSortPractice {
    int[] arr;
    MergeSortPractice(){
        this.arr = new int[]{22,44,3,1,43,5,6,7}; 
    }
    public int[] mergeSort(){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        // System.out.println(mid);
        int[] left = Arrays.copyOfRange(arr,0, mid);
        int[] right = Arrays.copyOfRange(arr, mid,arr.length);

        return merge(left,right);
    }
    public int[] merge(int[] left,int[] right){
        int[] join = new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                join[k]=left[i];
                k++;
                i++;
            }else{
                join[k]=right[j];
                k++;
                j++;
            }
        }
        while(i<left.length){
            join[k]=left[i];
            k++;
            i++;
        }
        while(j<right.length){
            join[k]=right[j];
            k++;
            j++;
        }

        return join;
    }

    public static void main(String[] args) {
        MergeSortPractice mp = new MergeSortPractice();
        System.out.println(Arrays.toString(mp.mergeSort()));
    }
}
