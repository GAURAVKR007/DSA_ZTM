public class SelectionSort {

    public static int[] selectionSort(int[] arr){

        
        for(int i=0; i<arr.length; i++){
            int target = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[target] >= arr[j]){
                    target = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[target];
            arr[target] = temp;

       }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {21,13,7,1,5,2,77,7};
        int[] sortedArr = selectionSort(arr);

        for(int i=0; i<sortedArr.length; i++){
            System.out.print(sortedArr[i] + " ");
        }
    }
}
