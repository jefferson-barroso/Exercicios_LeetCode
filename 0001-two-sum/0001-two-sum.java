import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];
            
            if (numMap.containsKey(complemento)) {
                return new int[]{numMap.get(complemento), i};
            }
            
            numMap.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("Nenhuma solução encontrada");
    }
}
