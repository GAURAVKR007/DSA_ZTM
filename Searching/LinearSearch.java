public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int count = 0;

        for (int x: arr) {
            if(x == 70){
                System.out.println("Element is Present");
                count++;
                break;
                
            }
        }

        if(count == 0){
            System.out.println("Element is Not Present");
        }
    }
}