public class BST {

    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val) {
            // Left Subtree

            root.left = insert(root.left,val);
        }

        else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static boolean access(Node root, int val){
        if(root == null) return false;

        if(root.data == val) return true;

        if(root.data > val) {
            // Left Subtree
            return access(root.left, val);
        } else if(root.data < val) {
            // Right Subtree
            return access(root.right, val);
        }

        return false;
    }

   

    public static void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null; 

        for( int x : values ){
            root = insert(root,x);
        }

        inOrder(root);
        System.out.println(" ");

        if(access(root, 7)) {
            System.out.println("Found");
        }else {
            System.out.println("Not Found");
        }
    }
}
