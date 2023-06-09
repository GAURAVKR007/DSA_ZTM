public class InsertionSort {

    public static int[] insertionSort(int[] arr){

        for(int i=1; i<arr.length; i++){
            for(int j=0; j<i; j++){
                if(arr[i] < arr[j]){
                    for(int k=i; k>j;k--){
                        int temp = arr[k-1];
                        arr[k-1] = arr[k];
                        arr[k] = temp;
                    }
                }
            }
        }


        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {21,13,7,1,5,2,77,7};
        int[] sortedArr = insertionSort(arr);

        for(int i=0; i<sortedArr.length; i++){
            System.out.print(sortedArr[i] + " ");
        }
    }
}
