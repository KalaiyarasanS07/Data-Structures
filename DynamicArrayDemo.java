import java.util.Iterator;
import java.util.Scanner;

public class DynamicArrayDemo{
    public static void main(String[] args){
        DynamicArray<Integer> obj = new DynamicArray<Integer>();
        Scanner sc = new Scanner(System.in);
        int value;
        int pos;
        while(true){
            System.out.println("--------------------------------");
            System.out.println("---------DynamicArrayDemo----------");
            System.out.println("1. Add a value at end");
            System.out.println("2.Insert a value at position");
            System.out.println("3. Remove a value at position");
            System.out.println("4.Display the list ");
            System.out.println("5.Exit");

            System.out.println("Enter a number:");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter a value to be added: ");
                    value = sc.nextInt();
                    obj.add(value);
                    break;

                case 2:
                    System.out.println("Enter a position: ");
                    pos = sc.nextInt();
                    System.out.println("Enter a value: ");
                    value = sc.nextInt();
                    obj.insert(pos, value);
                    break;
                case 3:
                    System.out.println("Enter a position: ");
                    pos = sc.nextInt();
                    obj.delete(pos);
                    break;
                case 4:
                    obj.disp();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid input");
            }

        }
    } 
}
class DynamicArray<T> implements Iterable<T>{
    private static final int initialCapacity = 16;
    private int size;
    private T arr[];
    private int capacity;

    DynamicArray(){
        size=0;
        arr = (T[]) new Object[initialCapacity];
        capacity = initialCapacity;
    }
    public void add(T value){
        if(size==capacity){
            expandArray();
        }
        arr[size]=value;
        size++;
    }
    private void expandArray(){
        capacity *= size;
        arr = java.util.Arrays.copyOf(arr,capacity);
    }

    public void insert(int pos,T value){
        if(size==capacity){
            expandArray();
        }
        for(int i= size-1;i>= pos;i--){
            arr[i+1]=arr[i];
        }
        arr[pos]=value;
        size++;
    }
    public void delete(int pos){
        for(int i = pos+1;i<=size;i++){
            arr[i-1]=arr[i];
        }
        size--;
    }
    public void disp(){
        System.out.println("The Elements in Lists are: ");
        for(int i=0;i<=size;i++){
            System.out.print(arr[i]+",");
        }
    }

    public Iterator<T> iterator(){
        return new Iterator<T>(){
            int index=0;

            public T next(){
                return arr[index++];
            }
            public boolean hasNext(){
                if (index < (size-1)){
                    return true;
                }
                else{
                    return false;
                }
            }
        };
    }
}