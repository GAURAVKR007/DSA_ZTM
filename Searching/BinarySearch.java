public class BinarySearch {

    public static int binarySearch(int[] arr, int start, int end, int element){

        if (start <= end) {
        int mid = start + (end - start)/2;

        if(arr[mid] == element){
            return mid;
        }

        if(arr[mid] > element){
            return binarySearch(arr, start, mid - 1, element);
        }

        if(arr[mid] < element){
            return binarySearch(arr, mid+1, end, element);
        }

    }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int element = 7;
        int result = binarySearch(arr, 0, arr.length -1,element);

        if(result != -1){
            System.out.println("Element is present at index " + result);
        }else {
            System.out.println("Element is Not Present");
        }
    }
}


