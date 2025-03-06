import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stackOfIntegers = new Stack<>();
        stackOfIntegers.push(7);
        stackOfIntegers.push(3);
        stackOfIntegers.push(4);
        stackOfIntegers.push(8);
        stackOfIntegers.push(2);
        stackOfIntegers.push(5);
        stackOfIntegers.push(1);
        stackOfIntegers.push(6);

        Stack<Integer> sortedStack = SortStack.sortStack(stackOfIntegers);

        for (int i = 0; i<sortedStack.size(); i++){
            System.out.println(sortedStack.get(i));
        }
    }
}
