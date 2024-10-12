import java.util.*;

public class DataStructureAndAlgorithm {
    public static void main(String[] args) {
        Stack<String> games = new Stack<>();
        games.push("Football");
        games.push("Handball");
        games.push("Baseball");
        games.push("Basketball");
        games.push("Tennisball");


        System.out.println(reverseStack(games));


        Stack<Integer> integers = new Stack<>();
        integers.push(4);
        integers.push(2);
        integers.push(3);
        integers.push(3);
        integers.push(4);
        integers.push(5);

        System.out.println(removeDuplicates(integers));

    }

    // Stack and it accepts what ever data type as input and reverse them
    public static <T> Stack<T> reverseStack(Stack<T> inputStack){
        Stack<T> reversedStack = new Stack<>();
        while (!inputStack.isEmpty()){
            reversedStack.push(inputStack.pop());
        }
        return reversedStack;
    }


    //  return stack after removing duplicates in the original order
    public static Stack<Integer> removeDuplicates(Stack<Integer> input) {
        HashSet<Integer> seen = new HashSet<>();
        Stack<Integer> usedToHoldStack = new Stack<>();
        while (!input.isEmpty()){
            Integer topElement = input.pop();
            if (!seen.contains(topElement)){
                seen.add(topElement);
                usedToHoldStack.push(topElement);
            }
        }
        // To revert the stack to original stack as usedToHoldStack variable contain reverted stack
        while (!usedToHoldStack.isEmpty()){
            input.push(usedToHoldStack.pop());
        }

        return input;
    }

    //// Given an array of integers, find the indices of two elements that sum up to the target value
    public static int[] twoSum(int[] input, int target){
        for (int i = 0; i<input.length; i++){
            for (int j = i+1; j<input.length; j++){
                if (input[i] + input[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("Not found");
    }


// Determine if the given number is a palindrome (reads the same backward as forward)
    public static boolean isPalindrome(int number){
        int reminder = 0;
        int reversedNumber = 0; // used to hold reversed number
        int originalNumber = number;
        while (number > 0){
            reminder = number % 10;
            reversedNumber = (reversedNumber * 10) + reminder;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
}