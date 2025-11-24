

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1};
//        System.out.println("Sum: "+maximumSum(arr, 4));
//        System.out.println(findMaxAverage(arr, 4));
        System.out.println(containsNearbyDuplicate(arr, 1));
    }


    public static int maximumSum(int[] nums, int k){
        // 2,6,4,5,2,1,3     k = 4

        int length = nums.length;
        int currentSum = 0;

        //to add the first k numbers
        for (int i = 0; i<k; i++){
            currentSum += nums[i];
        }

        int maxSum = currentSum;
        for (int i = k; i < length; i++){
            currentSum =  currentSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum,currentSum);
        }

        return maxSum;
    }

    public static double findMaxAverage(int[] nums, int k) {
       int length = nums.length;


       int currentSum = 0;
       double currentAverage = 0.0;
       for (int i = 0; i < k; i++){
           currentSum += nums[i];
           currentAverage =  currentSum / k;
       }

      double maxAverage = currentAverage;

       for (int i = k; i<length; i++){
           currentSum = currentSum - nums[i - k] + nums[i];
           currentAverage = currentSum / k;
           maxAverage = Math.max(maxAverage, currentAverage);
       }
       return maxAverage;
    }


    public static boolean containsNearbyDuplicate(int[] nums, int k) {
//        nums = [1, 2, 3, 1, 2, 3]
//        k = 3
       for (int i = 0; i < nums.length; i++){
           for (int j = i+1; j <= k+i && j < nums.length; j++){
               if (nums[i] == nums[j]){
                   return true;
               }
           }
       }
       return false;
    }


}