class QuickSort {

    public static int partition(int[] arr , int start, int end){
        int pivot = arr[end];
        int i=start - 1;

        for(int j=start; j<end; j++){
            if(arr[j] < pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap wit the pivot
            i++;

                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;

                return i;
    }

    public static void quickSort(int[] arr,int start,int end){

        if(start < end){

        int pivot = partition(arr, start, end);

        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);

        }
    }
    public static void main(String[] args) {
        int[] arr = {21,13,7,1,5,2,77,7,55};
        int n = arr.length;
        quickSort(arr , 0 , n-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}