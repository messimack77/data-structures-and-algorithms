public class FindTheMissingNumber2 {

    public static int findTheMissingNumber(int[] numbers){
        int n = numbers.length + 1;
        int sum = n * (n + 1) / 2; // The mathematical formula to find the sum of n natural numbers

        //substruct each number to get the missed number
        for (int number : numbers){
            sum = sum-number;
        }
        return sum;
    }
}
