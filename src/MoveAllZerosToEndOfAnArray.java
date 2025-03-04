public class MoveAllZerosToEndOfAnArray {
//    0,1,0,4,12

    public static int[] moveAllZerosToEndOfAnArray(int[] numbers){
        // move all zeros to end of the array by maintaining the non-zeros order
        int j = 0;
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i] != 0 && numbers[j] == 0){
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        if (numbers[j] != 0){
            j++;
        }
        }
        return numbers;
    }
}
