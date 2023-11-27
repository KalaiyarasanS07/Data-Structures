import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
    Node head;
    class Node{
        T data;//Date in the node
        Node next;//Reference to the next node
        Node(T val){
            data = val;
            next = null;
        }
    }
    LinkedList(){
        head = null;
    }
    public void insertAtBegining(T val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode; 
        }
    }
    public void insertAtPos(int pos, T val){
        Node newNode = new Node(val);
        Node temp = head;
        if(pos == 0){
            newNode.next = head;//Storing the temp head reference to new node
            head = newNode;//Switching the new node as head
            return;
        }
        for(int i = 0; i < pos; i++){
            temp = temp.next;
            if (temp == null) {
                throw new IndexOutOfBoundsException("Invalid position");
            }
        }
        newNode.next = temp.next;//Storing next reference to the new node from taking it from the previus node.next
        temp.next = newNode;
    }
    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = head.next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>(){
            Node temp = head;
            public boolean hasNext(){
                if(temp==null){
                    return false;
                }
                else{
                    return true;
                }
            }
            public T next(){
                T val = temp.data;
                temp = temp.next;
                return val;
            }
        };
    }
    public void display(LinkedList<String> list){
            Iterator<String> it = list.iterator();//list.iterator returns object we storing in 'it' object;
            while(it.hasNext()){
                System.out.print(it.next()+" ");
            }
    }
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        list.insertAtBegining("apple");
        list.insertAtPos(0, "orange");
        list.insertAtPos(1, "banana");

        System.out.println("----------------");
        System.out.print("Elements in list: ");
        list.display(list);
        System.out.println();
        list.reverse();
        System.out.print("Elements in list after reversing: ");
        list.display(list);
        System.out.println();
    }
}
