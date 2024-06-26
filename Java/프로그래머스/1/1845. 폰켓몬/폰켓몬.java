import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet <Integer> hash = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++)
            hash.add(nums[i]);
        
        if (hash.size() >= nums.length / 2)
            answer = nums.length / 2;
        else
            answer = hash.size();
        
        return answer;
    }
}