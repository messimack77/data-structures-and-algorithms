import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int indexOfTheNumber = BinarySearch.binarySearch(numbers, 4);
        System.out.println(indexOfTheNumber);
    }
}
