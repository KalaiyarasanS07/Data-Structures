public class StackUsingLinkdedLIst<T> {
    class Node{
        T data;
        Node next;
        Node(T value){
            this.data = value;
            next = null;
        }
    }
    Node top;//top is a pointer refers to recently added node in the linkedlist
    StackUsingLinkdedLIst(){
        top=null;
    } 
    public void push(T value){
        Node newNode = new Node(value);//Here we are creating new node which is to be added in the linkedlist
        newNode.next = top;
        top = newNode;
    }
    public T pop(){
        if(top == null){
            throw new IndexOutOfBoundsException("Empty Stack");
        }
        T tmp = top.data;//here we are storing the data in top node in temporary variable 
        top = top.next;//here we are changing the top pointer to next element so that the popped element is removed from linkedlist
        return tmp;
    }
    public boolean isEmpty(){
        return top==null;//if the top pointer null then it will return true so the linked list shoud be empty
    }
    public T peek(){
        if(top == null){
            throw new IndexOutOfBoundsException("Empty Stack");
        } 
        T tmp = top.data;
        return tmp;
    }
    public static void main(String[] args) {
        StackUsingLinkdedLIst<Integer> arr = new StackUsingLinkdedLIst<>();
        arr.push(4);
        arr.push(6);
        arr.push(8);
        System.out.println("THe last element in the inital list: "+arr.peek());
        arr.pop();
        System.out.println("The last element inthe list after popping: "+arr.peek());
    }
}
