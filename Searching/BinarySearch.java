public class BinarySearch {

    public static void binarySearch(int[] arr, int start, int end, int element){
        int mid = start + (end - start)/2;

        if(arr[mid] == element){
            System.out.println("Element is present at index : " + mid);
        }

        if(arr[mid] > element){
            binarySearch(arr, start, mid - 1, element);
        }

        if(arr[mid] < element){
            binarySearch(arr, mid+1, end, element);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int element = 9;
        binarySearch(arr, 0, arr.length -1,element);
    }
}
