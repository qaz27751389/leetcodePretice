package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode1 {
    /**
     * 1.两数之和
     * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
     你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     你可以按任意顺序返回答案。
     来源：力扣（LeetCode）
     链接：https://leetcode.cn/problems/two-sum
     著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    //第一种解法 有较高的时间复杂度
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]==nums[j]) {
                    continue;
                }
                if(nums[i]+nums[j]==target){

                    return new int[]{nums[i],nums[j]};
                }
            }
        }
      return null;
    }

    //第二种解法 将数组的下标和值放进map，循环map减少时间复杂度
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5};

        Leetcode1 leetcode1=new Leetcode1();
        System.out.println(Arrays.toString(leetcode1.twoSum(nums,2)));

        System.out.println(Arrays.toString(leetcode1.twoSum2(nums,4)));


    }











}
