import java.util.Stack;

public class SortStack {
    public static Stack<Integer> sortStack(Stack<Integer> integerStack){
        Stack<Integer> tempStack = new Stack<>();
        //7,3,4 8,2,5,1,6
        while (!integerStack.empty()){
            int topValue = integerStack.pop();
            while (!tempStack.empty() && tempStack.peek() > topValue){
                integerStack.push(tempStack.pop());
            }
            tempStack.push(topValue);
        }
        return tempStack;
    }

}
