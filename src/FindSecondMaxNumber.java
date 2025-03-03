public class FindSecondMaxNumber {

    public static int findSecondNumber(int[] numbers){
       int max = Integer.MIN_VALUE;
       int secondMax = Integer.MIN_VALUE;
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] > max){
                secondMax = max;
                max = numbers[i];
            } else if (numbers[i] > secondMax && numbers[i] != max) {
                secondMax = numbers[i];
            }
        }
        return secondMax;
    }
}
