public class FindTheMissingNumber {


    public static int findTheMissingNumber(int[] numbers){

        //Fist we need to sort the array in the ascending order
        for (int i = 0; i<numbers.length; i++){
            for (int j = 0; j<numbers.length; j++){
                if (numbers[i] < numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        //Then we can check that if the difference between the consecutive numbers is
        //greater than 1, it means the missed number is between the numbers
        //1,2,3,4,6,7,8 -> the missing number is 5

        int missedNumber = 0;
        for (int j = 1; j<numbers.length; j++){
            if (numbers[j]-numbers[j-1] >1 ){
                missedNumber = numbers[j] - 1;
            }
        }
        return missedNumber;

    }
}
