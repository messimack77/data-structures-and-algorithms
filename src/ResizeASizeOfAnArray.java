public class ResizeASizeOfAnArray {



    // resizing an array can be done by creating a new array and
    // copying the elements from the old array to the new one.
    public static int[] resizeAnArraySize(int[] arr, int capacity){ // arr is the old array we have and capacity is the size of the new array we are going to create
        int[] tempArray = new int[capacity];
        for (int i = 0; i<arr.length; i++){
            tempArray[i] = arr[i];
        }
        return tempArray;
    }
}
