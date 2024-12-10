package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    /*给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
    你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
    示例 1 ：
    输入：nums = [2,2,1]
    输出：1

    示例 2 ：
    输入：nums = [4,1,2,1,2]
    输出：4

    示例 3 ：
    输入：nums = [1]
    输出：1*/
    public int singleNumber(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
           int times = map.getOrDefault(nums[i],0);
           map.put(nums[i],times+1);
        }

        map.forEach((k,v) -> {
            if (v==1){
                res.add(k);
            }
        });
        return res.get(0);
    }
    /*给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
    你可以假设数组是非空的，并且给定的数组总是存在多数元素。
    示例 1：
    输入：nums = [3,2,3]
    输出：3

    示例 2：
    输入：nums = [2,2,1,1,1,2,2]
    输出：2*/
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int res =nums[0];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = map.getOrDefault(map.get(nums[i]),0);
            if (++count >= len/2){
                res = nums[i];
                break;

            }
            map.put(nums[i],count);
        }
        return res;
    }
}