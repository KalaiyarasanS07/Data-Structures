import java.util.Arrays;

public class InsertionSortPractice {
    int[] arr;
    InsertionSortPractice(int[] arr){
        this.arr = arr;
    }
    public void insertionSort(){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j] = temp;
                }
                else break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        InsertionSortPractice inp = new InsertionSortPractice(new int[]{44,33,22,5,2});
        inp.insertionSort();
    }
}
