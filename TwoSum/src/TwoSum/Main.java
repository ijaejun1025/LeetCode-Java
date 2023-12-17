package TwoSum;

public class Main {
	public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1:
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        int[] result1 = solution.twoSum(nums1, target1);
        
        System.out.println("Example 1");
        System.out.print("[");
        for(int i = 0; i < result1.length; i++) {
        	if(i==1) {
        		System.out.print(", ");
        	}
        	System.out.print(result1[i]);
        }
        System.out.println("]");
        
        
        // Example 2:
        int[] nums2 = {3,2,4};
        int target2 = 6;

        int[] result2 = solution.twoSum(nums2, target2);
        
        System.out.println("Example 2");
        System.out.print("[");
        for(int i = 0; i < result2.length; i++) {
        	if(i==1) {
        		System.out.print(", ");
        	}
        	System.out.print(result2[i]);
        }
        System.out.println("]");
        
        
        // Example 3:
        int[] nums3 = {3,3};
        int target3 = 6;

        int[] result3 = solution.twoSum(nums3, target3);
        
        System.out.println("Example 3");
        System.out.print("[");
        for(int i = 0; i < result3.length; i++) {
        	if(i==1) {
        		System.out.print(", ");
        	}
        	System.out.print(result3[i]);
        }
        System.out.println("]");
    }
}
