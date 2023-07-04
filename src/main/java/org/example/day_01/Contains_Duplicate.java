package org.example.day_01;

import java.util.HashSet;

public class Contains_Duplicate {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.containsDuplicate(new int[]{1,2,3,1}));
    }


    static class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int x : nums){
                if (set.contains(x)) {
                    return true;
                }
                set.add(x);
            }
            return false;
        }
    }

}
