//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Main main = new Main();
        long now = System.currentTimeMillis(); //get current time in milliseconds

        System.out.println(main.findSum(99999999));
        System.out.println(System.currentTimeMillis() - now);
    }

    public int findSum(int n){
        return n * (n + 1) / 2;
    }

//    public int findSum(int n){
//       int sum = 0;
//       for (int  i =1; i <=n; i++){
//           sum += i;;
//       }
//       return sum;
//    }
}