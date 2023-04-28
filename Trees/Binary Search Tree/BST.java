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

    public static Node delete(Node root, int val){
        if(root.data > val) {
            // Left Subtree
            root.left = delete(root.left, val);
        }
        else if(root.data < val){
            // Right Subtree
            root.right = delete(root.right, val);
        } else {
            // root.data == val;

            // CASE 1 : 

            if(root.left == null && root.right == null) {
                return null;
            }

            // CASE 2 :

            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            // CASE 3:
            
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }


    public static Node inorderSuccessor(Node root) {
        while(root.left != null){
            root = root.left;
        }

        return root;
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

        delete(root, 4);
        inOrder(root);
        System.out.println(" ");
    }
}
