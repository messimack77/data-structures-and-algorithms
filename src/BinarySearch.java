public class BinarySearch {


    public static int binarySearch(int[] numbers, int target){

        int left = 0;
        int right = numbers.length;
        while (left<right){
            int mid = (left + right) / 2;
            if (numbers[mid] == target){
                return mid;
            } else if (target > numbers[mid]){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
