class MyStack{
    
    Node head = null;
    int size = 0;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void push(String data) {
        Node temp = new Node(data);
        temp.next = head;
        size++;
        head = temp;
    }

    public String pop(){
        if(size!=0){
            String res = head.data;
            head = head.next;
            size--;
            return res;
        }else{
            System.out.println("Stack UnderFlow");
            return "";
        }
    }

    public String peek(){
        if(head == null){
            System.out.println("Stack underflow");
            return "";
        }

        return head.data;
    }

    public void isEmpty(){
        if(size>0){
            System.out.println("Stack has "+size+" elements");
            return;
        }

        System.out.println("Stack is Empty");
    }
}

class ImplementStackUsingLinkedList {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push("hi");
        stack.push("Zoro");
        stack.isEmpty();
        stack.pop();
        stack.isEmpty();
        System.out.println(stack.peek()); 
    }
}