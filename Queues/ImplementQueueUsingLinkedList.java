class MyQueue {

    Node head = null;
    Node tail = null;
    int size = 0;

    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(String data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            tail = head;
            size++;
            return;
        }

        tail.next = temp;
        tail = tail.next;
        size++;
    }

    public void dequeue(){
        if(head == null){
            System.out.println("Queue underFlow");
            return;
        }
        size--;
        head = head.next;
    }

    public void peek(){
        if(head == null){
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(head.data);
    }

    public void isEmpty(){
        if(size>0){
            System.out.println("Queue has "+size+" elements");
        }else{
            System.out.println("Queue is Empty");
        }
    }
}

class ImplementQueueUsingLinkedList {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.peek();
        queue.enqueue("Roronoa");
        queue.enqueue("Zoro");
        queue.peek();
        queue.dequeue();
        queue.peek();
        queue.isEmpty();
    }
}