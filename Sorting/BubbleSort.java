class BubbleSort {

    public static int[] bubbleSort(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;

    }
    public static void main(String[] args) {
        int[] arr = {21,13,7,1,5,2,77,7};
        int[] sortedArr = bubbleSort(arr); 

        for(int i = 0; i < sortedArr.length; i++){
            System.out.print(sortedArr[i] + " ");
        }
    }
}