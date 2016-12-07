package chapter6circulation;

public class IntegerArrayTest {

	

	public static int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    results[0] = i;
                    results[1] = j;
                    return results;
                }
            }
        }
        return null;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {3, 2, 4};
		int target = 6;
		int[] result = twoSum(intArray, target);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
}
