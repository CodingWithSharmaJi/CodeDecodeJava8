/*
1. Two Sum
Easy
Topics
premium lock icon
Companies
Hint
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
package namsteDSA.Array;

import java.util.Scanner;

public class TwoSum{
    public static int[] twoSum(int[] nums, int target) {
        int sum=0,k=0;
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==target)
                res[k++]=i;
        }
        int newArray[]=new int[res.length];
        for(int i=0;i<res.length;i++){
            newArray[k++]=res[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
       int arr[]={2,7,11,15};
       int target = 9;
        int array[]=twoSum(arr,target);
        display(array);
    }
    public static void display(int[] array){
        for(Integer x : array){
            System.out.print(x+"\t");
        }
    }
}
