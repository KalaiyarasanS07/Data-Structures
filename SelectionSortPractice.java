import java.util.Arrays;

public class SelectionSortPractice {
    int[] arr;
    SelectionSortPractice(int[] arr){
        this.arr = arr;
    }
    public void sort(){
        for(int i =0;i<arr.length;i++){
            int minIndex=i;//Here we are storing index of each element as considering minimum element
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;//if the elements after the element in minIndex in array if that is lesser than the minIndex then we are storing that element index as minimun Index  
                }
            }
            int temp = arr[i];//Here we are declaring temp variable to have a store i element before swapping 
            arr[i] = arr[minIndex];//now we are moving the element in minIndex in the place of element which is compared 
            arr[minIndex] = temp;//then we are moving the element in i to the place of minimum element 
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        SelectionSortPractice ss = new SelectionSortPractice(new int[]{6,4,7,3,8,1});
        ss.sort();
    }
}
