import java.util.Hashtable;

public class HashPractice {
	
	public static void main(String[] args) {
		int[] arr1 = {2,1,4,5};
		int[] arr2 = new int[2];
		System.out.println(twoSum(arr1, arr1.length, 5, arr2));
		
	}
	
	
	private static int[] twoSum(int[] nums, int numsSize, int target, int[] returnSize) {
		Hashtable<Integer, Integer> ht = new Hashtable<>(numsSize);
		for(int i=0; i< nums.length;i++) {
			ht.put(nums[i],i);
		}
		for(int i = 0;i<nums.length;i++) {
			int result = target - nums[i];
			if(ht.containsKey(result)) {
				returnSize[0] = i;
				returnSize[1] = ht.get(result);
			}
		}
		return returnSize;
	}

}
