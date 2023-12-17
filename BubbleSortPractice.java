import java.util.ArrayList;

public class BubbleSortPractice {
    ArrayList<Integer> arr = new ArrayList<>();
    BubbleSortPractice(){
        arr.add(32);
        arr.add(55);
        arr.add(21);
        arr.add(7);
        arr.add(99);
    }
    public void BubbleSort(){
        for(int i=1;i<arr.size();i++){
            for(int j=0;j<arr.size()-i;j++){
                if(arr.get(j)>arr.get(j+1)){
                    int temp = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);
                }
            }
        }
    }
    public void display() {
        for(int i=0;i<this.arr.size(); i++) {
            System.out.print(this.arr.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        BubbleSortPractice obj = new BubbleSortPractice();
        obj.BubbleSort();
        obj.display();
    }
}
