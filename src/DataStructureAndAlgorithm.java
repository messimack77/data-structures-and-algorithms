import java.util.*;

public class DataStructureAndAlgorithm {
    public static void main(String[] args) {

        String sentence = "I love you !";
        System.out.println(lengthOfLastWordInTheSentence(sentence));

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

    //Given a sorted array of distinct integers and a target value, return the index if the target is found.
    // If not, return the index where it would be if it were inserted in order.
    public static int searchInsert(int[] nums, int target){
        for (int i = 0; i<nums.length; i++){
            if (nums[i] == target){
                return target;
            } else if (nums[i] > target){
                return i;
            }
        }
        return nums.length;
    }


    //Length of last word
    public static int lengthOfLastWordInTheSentence(String sentence){
        String[] words = sentence.split(" ");
        String lastWord = words[words.length - 1] ;
        return lastWord.length();
    }

}













