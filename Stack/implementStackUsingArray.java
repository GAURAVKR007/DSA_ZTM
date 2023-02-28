import java.util.ArrayList;
import java.util.List;

class MyArrayStack {
    List<Integer> stack = new ArrayList<>();
    int size = 0;
    int top = -1;
    public void push(int data){
        stack.add(data);
        top++;size++;
    }

    public void pop(){
        if(top>=0){
            stack.remove(top);
            top--;size--;
        }else{
            System.out.println("Stack Underflow");
        }
    }

    public void peek(){
        if(top>=0){
            System.out.println(stack.get(top));
        }else{
            System.out.println("Stack is Empty");
        }
    }

    public void isEmpty() {
        if(size>0){
            System.out.println("Stack has "+size+"Element");
        }else{
            System.out.println("Stack is Empty");
        }
    }


}

public class implementStackUsingArray {
    public static void main(String[] args) {
        MyArrayStack stack = new MyArrayStack();

    


    stack.push(1);
    stack.push(5);
    stack.isEmpty();
    stack.pop();
    stack.isEmpty();
    stack.peek();
    stack.pop();
    stack.pop();
    stack.peek();
    }
    
}
