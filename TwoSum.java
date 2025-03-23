import java.util.Arrays;

public class TwoSum {

  public static int[] TwoSum(int[] nums, int target) {
      for ( int i = 0; i < nums.length; i++ ) {
        for ( int j = i + 1; j < nums.length; j++ ) {
          if ( nums[i] + nums[j] == target ) {
          int[] newArray = new int[]{i, j};
            return new int[]{i, j};
          }
        }
      } 
      return new int[]{};
  }
  public static void main(String[] args) {
    int[] nums = {11,15,6,3};
    int target = 9;
    int[] newArray = TwoSum(nums, target);
    System.out.println(Arrays.toString(newArray));
  }
}
