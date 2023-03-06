class Btree {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }

    Node head = null;

    public void insert(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            return;
        }

        Node curr = head;

        while(true){
            if(val < curr.data){
                //Left
                if(curr.prev == null){
                    curr.prev = newNode;
                    return;
                }
                curr = curr.prev;
            }else{
                //Right
                if(curr.next == null){
                    curr.next = newNode;
                    return;
                }
                curr = curr.next;
            }
        }
    }

    public boolean lookup(int val){
        if(head == null){
            return false;
        }

        Node curr = head;

        while(curr!=null){
            if(val < curr.data){
                curr = curr.prev;
            }else if(val > curr.data){
                curr = curr.next;
            }else{
                return true;
            }
        }

        return false;
    }

    public void traverse(Node curr){

    }
}

public class ImplementBT {
    public static void main(String[] args) {
        Btree tree = new Btree();

        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(20);
        tree.insert(170);
        tree.insert(15);
        tree.insert(1);

       System.out.println(tree.lookup(9));

    }
}
