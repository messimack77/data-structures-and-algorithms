import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {3,4,6,2,5,12,9,8,};

        int[] resizedArray = ResizeASizeOfAnArray.resizeAnArraySize(numbers, 16);

        for (int i = 0; i<resizedArray.length; i++){
            System.out.println(resizedArray[i]);
        }

    }
}
