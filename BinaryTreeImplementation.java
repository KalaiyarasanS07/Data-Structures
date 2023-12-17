public class BinaryTreeImplementation {
    static Node root;
    class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            data =val;
            left = null;
            right = null;
        }
    }
    BinaryTreeImplementation(int val){
        root = new Node(val);
    }
    public void insertLeft(Node r,int val){
        Node newNode = new Node(val);
        r.left = newNode;
    }
    public void insertRight(Node r,int val){
        Node newNode = new Node(val);
        r.right = newNode;
    }

    //types of traversal
    public void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    } 

    public void InOrder(Node root){
        if(root!=null){
            InOrder(root.left);
            System.out.print(root.data+" ");
            InOrder(root.right);
        }
    } 
    public void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    } 
    public static void main(String[] args) {
        BinaryTreeImplementation bt = new BinaryTreeImplementation(10);
        bt.insertLeft(root, 5);
        bt.insertRight(root, 15);
        bt.insertLeft(root.left, 3);
        bt.insertRight(root.left, 8);
        bt.insertLeft(root.right, 12);
        System.out.print("Pre order traversal: ");
        bt.preOrder(root);
        System.out.println();
        System.out.print("In order Traversal: ");
        bt.InOrder(root);
        System.out.println();
        System.out.print("Post Order Traversal: ");
        bt.postOrder(root);
        System.out.println();
    }
}
