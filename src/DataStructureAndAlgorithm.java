import java.util.Stack;

public class DataStructureAndAlgorithm {
    public static void main(String[] args) {
        Stack<String> games = new Stack<>();
        games.push("Football");
        games.push("Handball");
        games.push("Baseball");
        games.push("Basketball");
        games.push("Tennisball");


        System.out.println(reverseStack(games));
    }

    // Stack and it accepts what ever data type as input and reverse them
    public static <T> Stack<T> reverseStack(Stack<T> inputStack){
        Stack<T> reversedStack = new Stack<>();
        while (!inputStack.isEmpty()){
            reversedStack.push(inputStack.pop());
        }
        return reversedStack;
    }
}