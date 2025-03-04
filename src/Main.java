public class Main {
    public static void main(String[] args) {
        int[] numbers = {0,1,0,4,12};
        int[] sorted = MoveAllZerosToEndOfAnArray.moveAllZerosToEndOfAnArray(numbers);
        for (int i = 0; i<numbers.length; i++){
            System.out.println(sorted[i]);
        }
    }
}
