import java.util.HashMap;

public class fibonacciMaster {

    public static HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
    public static int calc = 0;
    public static int fibonacci(int n) {
        if (map.containsKey(n)){
            return map.get(n);
        }else {
            calc++;
            if ( n < 2) {
                return n;
            }else{
                map.put(n, fibonacci(n-2) + fibonacci(n-1));
            }
            return map.get(n);
        }
    }
    public static void main(String[] args) {
        System.out.println("Fibonacci number at index : "+ fibonacci(5));
        System.out.println("Calculation performed : "+ calc);
    }
}